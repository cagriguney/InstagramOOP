package oopinstagram;
import java.util.Date;

public class Reels {

	private String[] reels;
	private String name;
	private Date time=new Date();
	private int likeCount;
	private String[] comments;
	public Reels(String[] reels, String name, Date time, int likeCount, String[] comments) {
		super();
		this.reels = reels;
		this.name = name;
		this.time = time;
		this.likeCount = likeCount;
		this.comments = comments;
	}

	public Reels() {
		super();
	}
	
	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

	public String[] getReels() {
		return reels;
	}
	public void setReels(String[] reels) {
		this.reels = reels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
