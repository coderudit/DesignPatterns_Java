package com.designpatterns.creational.factorymethod.headfirst.pizzafactory;

import com.designpatterns.creational.factorymethod.headfirst.pizza.Pizza;
import com.designpatterns.creational.factorymethod.headfirst.pizza.PizzaType;

public abstract class PizzaFactory {
	public abstract Pizza createPizza(PizzaType type);
}
