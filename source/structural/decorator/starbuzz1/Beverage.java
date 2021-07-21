package structural.decorator.starbuzz1;

public abstract class Beverage {
	private String description;

	public String getDescription() {
		return description;
	}
		
	public Beverage(String description) {
		super();
		this.description = description;
	}

	public abstract double cost();
}
