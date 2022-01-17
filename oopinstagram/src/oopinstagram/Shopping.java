package oopinstagram;

public class Shopping {

	private String[] videosOrPhotos;
	private String nameWhoShared;
	private String searchShops;
	public Shopping() {
		super();
	}
	public Shopping(String[] videosOrPhotos, String nameWhoShared, String searchShops) {
		super();
		this.videosOrPhotos = videosOrPhotos;
		this.nameWhoShared = nameWhoShared;
		this.searchShops = searchShops;
	}
	public String[] getVideosOrPhotos() {
		return videosOrPhotos;
	}
	public void setVideosOrPhotos(String[] videosOrPhotos) {
		this.videosOrPhotos = videosOrPhotos;
	}
	public String getNameWhoShared() {
		return nameWhoShared;
	}
	public void setNameWhoShared(String nameWhoShared) {
		this.nameWhoShared = nameWhoShared;
	}
	public String getSearchShops() {
		return searchShops;
	}
	public void setSearchShops(String searchShops) {
		this.searchShops = searchShops;
	}
	
	
	
}
