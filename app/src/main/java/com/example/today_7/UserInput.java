package com.example.today_7;

public class UserInput {
    private static String searchword;
    private static int [][] input2Dlist;
    private static String [] inputKeywords;

    public String[] getInputKeyword() {
        return inputKeywords;
    }
    public void setInputKeyword(String[] inputKeywords) {
        this.inputKeywords = inputKeywords;
    }
    public String getSearchword() {
        return searchword;
    }
    public void setSearchword(String search_word) {
        this.searchword = search_word;
    }
    public int[][] getinput2Dlist() {
        return input2Dlist;
    }
    public void setinput2Dlist(int[][] input2dlist) {
        input2Dlist = input2dlist;
    }



}