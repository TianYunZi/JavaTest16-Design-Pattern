package chapter.builder.pattern.item;

import chapter.builder.pattern.packages.Bottle;
import chapter.builder.pattern.packages.Packing;

import java.math.BigDecimal;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
