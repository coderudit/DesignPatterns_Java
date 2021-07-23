package structural.composite;

public class Manager extends Employee {
	
	public Manager(String name, long empId, int position, int rating) {
		super(name, empId, position, rating);
	}

	@Override
	public int calculateSalaryForHierarchy() {
		return 100000 + (10000 * this.getPosition() * this.getRating());
	}

}
