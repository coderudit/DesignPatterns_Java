package creational.abstractfactory.head.pizzaingredients;

import creational.factorymethod.head.pizza.*;

public class NYPizzaStore extends PizzaStore{
	
	private PizzaFactory factory;
	private PizzaIngredientFactory ingredientFactory;
	
	public NYPizzaStore(PizzaFactory factory, PizzaIngredientFactory ingredientFactory) {
		this.factory = factory;
		this.ingredientFactory = ingredientFactory;
	}
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = this.factory.createPizza(type, ingredientFactory);
		return pizza;
	}
}
