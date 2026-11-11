package main.threads.daytwo;

public class BuyTicketTask implements Runnable{

    private TicketOffice ticketOffice;
    private String customer;

    public BuyTicketTask(TicketOffice ticketOffice, String customer) {
        this.ticketOffice = ticketOffice;
        this.customer = customer;
    }


    @Override
    public void run() {
        boolean sucess = ticketOffice.buyTicket();

        if (sucess){
            System.out.println(customer + " Köpte biljetten!");
        } else {
            System.out.println(customer + " fick inge biljett");
        }

    }
}
