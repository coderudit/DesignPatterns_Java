package structural.proxy.ytm;

import java.util.List;

public interface IThirdPartyYTLib {
	List<Video> listVideos();
	String getVideoInfo(String id);
	Video downloadVideo(String id);
}
