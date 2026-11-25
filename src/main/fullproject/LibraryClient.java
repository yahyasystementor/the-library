package main.fullproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class LibraryClient implements Runnable{



    private final BufferedReader in;

    public LibraryClient(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run(){
        try {
            String message;
            while((message = in.readLine()) != null){
                System.out.println(message);
            }
        } catch (IOException e) {
            System.out.println("Anslutningen stängdes " + e.getMessage());
        }
    }


    public static void main(String[] args) {



        try {
            Socket socket = new Socket("localhost", 5000);

            Scanner scanner = new Scanner(System.in);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            System.out.println("Ange ditt namn ");

            String name = scanner.nextLine();


            out.println(name);
            Thread receiver = new Thread(new LibraryClient(in));
            receiver.setDaemon(true);
            receiver.start();

            while (scanner.hasNextLine()) {
                String command = scanner.nextLine();
                out.println(command);

                if (command.equalsIgnoreCase("QUIT")){
                    break;
                }
            }

        }catch (IOException e){
            System.out.println("Kunde inte ansluta " + e.getMessage());
        }
    }


}
