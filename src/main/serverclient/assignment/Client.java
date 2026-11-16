package main.serverclient.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 5000)) {
            Scanner scanner = new Scanner(System.in);
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            System.out.println("Ansluten till servern");
            System.out.println("Skriv ett text som ska sparas");
            System.out.println("Skriv quit för att avsluta");

            while (true) {
                System.out.println("Meddelande: ... ");
                String message = scanner.nextLine();

                outputWriter.println(message);
                String response = inputReader.readLine();

                if (response == null){
                    System.out.println("Servern kopplades ifrån");
                    break;
                }

                System.out.println("Server "  + response);

                if (message.equalsIgnoreCase("QUIT")){
                    break;
                }
            }

        } catch (IOException e){
            System.out.println("Anslutningsfel " + e.getMessage());
        }

    }
}
