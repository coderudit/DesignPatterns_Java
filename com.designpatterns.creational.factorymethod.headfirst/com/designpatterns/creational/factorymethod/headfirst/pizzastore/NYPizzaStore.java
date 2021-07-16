package com.designpatterns.creational.factorymethod.headfirst.pizzastore;

import com.designpatterns.creational.factorymethod.headfirst.pizza.Pizza;
import com.designpatterns.creational.factorymethod.headfirst.pizza.PizzaType;
import com.designpatterns.creational.factorymethod.headfirst.pizzafactory.PizzaFactory;

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
