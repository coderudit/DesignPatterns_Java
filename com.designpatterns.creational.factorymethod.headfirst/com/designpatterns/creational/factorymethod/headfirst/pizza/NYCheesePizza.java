package com.designpatterns.creational.factorymethod.headfirst.pizza;

public class NYCheesePizza extends Pizza{
	public NYCheesePizza() {
		name = "NY Cheese Pizza";
		dough = "Thin crust";
		sauce = "Marina";
		toppings.add("Onion");
	}
}
