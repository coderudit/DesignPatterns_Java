package creational.abstractfactory.head.pizzaingredients;

import java.util.Arrays;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Baking");
	}
	
	void cut() {
		System.out.println("Cutting");
	}
	
	void box() {
		System.out.println("Boxing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
				+ ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
	}
	
	
}
