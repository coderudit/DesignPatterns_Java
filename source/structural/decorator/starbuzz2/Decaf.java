package structural.decorator.starbuzz2;

public class Decaf extends Beverage {

	public Decaf(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		double finalCost = super.cost() + 1.5;
		System.out.println("Cost of Decaf is $" + finalCost);
		return finalCost;
	}

}
