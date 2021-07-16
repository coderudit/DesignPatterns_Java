package com.designpatterns.creational.factorymethod.headfirst.pizzafactory;

import com.designpatterns.creational.factorymethod.headfirst.pizza.*;

public class ChicagoPizzaFactory extends PizzaFactory {
	public Pizza createPizza(PizzaType type) {
		switch(type) {
		case Cheese:
			return new ChicagoCheesePizza();
		case Greek:
			return new ChicagoGreekPizza();
		case Pepperoni:
			return new ChicagoPepperoniPizza();
		default:
			return null;
		}
	}
}
