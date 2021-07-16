package creational.factorymethod.head.pizzastore;

import creational.factorymethod.head.pizzafactory.*;
import creational.factorymethod.head.pizza.*;

public class NYPizzaStore extends PizzaStore{
	
	private PizzaFactory factory;
	
	public NYPizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = this.factory.createPizza(type);
		return pizza;
	}
}
