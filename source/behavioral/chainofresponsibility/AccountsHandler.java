package behavioral.chainofresponsibility;

public class AccountsHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.ACCOUNTS)
		{
			System.out.println(request.getData());
			System.out.println("I am being handled by ACCOUNTS department.");
		}
		else
		{
			System.out.println("I am not being handled by ACCOUNTS department.");
			successor.handleRequest(request);
		}
	}

}
