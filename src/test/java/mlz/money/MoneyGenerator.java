package mlz.money;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.java.lang.IntegerGenerator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MoneyGenerator extends Generator<Money> {

    public MoneyGenerator() {
        super(Money.class);
    }

    @Override
    public Money generate(SourceOfRandomness random, GenerationStatus status) {
        final double value = random.nextDouble(-10000, 10000);
        return new Money(new BigDecimal(value));
    }


}
