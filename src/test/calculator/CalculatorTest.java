package test.calculator;
import main.unittests.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calc;

    // Arrange = Förberedelse

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }


    @AfterEach
    void cleanUp(){
       // Calc doesnt need this but in case you create a test file and want to delete it
    }











    @Test
    @Disabled
    void unFinishedFunction(){

    }



    @Test
    @DisplayName("2 + 3 should equal 5")
    void twoPlusThreeShouldEqualFive(){

        // Act =  Anropet
        int result = calc.add(2,3);

        // Assert = Kontrollen
        assertEquals(5,result);
    }

    @Test
    @DisplayName("-2 + -3 should equal -5")
    void negativeNumbersCanBeAdded(){


        // Act =  Anropet
        int result = calc.add(-2,-3);

        // Assert = Kontrollen
        assertEquals(-5,result);

        // assertEquals();
        // assertTrue();
        // assertFalse();
        // assertNull();
        // assertNotNull();
        // assertThrows();
        // assertAll();



    }

}
