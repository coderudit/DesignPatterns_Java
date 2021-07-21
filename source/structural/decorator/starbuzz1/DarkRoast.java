package structural.decorator.starbuzz1;

public class DarkRoast extends Beverage {

	public DarkRoast(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Cost of DarkRoast is $2");
		return 2;
	}

}
