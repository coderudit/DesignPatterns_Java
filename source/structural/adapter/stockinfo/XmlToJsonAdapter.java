package structural.adapter.stockinfo;

public class XmlToJsonAdapter {
	
	private StockDataProvider stockData;
	
	public XmlToJsonAdapter(StockDataProvider stockData){
		this.stockData = stockData;
	}
	
	public JsonFormat convertXmlToJson() {
		var xmlFormat = this.stockData.provideStockDataInXml();
		System.out.println("Converting XML to JSON format.");		
		return new JsonFormat();
	}
}
