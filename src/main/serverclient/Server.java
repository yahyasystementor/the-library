package main.serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started");
            while (true) {
                System.out.println("Väntar på nästa klient");
                try (Socket client = serverSocket.accept()) {

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

                    PrintWriter printWriter = new PrintWriter(client.getOutputStream(), true);

                    System.out.println("Client connected");
                    String messaage;

                    while ((messaage = bufferedReader.readLine()) != null) {
                        System.out.println("Client: " + messaage);
                        if (messaage.equalsIgnoreCase("QUIT")) {
                            System.out.println("Bye bye");
                            break;
                        }
                        printWriter.println("You wrote: " + messaage);
                    }

                    System.out.println("Client disconnected");
                } catch (IOException e) {
                    System.out.println("Server error " + e.getMessage());
                }

            }

        }
    }
}
