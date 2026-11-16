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

            try (Socket client = serverSocket.accept()) {

                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                PrintWriter out = new PrintWriter(client.getOutputStream(), true);

                System.out.println("Client connected");

                String messaage = in.readLine();

                if (messaage != null){
                    System.out.println("Client sent message: " + messaage);
                    out.println("Hej Client, i got your message");
                }

            } catch (IOException e){
                System.out.println("Server error " + e.getMessage());
            }

        }

    }
}
