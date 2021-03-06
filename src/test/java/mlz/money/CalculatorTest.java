package mlz.money;

import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void addAmounts(){
        BigDecimal amount1 = new BigDecimal("2.3");
        BigDecimal amount2 = new BigDecimal("2.0");
        assertTrue(new BigDecimal("4.3").compareTo(Calculator.add(amount1, amount2)) == 0);
    }


    @Test
    public void addZeroDoesNotChangeValue(){
        BigDecimal amount1 = new BigDecimal("2.3");
        BigDecimal amount2 = new BigDecimal("0.0");
        assertTrue(amount1.compareTo(Calculator.add(amount1, amount2)) == 0);
    }

    //but.. if it works for these two cases, who guarantees that it will work for all
    // others as well?


    @Test
    public void addNegativeAmount(){
        BigDecimal amount1 = new BigDecimal("2.3");
        BigDecimal amount2 = new BigDecimal("-2.0");
        assertTrue(new BigDecimal("0.3").compareTo(Calculator.add(amount1, amount2))== 0);
    }



}