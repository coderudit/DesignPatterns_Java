package behavioral.chainofresponsibility;

public class Request {
	private RequestType requestType;
	private String data;
	
	public Request(RequestType requestType, String data) {
		this.requestType = requestType;
		this.data = data;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public String getData() {
		return data;
	}
	
	
}
