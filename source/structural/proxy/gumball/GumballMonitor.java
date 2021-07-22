package structural.proxy.gumball;

public class GumballMonitor {
	GumballMachine machine;
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("Gumball Machine location: " + this.machine.getLocation());
		System.out.println("Gumball count: " + this.machine.getCount());
	}
}
