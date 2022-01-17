package oopinstagram;

public class PersonalUser extends Users{
	
	private String nickName;
	private String photo;
	private String bio;
	private int followers;
	private int followings;
	
	public PersonalUser() {
		super();
	}
	
	public PersonalUser(String email, String pass, String nickName, String photo, String bio, int followers, int followings) {
		super(email,pass);
		this.nickName = nickName;
		this.photo = photo;
		this.bio = bio;
		this.followers = followers;
		this.followings = followings;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFollowings() {
		return followings;
	}
	public void setFollowings(int followings) {
		this.followings = followings;
	}
	
	

}
