package structural.decorator.starbuzz2;

public abstract class Beverage {
	private String description;
	
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	public String getDescription() {
		return description;
	}
		
	public Beverage(String description) {
		super();
		this.description = description;
	}

	public double cost() {
	    double finalCost =0;
		if(isMilk())
			finalCost += 0.5;
		if(isSoy())
			finalCost +=0.25;
		if(isMocha())
			finalCost +=0.75;
		if(isWhip())
			finalCost += 0.3;
		return finalCost;
	}

	public boolean isMilk() {
		return milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public boolean isMocha() {
		return mocha;
	}

	public boolean isWhip() {
		return whip;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}
}
