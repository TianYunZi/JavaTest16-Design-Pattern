package chapter.builder.pattern.item;

import chapter.builder.pattern.packages.Packing;

import java.math.BigDecimal;

public interface Item {
    String name();

    Packing packing();

    BigDecimal price();
}
