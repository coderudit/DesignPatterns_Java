package behavioral.strategy;

public class HappyHourStrategy implements IBillingStrategy {

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice * 0.5;
	}

}
