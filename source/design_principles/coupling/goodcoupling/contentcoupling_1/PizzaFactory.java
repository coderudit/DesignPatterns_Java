package design_principles.coupling.goodcoupling.contentcoupling_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaFactory {
    private String pizzaBase;
    private List<String> ingredients;

    public PizzaFactory() {
        this.ingredients = Arrays.asList("Onion", "Capsicum");
    }

    public void setPizzaBase(String pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void createPizza(List<String> additionalIngredients) {
        //Pick pizza base
        StringBuilder builder = new StringBuilder();
        builder.append(this.pizzaBase + "\n");

        //Then base ingredients
        for (var ingredient : ingredients) {
            builder.append(ingredient + "\n");
        }

        //Then additional ingredients
        for (var ingredient : additionalIngredients) {
            builder.append(ingredient + "\n");
        }

        System.out.println(builder);
    }
}
