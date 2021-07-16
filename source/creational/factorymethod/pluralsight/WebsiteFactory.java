package creational.factorymethod.pluralsight;

public class WebsiteFactory {
	public static Website getWebsite(WebsiteType type) {
		switch (type) {
		case Shop:
			return new Shop();
		case Blog:
			return new Blog();
		default:
			return null;
		}
	}
}
