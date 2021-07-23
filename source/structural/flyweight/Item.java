package structural.flyweight;

//Instances of Item will be fly-weights
public class Item {
	
	private final String name;
	private final int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
