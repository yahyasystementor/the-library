package test.tdd.calc;

import main.tdd.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {




    @Test
    void addShouldReturnTheSumOfTwoNumbers(){
        Calc calc = new Calc();

        int result = calc.add(2,3);

        assertEquals(5, result);
    }

    @Test
    void subtractShouldReturnTheSumOfTwoNumbers(){
        Calc calc = new Calc();

        int result = calc.subtract(2,2);
        assertEquals(0, result);
    }

    @Test
    void multiplyShouldReturnTheSumOfTwoNumbers(){
        Calc calc = new Calc();

        int result = calc.multiply(2,1);

        assertEquals(2,result);
    }

}
