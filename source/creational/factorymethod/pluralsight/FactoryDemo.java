package creational.factorymethod.pluralsight;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.Shop);
		site.createWebsite();
		System.out.println(site.getPages());
	}

}
