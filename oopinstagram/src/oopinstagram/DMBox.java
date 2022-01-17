package oopinstagram;

public class DMBox {

	private String[] DMs;
	private String[] profilePhotos;
	private String nickName;
	private String calls[];
	private String[] requests;
	private String message;
	public String[] getDMs() {
		return DMs;
	}
	public void setDMs(String[] dMs) {
		DMs = dMs;
	}
	public String[] getProfilePhotos() {
		return profilePhotos;
	}
	public void setProfilePhotos(String[] profilePhotos) {
		this.profilePhotos = profilePhotos;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String[] getCalls() {
		return calls;
	}
	public void setCalls(String[] calls) {
		this.calls = calls;
	}
	public String[] getRequests() {
		return requests;
	}
	public void setRequests(String[] requests) {
		this.requests = requests;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
}
