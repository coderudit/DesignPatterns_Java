package creational.factorymethod.head.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("Pizza is being prepared.");
		System.out.println("Name: " + name);
		System.out.println("Dough: " + dough);
		System.out.println("Sauce: " + sauce);
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
