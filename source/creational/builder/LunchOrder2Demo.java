package creational.builder;

public class LunchOrder2Demo {
	public static void main(String[] args) {
		LunchOrder2 lunchOrder = new LunchOrder2("Wheat", "Lettuce", "Mustard", "Ham");

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}
}
