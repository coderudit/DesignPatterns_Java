package creational.abstractfactory.head.pizzaingredients;

import creational.factorymethod.head.pizza.PizzaType;

public abstract class PizzaStore {
	
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		//These methods are kept here to make sure pizza process remains unaltered.
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	//This is the factory method
	public abstract Pizza createPizza(PizzaType type);
}
