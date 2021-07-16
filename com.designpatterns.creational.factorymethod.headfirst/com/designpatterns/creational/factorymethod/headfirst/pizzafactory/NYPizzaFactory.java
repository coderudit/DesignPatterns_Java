package com.designpatterns.creational.factorymethod.headfirst.pizzafactory;

import com.designpatterns.creational.factorymethod.headfirst.pizza.*;

public class NYPizzaFactory extends PizzaFactory {
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
