package structural.proxy.ytm;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYTLib implements IThirdPartyYTLib {

	@Override
	public List<Video> listVideos() {
		System.out.println("Sending an API request to YT for fetching videos.");
		return new ArrayList<Video>();
	}

	@Override
	public String getVideoInfo(String id) {
		String metadata = "Returning metadata about video.";
		return metadata;
	}

	@Override
	public Video downloadVideo(String id) {
		System.out.println("Download a video file from YouTube.");
		return new Video();
	}

}
