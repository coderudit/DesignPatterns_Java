package creational.factorymethod.head.pizzafactory;

import creational.factorymethod.head.pizza.*;

public class NYPizzaFactory extends PizzaFactory {
	NYCheesePizza nyCheesePizza;
	public Pizza createPizza(PizzaType type) {
		switch(type) {
		case Cheese:
			return new NYCheesePizza();
		case Greek:
			return new NYGreekPizza();
		case Pepperoni:
			return new NYPepperoniPizza();
		default:
			return null;
		}
	}
}
