package design_principles.coupling.badcoupling.contentcoupling_1;

import java.util.ArrayList;
import java.util.List;

public class PizzaFactory {
    String pizzaBase;
    List<String> ingredients;

    public PizzaFactory() {
        this.ingredients = new ArrayList<>();
    }

    public void createPizza() {
        //Pick pizza base
        StringBuilder builder = new StringBuilder();
        builder.append(pizzaBase + "\n");

        //Then add ingredients
        for (var ingredient : ingredients) {
            builder.append(ingredient + "\n");
        }
        System.out.println(builder);
    }
}
