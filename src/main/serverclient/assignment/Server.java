package main.serverclient.assignment;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Server {
    public static void main(String[] args) {

        Path file = Path.of("messages.txt");

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("Servern har startat");
            System.out.println("Servern väntar på client");

            while (true) {

                try (Socket socket = serverSocket.accept()) {
                    System.out.println("En klient anslöt!");

                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);

                    String message;

                    while ((message = inputReader.readLine()) != null) {

                        if (message.equalsIgnoreCase("QUIT")) {
                            outputWriter.println("Hejdå");
                            break;
                        }

                        Files.writeString(
                                file,
                                message
                        );




                        System.out.println("Sparade meddelandet " + message);
                        outputWriter.println("Sparat");

                    }
                    System.out.println("Client kopplades ifrån");

                } catch (IOException e) {
                    System.out.println("Fel " + e.getMessage());
                }
            }
        }catch (IOException e){
            System.out.println("Kunde inte starta servern " + e.getMessage());
        }

    }
}
