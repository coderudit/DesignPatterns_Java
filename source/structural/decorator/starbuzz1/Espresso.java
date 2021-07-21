package structural.decorator.starbuzz1;

public class Espresso extends Beverage {

	public Espresso(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Cost of Espresso is $0.5");
		return 0.5;
	}

}
