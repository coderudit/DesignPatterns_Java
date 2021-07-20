package structural.bridge.realworldexample;

public class BridgeDemo {
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2.15");
		movie.setYear("2014");
		
		IFormatter formatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String printedMaterial = moviePrinter.print(formatter);
		
		System.out.println(printedMaterial);
	}
}
