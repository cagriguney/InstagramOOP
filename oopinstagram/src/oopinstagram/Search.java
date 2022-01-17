package oopinstagram;

public class Search {

	private String searchedWords;
	private String[] previousSearchs;
	private String[] posts;
	private int i=0;
	public Search() {
		super();
	}
	public Search(String searchedWords, String[] posts) {
		super();
		this.searchedWords = searchedWords;
		this.posts = posts;
	}
	public String getSearchedWords() {
		return searchedWords;
	}
	public void setSearchedWords(String searchedWords) {
		this.searchedWords = searchedWords;
		if(searchedWords!="") {
			previousSearchs[i]=searchedWords;
			i++;
		}
	}
	public String[] getPosts() {
		return posts;
	}
	public void setPosts(String[] posts) {
		this.posts = posts;
	}
	public String[] getPreviousSearchs() {
		return previousSearchs;
	}
	
	
	
}
