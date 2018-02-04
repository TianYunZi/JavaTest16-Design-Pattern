package chapter.builder.pattern.item;

import java.math.BigDecimal;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(20.98);
    }
}
