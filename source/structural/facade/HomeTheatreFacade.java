package structural.facade;

public class HomeTheatreFacade {
	
	private Amplifier amplifier;
	private CdPlayer cdPlayer;
	private DvdPlayer dvdPlayer;
	private PopcornPopper popper;
	private Projector projector;
	private Screen screen;
	private TheaterLights lights;
	private Tuner tuner;

	
	public HomeTheatreFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popper,
			Projector projector, Screen screen, TheaterLights lights, Tuner tuner) {
		super();
		this.amplifier = amplifier;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.popper = popper;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.tuner = tuner;
	}
	public void watchMovie() {
		this.popper.on();
		this.popper.pop();
		this.lights.dim();
		this.screen.down();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amplifier.on();
		this.amplifier.setDvd();
		this.amplifier.setSurroundAudio();
		this.dvdPlayer.on();
		this.dvdPlayer.play();
	}
public void endMovie() {
		this.popper.off();
		this.lights.on();
		this.screen.up();
		this.projector.off();
		this.amplifier.off();
		this.dvdPlayer.stop();
		this.dvdPlayer.eject();
		this.dvdPlayer.off();
	}
public void listenToCd() {
	
}
public void endCd() {
	
}
public void listenToRadio() {
	
}
public void endRadio() {
	
}

}
