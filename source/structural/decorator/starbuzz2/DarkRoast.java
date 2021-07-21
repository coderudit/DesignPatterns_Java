package structural.decorator.starbuzz2;

public class DarkRoast extends Beverage {

	public DarkRoast(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		double finalCost = super.cost() + 2 ;
		System.out.println("Cost of DarkRoast is $" + finalCost);
		return finalCost;
	}

}
