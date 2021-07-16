package creational.abstractfactory.head.pizzaingredients;

import creational.factorymethod.head.pizza.*;

public abstract class PizzaFactory {
	public abstract Pizza createPizza(PizzaType type, PizzaIngredientFactory ingredientFactory);
}
