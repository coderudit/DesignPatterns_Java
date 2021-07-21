package structural.decorator.starbuzz3;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "DarkRoast";
	}

	@Override
	public double cost() {
		double finalCost = 2 ;
		System.out.println("Cost of DarkRoast is $" + finalCost);
		return finalCost;
	}

}
