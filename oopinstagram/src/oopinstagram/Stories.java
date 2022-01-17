package oopinstagram;

import java.util.Date;

public class Stories {

	private String[] videoOrPhotos;
	private String sharerPerson;
	private Date shareDate=new Date();
	private String message;
	public Stories(String[] videoOrPhotos, String sharerPerson, Date shareDate, String message) {
		super();
		this.videoOrPhotos = videoOrPhotos;
		this.sharerPerson = sharerPerson;
		this.shareDate = shareDate;
		this.message = message;
	}
	
	public Stories() {
		super();
	}

	public String[] getVideoOrPhotos() {
		return videoOrPhotos;
	}
	public void setVideoOrPhotos(String[] videoOrPhotos) {
		this.videoOrPhotos = videoOrPhotos;
	}
	public String getSharerPerson() {
		return sharerPerson;
	}
	public void setSharerPerson(String sharerPerson) {
		this.sharerPerson = sharerPerson;
	}
	public Date getShareDate() {
		return shareDate;
	}
	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
