package com.designpatterns.creational.factorymethod.headfirst.pizza;

public class NYGreekPizza extends Pizza{
	public NYGreekPizza() {
		name = "NY Greek Pizza";
		dough = "Thin crust";
		sauce = "Salami";
		toppings.add("Chicken");
	}
}
