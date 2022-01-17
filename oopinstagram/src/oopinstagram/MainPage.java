package oopinstagram;

public class MainPage {

	private String stories;
	private String posts;
	private String comments;
	private int LikeCount;
	public MainPage() {
		super();
	}
	public MainPage(String stories, String posts, String comments, int likeCount) {
		super();
		this.stories = stories;
		this.posts = posts;
		this.comments = comments;
		LikeCount = likeCount;
	}
	public String getStories() {
		return stories;
	}
	public void setStories(String stories) {
		this.stories = stories;
	}
	public String getPosts() {
		return posts;
	}
	public void setPosts(String posts) {
		this.posts = posts;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getLikeCount() {
		return LikeCount;
	}
	public void setLikeCount(int likeCount) {
		LikeCount = likeCount;
	}
	
}
