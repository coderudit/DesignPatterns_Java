package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Catalog acts as a factory and also caches already created Items
public class Catalog {
	
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Item lookup(String itemName) {
		
		if(!items.containsKey(itemName))
			items.put(itemName, new Item(itemName, new Random().nextInt()));
		
		return items.get(itemName);
	}
	
	public int totalItemsMade() {
		return items.size();
	}
}
