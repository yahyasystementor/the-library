package main.unittests;

import java.util.Random;

public class Fighter {

    private int hp = 100;
    private Random random = new Random();


    public int getHp() {
        return hp;
    }

    public void attack() {
        int damage = random.nextInt(5,15);
        System.out.println(damage);
        hp = hp - damage;
    }


    // THIS IS A DIFFERENT TEST THAN ABOVE CHECK TEST CLASS TO SEE WHICH IT BELONGS TO!
    public int attackTest() {
        boolean hit = random.nextBoolean();

        if (!hit) {
            return 0;
        }
        return random.nextInt(5,15);
    }



    public void setHp(int hp) {
        this.hp = hp;
    }
}
