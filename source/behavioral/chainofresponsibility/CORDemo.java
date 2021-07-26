package behavioral.chainofresponsibility;


public class CORDemo {
	public static void main(String[] args) {
		Handler accounts = new AccountsHandler();
		Handler manufacturing =  new ManufacturingHandler();
		Handler sales =  new SalesHandler();
		
		accounts.setSuccessor(manufacturing);
		manufacturing.setSuccessor(sales);
		
		Request request = new Request(RequestType.SALES, "Sales request.") ;
		accounts.handleRequest(request);
	}
}
