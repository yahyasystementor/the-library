package main.serverclient.multithread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    public static void main(String[] args) {

        List<PrintWriter> clients = new CopyOnWriteArrayList<>();
        ExecutorService pool = Executors.newFixedThreadPool(10);

        try (ServerSocket server = new ServerSocket(5000)){

            System.out.println("Chatten är igång på port 5000");
            while (true){
                Socket socket = server.accept();
                ClientHandler handler = new ClientHandler(socket, clients);
                pool.execute(handler);
            }
        } catch (IOException e) {
            System.out.println("Serverfel " + e.getMessage());
        } finally {
            pool.shutdown();
        }
    }
}
