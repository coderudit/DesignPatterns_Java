package design_principles.coupling.badcoupling.contentcoupling_1;

public class PlaceOrder {
    public static void main(String[] args){
        PizzaFactory pizzaFactory = new PizzaFactory();

        //For customer 1
        pizzaFactory.pizzaBase = "Thin crust";
        pizzaFactory.ingredients.add("Capsicum");
        pizzaFactory.ingredients.add("Olives");
        pizzaFactory.ingredients.add("Onions");

        System.out.println("Creating Pizza for Customer 1.");
        pizzaFactory.createPizza();

        //For customer 2
        pizzaFactory.pizzaBase = "Thick crust";
        pizzaFactory.ingredients.add("Jalapeno");
        pizzaFactory.ingredients.add("Peppers");

        System.out.println("Creating Pizza for Customer 2.");
        pizzaFactory.createPizza();
    }
}
