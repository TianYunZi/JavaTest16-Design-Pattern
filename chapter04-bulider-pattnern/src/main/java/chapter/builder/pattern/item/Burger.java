package chapter.builder.pattern.item;

import chapter.builder.pattern.packages.Packing;
import chapter.builder.pattern.packages.Wrapper;

import java.math.BigDecimal;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();
}
