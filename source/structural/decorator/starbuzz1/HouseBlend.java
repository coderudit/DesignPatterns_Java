package structural.decorator.starbuzz1;

public class HouseBlend extends Beverage {

	public HouseBlend(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Cost of HouseBlend is $3");
		return 3;
	}

}
