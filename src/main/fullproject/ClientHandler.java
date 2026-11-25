package main.fullproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private final Socket socket;
    private final Library library;

    public ClientHandler(Socket socket, Library library) {
        this.socket = socket;
        this.library = library;
    }




    @Override
    public void run(){

        try(Socket client = socket) {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            String name = in.readLine();

            if (name == null || name.isBlank()){
                return;
            }


            out.println("Välkommen " + name + ". Kommandon: LIST, STATUS id, BORROW id, RETURN id, QUIT");


            String line;

            while((line = in.readLine()) != null){
                String[] parts = line.split(" ", 2);
                String command = parts[0].toUpperCase();
                if (command.equals("QUIT")){
                    out.println("Bye");
                    break;
                } else if (command.equals("LIST")) {

                    out.println("Katalog");
                    for (Media media: library.getSortedMedia()){
                        out.println(media);
                    }
                 out.println("END");
                } else if(command.equals("STATUS")){
                    Media media = library.getById(parts[1]);
                    if (media == null){
                        out.println("ERROR Okänt ID");

                    } else {
                        out.println("OK " + media);
                    }
                } else if(command.equals("BORROW")){
                    boolean success = library.borrow(parts[1], name);
                    out.println(success ? "OK Utlånad" : "ERROR Inte ledig eller saknas");

                } else if(command.equals("RETURN")){
                    boolean success = library.returnItem(parts[1]);
                    out.println(success ? "OK Återlämnat" : "ERROR Kan inte återlämnas");
                } else {
                    out.println("ERROR Okänt kommando");
                }

            }
        } catch (IOException e) {
            System.out.println("Klientfel " + e.getMessage());
        }

    }

}
