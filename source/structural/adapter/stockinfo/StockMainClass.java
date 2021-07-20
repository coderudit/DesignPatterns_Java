package structural.adapter.stockinfo;

public class StockMainClass {
	public static void main(String[] args) {
		var dataProvider = new StockDataProvider();
		var dataAnalytics = new DataAnalyticsLibrary();
		
		//dataAnalytics.AcceptDataInJson(dataProvider.provideStockDataInXml());
		var adapter = new XmlToJsonAdapter(dataProvider);
		dataAnalytics.AcceptDataInJson(adapter.convertXmlToJson());		
	}
}
