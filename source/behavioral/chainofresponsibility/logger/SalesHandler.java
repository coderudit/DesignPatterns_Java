package behavioral.chainofresponsibility.logger;

public class SalesHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.SALES)
		{
			System.out.println(request.getData());
			System.out.println("I am being handled by SALES department.");
		}
		else
		{
			System.out.println("I am not being handled by SALES department.");
			successor.handleRequest(request);
		}
	}

}
