package structural.facade;

public class MovieTimeDemo {
	public static void main(String args[]) {
		
		/**
		var popper = new PopcornPopper();
		var lights = new TheaterLights();
		var screen = new Screen();
		var projector = new Projector();
		var amplifier = new Amplifier();
		var dvd = new DvdPlayer();
		
		popper.on();
		popper.pop();
		
		lights.dim();
		
		screen.down();
		
		projector.on();
		projector.tvMode();
	
		amplifier.on();
		amplifier.setDvd();
		amplifier.setCd();
		amplifier.setSurroundAudio();
		
		dvd.on();
		dvd.play();
		*/
		
		HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(new Amplifier(),
				new CdPlayer(), new DvdPlayer(), new PopcornPopper(),
				new Projector(), new Screen(), new TheaterLights(), new  Tuner());
		homeTheatreFacade.watchMovie();
		homeTheatreFacade.endMovie();
		
	}
}
