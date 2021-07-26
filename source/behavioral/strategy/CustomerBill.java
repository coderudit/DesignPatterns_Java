package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class CustomerBill {
	private final List<Double> drinks = new ArrayList<>();
    private IBillingStrategy strategy;

    public CustomerBill(IBillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(int price, int quantity) {
        this.drinks.add(this.strategy.getActPrice(price*quantity));
    }

    // Payment of bill
    public void print() {
        int sum = this.drinks.stream().mapToInt(v -> v.intValue()).sum();
        System.out.println("Total due: " + sum);
        this.drinks.clear();
    }

    // Set Strategy
    public void setStrategy(IBillingStrategy strategy) {
        this.strategy = strategy;
    }
}
