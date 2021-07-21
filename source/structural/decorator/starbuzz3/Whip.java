package structural.decorator.starbuzz3;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double finalCost = this.beverage.cost() + 0.3;
		return finalCost;
	}
	
}
