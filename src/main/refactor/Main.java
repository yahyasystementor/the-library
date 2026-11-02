package main.refactor;

public class Main {
    public static void main(String[] args) {
        BattleService battleService = new BattleService();
        Fighter attacker = new Fighter("Yahya");
        Fighter defender = new Fighter("Hadir");

        battleService.attack(attacker,defender);
        battleService.heal(defender);
    }
}
