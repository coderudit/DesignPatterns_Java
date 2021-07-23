package structural.composite;

public abstract class Employee {
	
	private String name;
	private long empId;
	private int position;
	private int rating;
	
	public Employee(String name, long empId, int position, int rating) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	abstract int calculateSalaryForHierarchy();
}
