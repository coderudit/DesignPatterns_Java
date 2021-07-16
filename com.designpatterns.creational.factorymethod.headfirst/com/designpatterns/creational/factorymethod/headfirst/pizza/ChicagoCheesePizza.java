package com.designpatterns.creational.factorymethod.headfirst.pizza;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "Chicago Cheese Pizza";
		dough = "Thick crust";
		sauce = "Barbeque";
		toppings.add("Tomato");
	}
}
