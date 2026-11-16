package main.serverclient;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket("127.0.0.1", 5000)) {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Connected: write quit if you want to stop using this service");

            while (true){
                System.out.println("Skriv ett meddelande: ");
                String message = scanner.nextLine();
                printWriter.println(message);
                String response = bufferedReader.readLine();
                if (response == null){
                    System.out.println("Server disconnected");
                    break;
                }
                if (message.equalsIgnoreCase("QUIT")){
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("Connection refused");
            e.printStackTrace();
        }



    }
}
