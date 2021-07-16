package com.designpatterns.creational.factorymethod.headfirst.pizza;

public class NYPepperoniPizza extends Pizza {
	public NYPepperoniPizza() {
		name = "NY Pepperoni Pizza";
		dough = "Thin crust";
		sauce = "Barbeque";
		toppings.add("Meat");
	}
}
