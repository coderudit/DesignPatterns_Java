package structural.decorator.starbuzz3;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public double cost() {
		double finalCost = 0.5 ;
		System.out.println("Cost of Espresso is $" + finalCost);
		return finalCost;
	}

}
