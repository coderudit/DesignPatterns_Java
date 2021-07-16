package creational.builder;

public class LunchOrder3Demo {
	public static void main(String[] args) {
		LunchOrder3.Builder builder = new LunchOrder3.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

		LunchOrder3 lunchOrder3 = builder.build();

		System.out.println(lunchOrder3.getBread());
		System.out.println(lunchOrder3.getCondiments());
		System.out.println(lunchOrder3.getDressing());
		System.out.println(lunchOrder3.getMeat());
	}
}
