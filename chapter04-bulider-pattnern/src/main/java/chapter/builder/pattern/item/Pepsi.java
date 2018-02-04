package chapter.builder.pattern.item;

import java.math.BigDecimal;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3.98);
    }
}
