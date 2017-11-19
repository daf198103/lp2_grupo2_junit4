package lp2.grupo2.ana_cristina;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void evaluateExpression(){

        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");

        assertEquals(6, sum);
    }
}
