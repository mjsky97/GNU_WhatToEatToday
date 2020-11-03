package main;

import java.util.HashMap;
import java.util.Map;

public class Liquor {
	public int code;
	public Map<String, Integer> map;
	
	public String Liquor_Category_List [] = {"소주", "맥주", "막걸리", "술&밥"};
	
	public Liquor(int code) {
		this.code = code;
	}
	
	public void put(Map map) {}
}


// 필요 없음