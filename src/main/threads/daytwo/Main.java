package main.threads.daytwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {

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


    }
}
