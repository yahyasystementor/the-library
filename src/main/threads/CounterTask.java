package main.threads;

import java.util.Random;

public class CounterTask implements Runnable {


    private Counter counter;
    private int numberOfIncrements;

    public CounterTask(Counter counter, int numberOfIncrements) {
        this.counter = counter;
        this.numberOfIncrements = numberOfIncrements;
    }

    @Override
    public void run(){
        for (int i = 0; i < numberOfIncrements; i++) {
                counter.increment();
        }
    }




}
