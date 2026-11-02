package test.refactor;

import main.refactor.BattleService;
import main.refactor.Fighter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleServiceTest {

    private BattleService battleService;
    private Fighter player;
    private Fighter enemy;


    @BeforeEach
    public void setUp(){
        battleService = new BattleService();
        player = new Fighter("Yahya");
        enemy = new Fighter("Hadir");
    }


    @Test
    void attackShouldOnlyReduceHpBy10(){
        battleService.attack(player,enemy);


        assertEquals(90, enemy.getHp());
    }


    @Test
    void attackShouldNotReduceHpBelowZero(){

        // Arrange
        enemy.setHp(5);

        // Act
        battleService.attack(player,enemy);

        //Assert
        assertEquals(0, enemy.getHp());
    }

    @Test
    void healShouldIncreaseHpBy10(){
        //Arrange
        player.setHp(50);

        //Act
        battleService.heal(player);

        assertEquals(60, player.getHp());
    }


    @Test
    void healShouldNeverIncreaseHpAbove100(){
        //Arrange
        player.setHp(95);

        //Act
        battleService.heal(player);
        assertEquals(100, player.getHp());
    }



}
