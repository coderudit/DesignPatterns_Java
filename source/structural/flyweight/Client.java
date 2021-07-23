package structural.flyweight;

public class Client {
	public static void main(String[] args) {
		
		 InventorySystem ivs = new InventorySystem();
		 
		 ivs.takeOrder("Bose Headphones", 123);
		 ivs.takeOrder("Samsung Headphones", 211);
		 ivs.takeOrder("Jabra Headphones", 243);
		 ivs.takeOrder("Jabra Headphones", 432);
		 ivs.takeOrder("Boat Headphones", 126);
		 ivs.takeOrder("Bose Headphones", 313);
		 ivs.takeOrder("Noise Headphones", 633);
		 
		 ivs.process();
		 
		 System.out.println(ivs.report());
	}
}
