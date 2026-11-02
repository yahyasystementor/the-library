package main.refactor;

public class Fighter {

    private String name;
    private int hp;
    private static final int MAX_HP = 100;


    public Fighter(String name) {
        this.name = name;
        this.hp = MAX_HP;
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

    public void takeDamage(int damage){
        hp = hp - damage;
        if (hp < BattleService.MIN_HP){
            hp = BattleService.MIN_HP;
        }
    }


    public void heal(int healAmount){
        hp = hp + healAmount;
        if(hp > MAX_HP){
            hp = MAX_HP;
        }
    }

}
