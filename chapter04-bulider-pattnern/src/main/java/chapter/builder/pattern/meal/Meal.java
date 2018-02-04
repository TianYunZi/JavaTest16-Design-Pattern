package chapter.builder.pattern.meal;

import chapter.builder.pattern.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        return items.stream().map(Item::price).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }
}
