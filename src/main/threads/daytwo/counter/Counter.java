package main.threads.daytwo.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable{

    private final AtomicInteger count = new AtomicInteger(0);


    public void increment(){
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

    @Override
    public void run(){
        for (int i = 0; i < 100_000; i++) {
            increment();
        }
    }
}
