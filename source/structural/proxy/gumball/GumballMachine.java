package structural.proxy.gumball;

public class GumballMachine {
	
	private String location;
	private int count;
	
	public GumballMachine(String location, int count) {
		super();
		this.location = location;
		this.count = count;
	}
	public String getLocation() {
		return location;
	}
	
	public int getCount() {
		return count;
	}

}
