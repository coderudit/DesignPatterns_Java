package structural.decorator.starbuzz3;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "Decaf";
	}

	@Override
	public double cost() {
		double finalCost = 1.5;
		System.out.println("Cost of Decaf is $" + finalCost);
		return finalCost;
	}

}
