package main.threads;

public class Main {
    public static void main(String[] args) {


        PrintTask task = new PrintTask("Uppgift A");
        Thread worker = new Thread(task,"worker 1");

        System.out.println("Main innan start");

        worker.start();

        System.out.println("Main efter start");







    }
}

        /*
        String threadName = Thread.currentThread().getName();

        System.out.println("Vi kör på tråden " + threadName);

        for (int i = 0; i < 10; i++) {
            System.out.println("Main räknar " + i);
        }
        System.out.println("Main är färdig");


         */
