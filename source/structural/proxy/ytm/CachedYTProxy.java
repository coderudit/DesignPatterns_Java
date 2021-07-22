package structural.proxy.ytm;

import java.util.List;
import java.util.Map;

public class CachedYTProxy implements IThirdPartyYTLib {

	private IThirdPartyYTLib thirdPartyYT;
	private List<Video> videosCache;
	private Map<String, String> videosMetadataMap;
	private Map<String, Video> videosMap;
	
	public CachedYTProxy(IThirdPartyYTLib thirdPartyYT) {
		super();
		this.thirdPartyYT = thirdPartyYT;
	}

	@Override
	public List<Video> listVideos() {	
		if(videosCache == null || videosCache.size() == 0)
			videosCache = this.thirdPartyYT.listVideos();
		
		return videosCache;
	}

	@Override
	public String getVideoInfo(String id) {
		if(!videosMetadataMap.containsKey(id)) {
			videosMetadataMap.put(id, this.thirdPartyYT.getVideoInfo(id));
		}
		return videosMetadataMap.get(id);
	}

	@Override
	public Video downloadVideo(String id) {
		if(!videosMap.containsKey(id)) {
			videosMap.put(id, this.thirdPartyYT.downloadVideo(id));
		}
		return videosMap.get(id);
	}

}
