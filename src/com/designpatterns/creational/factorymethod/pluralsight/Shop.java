package com.designpatterns.creational.factorymethod.pluralsight;

public class Shop extends Website{
	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ContactPage());
	}
}
