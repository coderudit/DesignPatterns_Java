package design_principles.coupling.goodcoupling.contentcoupling_1;

import java.util.Arrays;
import java.util.List;

public class PlaceOrder {
    public static void main(String[] args){
        PizzaFactory pizzaFactory = new PizzaFactory();

        //For customer 1
        pizzaFactory.setPizzaBase("Thin crust");
        List<String> customer1Ingredients = Arrays.asList("Olives");

        System.out.println("Creating Pizza for Customer 1.");
        pizzaFactory.createPizza(customer1Ingredients);

        //For customer 2
        pizzaFactory.setPizzaBase("Thick crust");
        List<String> customer2Ingredients = Arrays.asList("Mushroom");

        System.out.println("Creating Pizza for Customer 2.");
        pizzaFactory.createPizza(customer2Ingredients);
    }
}
