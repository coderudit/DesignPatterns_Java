package behavioral.strategy;

public class NormalStrategy implements IBillingStrategy {

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice;
	}

}
