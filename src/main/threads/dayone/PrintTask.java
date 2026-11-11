package main.threads.dayone;

public class PrintTask implements Runnable {

    private String taskName;


    public PrintTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {

             String threadName = Thread.currentThread().getName();
            System.out.println("[" + taskName + "] " + threadName + " " + i);

        }
    }
}
