package structural.proxy.twitter;

public class TwitterService implements ITwitterService {

	@Override
	public String getTimeline(String screenName) {
		return "My timeline";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		
	}

}
