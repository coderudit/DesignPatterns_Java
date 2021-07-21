package structural.decorator.starbuzz3;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double finalCost = this.beverage.cost() + 0.2;
		return finalCost;
	}
	
}
