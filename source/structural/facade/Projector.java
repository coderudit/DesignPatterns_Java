package structural.facade;

public class Projector {
	
	private DvdPlayer dvdPlayer;
	
	public void on() {
		System.out.println("Projector:On");
	}
	
	public void off() {
		System.out.println("Projector:Off");
	}
	
	public void tvMode() {
		System.out.println("Projector:TvMode");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector:WideScreenMode");
	}
}
