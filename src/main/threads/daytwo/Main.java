package main.threads.daytwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        // List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());

       // List<Integer> numbers = new CopyOnWriteArrayList<>();

        Thread[] threads = new Thread[10];


        for (int i = 0; i < threads.length; i++) {

            ListWriter task = new ListWriter(numbers);

            threads[i] = new Thread(task, "worker-" + i);

            threads[i].start();

        }

        for (Thread thread: threads){
            thread.join();
        }

        System.out.println("Färväntat värde: 10000");
        System.out.println("Faktiskt: " + numbers.size());





    }
}



        /*
        TicketOffice ticketOffice = new TicketOffice();

        BuyTicketTask task1 = new BuyTicketTask(ticketOffice, "Yahya");
        BuyTicketTask task2 = new BuyTicketTask(ticketOffice, "Hadir");

        Thread thread1 = new Thread(task1, "worker-1");
        Thread thread2 = new Thread(task2, "worker-2");


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Antal biljetter kvar? " + ticketOffice.getTickets());


         */
