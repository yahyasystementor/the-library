package main.threads.daytwo.counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(counter);
            threads[i].start();
        }

        for (Thread worker: threads) {
            worker.join();
        }

        System.out.println("Förväntat: 1000000");
        System.out.println("Faktiskt: " + counter.getCount());

    }
}
