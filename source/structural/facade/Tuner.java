package structural.facade;

public class Tuner {
	private Amplifier amplifier;
	
	public void on() {
		System.out.println("Tuner:On");
	}
	
	public void off() {
		System.out.println("Tuner:Off");
	}
	
	public void setAm() {
		System.out.println("Tuner:setAm");
	}
	
	public void setFm() {
		System.out.println("Tuner:setFm");
	}

}
