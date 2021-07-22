package structural.proxy.twitter;

public interface ITwitterService {
	public String getTimeline(String screenName);
	public void postToTimeline(String screenName, String message);
}
