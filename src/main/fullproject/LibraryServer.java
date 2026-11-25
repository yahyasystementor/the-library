package main.fullproject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LibraryServer {
    public static void main(String[] args) {



        Library library = new Library();

        library.addMedia(new Book("1","Pippi långstrump", "Astrid lindgren", 1945));
        library.addMedia(new Book("2","Pippi långstrump", "Astrid lindgren", 1945));
        library.addMedia(new Book("3","Sagan om ringen", "Tolkien", 1954));
        library.addMedia(new Book("5","ABC", "Astrid lindgren", 1964));


        try(ServerSocket server = new ServerSocket(5000)){
            System.out.println("Biblotekets server körs på port 5000");


            while (true){
                Socket socket = server.accept();
                ClientHandler handler = new ClientHandler(socket, library);
                handler.run();
            }
        } catch (IOException e) {
            System.out.println("Serverfel " + e.getMessage());
        }

    }
}
