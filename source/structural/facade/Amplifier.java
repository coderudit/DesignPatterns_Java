package structural.facade;

public class Amplifier {
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	
	public void on() {
		System.out.println("Amplifier:On");
	}
	
	public void off() {
		System.out.println("Amplifier:Off");
	}
	
	public void setCd() {
		System.out.println("Amplifier:SetCd");
	}
	
	public void setDvd() {
		System.out.println("Amplifier:SetDvd");
	}
	
	public void setStereoSound() {
		System.out.println("Amplifier:SetStereoSound");
	}
	
	public void setSurroundAudio() {
		System.out.println("Amplifier:SetSurroundAudio");
	}
	
	public void setTuner() {
		System.out.println("Amplifier:SetTuner");
	}
	
	public void setVolume() {
		System.out.println("Amplifier:SetVolume");
	}
}
