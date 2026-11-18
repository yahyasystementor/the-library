package main.serverclient.multithread;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ClientHandler implements Runnable {


    private final Socket socket;
    private final List<PrintWriter> clients;

    public ClientHandler(Socket socket, List<PrintWriter> clients) {
        this.socket = socket;
        this.clients = clients;
    }

    @Override
    public void run(){

        PrintWriter out = null;
        BufferedReader in = null;
        String name = "Okänt";
        try(Socket client = socket) {

            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);

            String message = in.readLine();

            if (message == null || message.isBlank()){
                return;
            }

            name = message.trim();
            clients.add(out);
            out.println("Välkommen " + name + " Skriv /quit för att lämna.");
            System.out.println(name + " anslöts. Online: " + clients.size());
            String userMessage;

            while((userMessage = in.lines().toString()) != null) {
                if (userMessage.equalsIgnoreCase("/quit")) {
                    break;
                }
            }
            for (PrintWriter reciever : clients) {
                synchronized (reciever) {
                    reciever.println(name + ": " + userMessage);
                }
            }

        } catch (IOException e) {
            System.out.println("Klient error: " + e.getMessage());
        } finally {
            if (out != null) {
                clients.remove(out);
            }
            System.out.println( name + " lämnade: Online: " + clients.size());
        }













    }

}
