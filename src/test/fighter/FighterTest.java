package test.fighter;

import main.unittests.fighter.Fighter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {


    private Fighter fighter;

    @BeforeEach
    void setUp() {
        fighter = new Fighter();
        fighter.setHp(100);
    }

    @Test
    void attackShouldDoBetween5And15Damage(){
        //Arrange

        //Act
        fighter.attack();


        //Assert
        assertTrue(fighter.getHp() <= 95);
        assertTrue(fighter.getHp() >= 85);

        // Flytta ut den här logiken nedan till ny test
        // assertFalse(fighter.getHp() <= 96);



    }


    @Test
    void attackShouldDoBetween5And15DamageExampleTwo(){
        //Arrange

        int hpBeforeAttack = fighter.getHp();


        //Act
        fighter.attack();


        int hpAfterAttack = fighter.getHp();

        int damage = hpBeforeAttack - hpAfterAttack;

        assertTrue(damage >= 5);
        assertTrue(damage <= 15);

        // Om damage blockeras så kan skadan bli 0 och då får vi fortfarande "true"
        assertTrue(
            damage == 0 || (damage >= 5 && damage <= 15)
        );

    }



    @Test
    void thisIsTheTestForAttackThatReturnsAnInteger(){
        //Arrange


        //Act
        int damage = fighter.attackTest();


        assertTrue(
                damage == 0 || (damage >= 5 && damage <= 15)
        );


        // Om damage blockeras så kan skadan bli 0 och då får vi fortfarande "true"


    }







}
