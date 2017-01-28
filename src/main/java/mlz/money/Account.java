package mlz.money;

import java.math.BigDecimal;
import java.util.List;


public class Account {
    private BigDecimal balance;

    private Account(BigDecimal balance) {
        this.balance = balance.abs();
        this.balance.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public Account(){
        this(new BigDecimal("0.0"));
    }

    public BigDecimal getBalance(){
        return balance;
    }


    public void deposit(Money money){
        balance = Calculator.add(balance, money.value());
    }

    public void withdraw(Money sum){

        BigDecimal addedAmount = Calculator.add(balance, sum.value().negate());
        balance = addedAmount.compareTo(BigDecimal.ZERO) < 0? BigDecimal.ZERO:addedAmount;
    }

    private BigDecimal newBalance(BigDecimal balance, List<Coin> increment){
        return increment.stream().map(m -> m.value()).reduce(balance, Calculator::add);
    }

    public void deposit(List<Coin> coins){
       balance = newBalance(balance, coins);

    }


}
