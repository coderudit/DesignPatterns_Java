package structural.proxy.ytm;

public class YouTubeManager {
	
	public static void main(String[] args)
	{
		IThirdPartyYTLib thirdPartyYTService = new ThirdPartyYTLib();
		IThirdPartyYTLib cachedYTService = new CachedYTProxy(thirdPartyYTService);
		
		var videos = cachedYTService.listVideos();
		
		for(Video video: videos) {
			System.out.println(cachedYTService.getVideoInfo(video.getId()));
			cachedYTService.downloadVideo(video.getId());
		}
		
	}
}
