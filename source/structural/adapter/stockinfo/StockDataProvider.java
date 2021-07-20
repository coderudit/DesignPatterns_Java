package structural.adapter.stockinfo;

public class StockDataProvider {
	public XmlFormat provideStockDataInXml() {
		System.out.println("I am returning data in XmlFormat");
		return new XmlFormat();
	}
}
