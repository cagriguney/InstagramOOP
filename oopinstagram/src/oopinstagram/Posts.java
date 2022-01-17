package oopinstagram;

import java.util.Date;

public class Posts {
	
	private String personWhoShared;
	private String sharingDate;
	private int likeCount;
	private String[] comments;
	private String[] photoOrVideo;
	private String personPhoto;
	
	public Posts(String personWhoShared, int likeCount, String[] comments, String[] photoOrVideo,
			String personPhoto) {
		super();
		this.personWhoShared = personWhoShared;
		this.likeCount = likeCount;
		this.comments = comments;
		this.photoOrVideo = photoOrVideo;
		this.personPhoto = personPhoto;
		Date createDate=new Date();
		sharingDate=createDate.toString();
	}
	
	public String getPersonWhoShared() {
		return personWhoShared;
	}
	public String getSharingDate() {
		return sharingDate;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public String[] getComments() {
		return comments;
	}
	public String[] getPhotoOrVideo() {
		return photoOrVideo;
	}
	public String getPersonPhoto() {
		return personPhoto;
	}
	
}
