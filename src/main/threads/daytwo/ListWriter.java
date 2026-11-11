package main.threads.daytwo;

import java.util.List;

public class ListWriter  implements Runnable {



    private List<Integer> numbers;

    public ListWriter(List<Integer> numbers) {
        this.numbers = numbers;
    }


    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
    }


}
