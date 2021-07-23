package structural.flyweight;


public class Order {

	//Unique Property
	private final int orderNumber;
	private final Item item; //Shared property 
	
	public Order(int orderNumber, Item item) {
		super();
		this.orderNumber = orderNumber;
		this.item = item;
	}
	
	public void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
	}
}
