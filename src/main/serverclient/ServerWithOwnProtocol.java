package main.serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerWithOwnProtocol {


    public static void main(String[] args) throws IOException {

        Protocol protocol = new Protocol();

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started");

            while (true) {


                try (Socket client = serverSocket.accept()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    PrintWriter printWriter = new PrintWriter(client.getOutputStream(), true);


                    System.out.println("Client connected");

                    String messaage;

                    while ((messaage = bufferedReader.readLine()) != null) {
                        System.out.println("SERVER RECEIVED: " + messaage);

                        String response = protocol.reponse(messaage);
                        System.out.println("SERVER RESPONSE: " + response);

                        printWriter.println(response);

                        if (messaage.equalsIgnoreCase("QUIT")) {
                            break;
                        }
                    }

                    System.out.println("Client disconnected");
                } catch (IOException e) {
                    System.out.println("Server error " + e.getMessage());
                }

            }

        } catch ( IOException e ) {
            System.out.println("Server error " + e.getMessage());
        }
    }
}
