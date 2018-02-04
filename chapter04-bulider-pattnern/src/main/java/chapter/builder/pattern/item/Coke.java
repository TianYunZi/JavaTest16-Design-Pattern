package chapter.builder.pattern.item;

import java.math.BigDecimal;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2.89);
    }
}
