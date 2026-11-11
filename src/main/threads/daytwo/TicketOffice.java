package main.threads.daytwo;

public class TicketOffice{



    private int ticket = 1;

    private final Object lock = new Object();

    public boolean buyTicket(){

        synchronized (lock){
            if (ticket == 0){
                return false;
            }
            ticket--;
            return true;
        }

    }


    public int getTickets(){
        synchronized (lock){
            return ticket;
        }
    }

}
