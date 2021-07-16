package com.designpatterns.creational.simplefactory;

public abstract class Pizza {
	public void prepare() {
		System.out.println("Pizza is being prepared.");
	}
	public void bake() {
		System.out.println("Pizza is being baked.");
	}
	public void cut() {
		System.out.println("Pizza is being cut.");
	}
	public void box() {
		System.out.println("Pizza is being boxed.");
	}
}
