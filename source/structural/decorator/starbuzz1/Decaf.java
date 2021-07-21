package structural.decorator.starbuzz1;

public class Decaf extends Beverage {

	public Decaf(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Cost of Decaf is $1");
		return 1;
	}

}
