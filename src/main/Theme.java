package main;

import java.util.HashMap;
import java.util.Map;

public class Theme {
	public int code;
	public Map<String, Integer> map;
	
	public String Theme_Category_List [] = {"국밥", "한식", "중식", "양식", "밀면", "분식"};
	
	public Theme(int code) {
		this.code = code;
	}
	
	public void put(Map map) {}
}

// 필요 없음
