package structural.decorator.starbuzz2;

public class Espresso extends Beverage {

	public Espresso(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		double finalCost = super.cost() + 0.5 ;
		System.out.println("Cost of Espresso is $" + finalCost);
		return finalCost;
	}

}
