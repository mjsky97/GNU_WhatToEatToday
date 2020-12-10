package main;

import java.util.ArrayList;

public class UserInput {
	private static String searchword;
	private static ArrayList<String> inputKeywords = new ArrayList<String>();
	
	public ArrayList<String> getInputKeywords() {
		return inputKeywords;
	}
	
	public void setInputKeywords(ArrayList<String> inputKeywords) {
		UserInput.inputKeywords = inputKeywords;
	}
	
	public void putInputKeywords(String inputKeywords) {
		UserInput.inputKeywords.add(inputKeywords);
	}
	
	public void deleteInputKeywords(String keywords) {
		UserInput.inputKeywords.remove(keywords);
	}
	
	public void clearInputKeywords() {
		UserInput.inputKeywords.clear();
	}
	
	public String getSearchword() {
		return searchword;
	}
	
	public void setSearchword(String search_word) {
		UserInput.searchword = search_word;
	}

}
