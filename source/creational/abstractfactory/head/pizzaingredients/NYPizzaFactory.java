package creational.abstractfactory.head.pizzaingredients;

import creational.factorymethod.head.pizza.*;

public class NYPizzaFactory extends PizzaFactory {
	public Pizza createPizza(PizzaType type, PizzaIngredientFactory ingredientFactory) {
		switch(type) {
		case Cheese:
			return new CheesePizza(ingredientFactory);
		case Clams:
			return new ClamPizza(ingredientFactory);
		default:
			return null;
		}
	}
}
