package creational.factorymethod.head.pizzafactory;

import creational.factorymethod.head.pizza.*;

public abstract class PizzaFactory {
	public abstract Pizza createPizza(PizzaType type);
}
