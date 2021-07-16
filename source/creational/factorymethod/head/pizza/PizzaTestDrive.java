package creational.factorymethod.head.pizza;

import creational.factorymethod.head.pizzafactory.*;
import creational.factorymethod.head.pizzastore.*;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new ChicagoPizzaFactory();
		PizzaStore pizzaStore = new NYPizzaStore(pizzaFactory);
		pizzaStore.orderPizza(PizzaType.Cheese);
	}

}
