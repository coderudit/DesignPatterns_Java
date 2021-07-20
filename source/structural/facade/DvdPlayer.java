package structural.facade;

public class DvdPlayer {
	private Amplifier amplifier;
	
	public void on() {
		System.out.println("DvdPlayer:On");
	}
	
	public void off() {
		System.out.println("DvdPlayer:Off");
	}
	
	public void eject() {
		System.out.println("DvdPlayer:Eject");
	}
	
	public void pause() {
		System.out.println("DvdPlayer:Pause");
	}
	
	public void play() {
		System.out.println("DvdPlayer:Play");
	}
	
	public void setSurroundAudio() {
		System.out.println("DvdPlayer:SetSurroundAudio");
	}
	
	public void setTwoChannelAudio() {
		System.out.println("DvdPlayer:SetTwoChannelAudio");
	}
	
	public void stop() {
		System.out.println("DvdPlayer:Stop");
	}
}
