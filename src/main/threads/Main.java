package main.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // sekvensiellt

        long startSequence = System.currentTimeMillis();

        SlowTask task1 = new SlowTask("Task A");
        SlowTask task2 = new SlowTask("Task B");

        task1.run();
        task2.run();

        long endSequence = System.currentTimeMillis();

        System.out.println("Sekventiellt tid " + (endSequence - startSequence) + " ms");


        // Flera trådar
        long startSeq = System.currentTimeMillis();

        Thread thread1 = new Thread(new SlowTask("Uppgift C"), "worker1");
        Thread thread2 = new Thread(new SlowTask("Uppgift D"), "worker2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        long endSeq = System.currentTimeMillis();

        System.out.println("tid med trådar " + (endSeq - startSeq) + " ms");









        /*
        Thread thread1 = new Thread(task1, "Worker-1");
        Thread thread2 = new Thread(task2, "Worker-2");


        thread1.start();
        thread2.start();



         */


    }
}

        /*
        String threadName = Thread.currentThread().getName();

        System.out.println("Vi kör på tråden " + threadName);

        for (int i = 0; i < 10; i++) {
            System.out.println("Main räknar " + i);
        }
        System.out.println("Main är färdig");





        PrintTask task = new PrintTask("Uppgift A");
        Thread worker = new Thread(task,"worker 1");

        System.out.println("Main innan start");

        worker.start();


        System.out.println("Main efter start");





         */


    /*

        SlowTask task1 = new SlowTask("Läsa info");
        SlowTask task2 = new SlowTask("Kontrollera resultat");


        Thread thread1 = new Thread(task1, "Worker-1");
        Thread thread2 = new Thread(task2, "Worker-2");


        thread1.start();
        thread2.start();

        System.out.println("Main väntar på båda trådarna..");

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            System.out.println(" Main blev avbruten");
        }

        System.out.println("Alla uppgifter är klara");



         */