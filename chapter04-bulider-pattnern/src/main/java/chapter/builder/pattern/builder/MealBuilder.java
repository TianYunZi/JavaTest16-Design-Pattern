package chapter.builder.pattern.builder;

import chapter.builder.pattern.item.ChickenBurger;
import chapter.builder.pattern.item.Coke;
import chapter.builder.pattern.item.Pepsi;
import chapter.builder.pattern.item.VegBurger;
import chapter.builder.pattern.meal.Meal;

// TODO: 2018/2/2 实现效果不好 
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
