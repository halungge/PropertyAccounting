package mlz.money;


import java.math.BigDecimal;

public class Calculator {
    private Calculator(){}

    public static BigDecimal add(BigDecimal value1, BigDecimal amount2) {
        return value1.add(amount2);
    }
}
