package com.designpatterns.creational.factorymethod.headfirst.pizza;

import com.designpatterns.creational.factorymethod.headfirst.pizzafactory.NYPizzaFactory;
import com.designpatterns.creational.factorymethod.headfirst.pizzafactory.PizzaFactory;
import com.designpatterns.creational.factorymethod.headfirst.pizzastore.*;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new ChicagoPizzaFactory();
		PizzaStore pizzaStore = new NYPizzaStore(pizzaFactory);
		pizzaStore.orderPizza(PizzaType.Cheese);
	}

}
