package structural.composite;

public class Developer extends Employee {
	
	public Developer(String name, long empId, int position, int rating) {
		super(name, empId, position, rating);
	}
	
	@Override
	public int calculateSalaryForHierarchy() {
		return (10000 * this.getPosition() * this.getRating());
	}

}
