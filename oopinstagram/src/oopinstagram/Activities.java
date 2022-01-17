package oopinstagram;

public class Activities {

	private String[] followReqs;
	private String[] actFromFriends;
	private String[] suggestedFriends;
	public Activities(String[] followReqs, String[] actFromFriends, String[] suggestedFriends) {
		super();
		this.followReqs = followReqs;
		this.actFromFriends = actFromFriends;
		this.suggestedFriends = suggestedFriends;
	}
	public Activities() {
		super();
	}
	public String[] getFollowReqs() {
		return followReqs;
	}
	public void setFollowReqs(String[] followReqs) {
		this.followReqs = followReqs;
	}
	public String[] getActFromFriends() {
		return actFromFriends;
	}
	public void setActFromFriends(String[] actFromFriends) {
		this.actFromFriends = actFromFriends;
	}
	public String[] getSuggestedFriends() {
		return suggestedFriends;
	}
	public void setSuggestedFriends(String[] suggestedFriends) {
		this.suggestedFriends = suggestedFriends;
	}
	
}
