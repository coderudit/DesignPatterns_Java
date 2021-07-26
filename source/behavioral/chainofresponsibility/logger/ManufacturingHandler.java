package behavioral.chainofresponsibility.logger;

public class ManufacturingHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.MANUFACTURING)
		{
			System.out.println(request.getData());
			System.out.println("I am being handled by MANUFACTURING department.");
		}
		else
		{
			System.out.println("I am not being handled by MANUFACTURING department.");
			successor.handleRequest(request);
		}
	}

}
