package com.designpatterns.creational.factorymethod.headfirst.pizza;

public class ChicagoPepperoniPizza extends Pizza {
	public ChicagoPepperoniPizza() {
		name = "Chicago Pepperoni Pizza";
		dough = "Thick crust";
		sauce = "Mustard";
		toppings.add("Pepper");
	}
}
