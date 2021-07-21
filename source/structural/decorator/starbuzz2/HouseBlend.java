package structural.decorator.starbuzz2;

public class HouseBlend extends Beverage {

	public HouseBlend(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		double finalCost = super.cost() + 3 ;
		System.out.println("Cost of HouseBlend is $" + finalCost);
		return finalCost;
	}

}
