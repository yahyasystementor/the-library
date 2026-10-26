package test;

import main.unittests.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParamterizedTest {

    private Calculator calculator = new Calculator();


    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "10,5,15",
            "-2,2,0"
    })

    void addShouldReturnExpectedResult(int first,int second, int expected) {
        int actual = calculator.add(first,second);
        assertEquals(expected,actual);
    }


}
