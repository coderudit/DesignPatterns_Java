package structural.proxy.gumball;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		var machine = new GumballMachine("Indiana", 25);
		var monitor = new GumballMonitor(machine);
		monitor.report();
	}

}
