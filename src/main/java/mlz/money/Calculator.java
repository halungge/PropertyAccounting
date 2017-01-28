package mlz.money;


import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal add(BigDecimal value1, BigDecimal amount2) {
        BigDecimal value = value1.add(amount2);
        return value;
    }

}
