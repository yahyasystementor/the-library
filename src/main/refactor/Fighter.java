package main.refactor;

public class Fighter {

    private String name;
    private int hp;


    public Fighter(String name) {
        this.name = name;
        this.hp = 100;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
