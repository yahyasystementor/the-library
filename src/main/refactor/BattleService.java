package main.refactor;

public class BattleService {


    /**
     * TODO
     * Flytta ut final variablar till enum
     * Refactor den här klassen (Där det behövs)
     * Skriva tester för metoder i Fighter
     */

    // Can be moved to an enum
    private static final int ATTACK_DAMAGE = 10;
    private static final int HEAL_AMOUNT = 10;
    public static final int MIN_HP = 0;


    public void attack(Fighter attacker, Fighter defender){
        int damage = ATTACK_DAMAGE;
        defender.takeDamage(damage);
        printAttackResults(attacker,defender, damage);

        if (defender.getHp() == MIN_HP) {
            System.out.println(defender.getName() + "  Has been defeated");
        }
    }

    public void heal(Fighter fighter){
        int healAmount = HEAL_AMOUNT;
        fighter.heal(healAmount);
        printHealResults(fighter, healAmount);

    }

    private void printHealResults(Fighter fighter, int healAmount) {
        System.out.println(fighter.getName() + " healed " + healAmount);
        System.out.println(fighter.getName() + " Hp: " + fighter.getHp());
    }


    private void printAttackResults(Fighter attacker, Fighter defender, int damage) {
        System.out.println(attacker.getName() + " attacked " + defender.getName());
        System.out.println("Damage: " + damage);
        System.out.println(attacker.getName() + " Hp: " + attacker.getHp());
        System.out.println(defender.getName() + " Hp: " + defender.getHp());
    }




}
