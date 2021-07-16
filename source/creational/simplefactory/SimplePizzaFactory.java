package creational.simplefactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(PizzaType type) {
		switch(type) {
		case Cheese:
			return new CheesePizza();
		case Greek:
			return new GreekPizza();
		case Pepperoni:
			return new PepperoniPizza();
		default:
			return null;
		}
	}
	
}
