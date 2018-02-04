package chapter.builder.pattern.item;

import java.math.BigDecimal;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2.54);
    }
}
