package structural.decorator.starbuzz3;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public double cost() {
		double finalCost = 3 ;
		System.out.println("Cost of HouseBlend is $" + finalCost);
		return finalCost;
	}

}
