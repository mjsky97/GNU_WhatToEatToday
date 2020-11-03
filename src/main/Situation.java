package main;

import java.util.HashMap;
import java.util.Map;

public class Situation {
	public int code;
	public Map<String, Integer> map;
	
	public String Situation_Category_List [] = {"회식", "데이트", "과팅(소개팅)", "간단한 식사", "가성비", "비오는날"};
	
	public Situation(int code) {
		this.code = code;
	}
	
	public void put(Map map) {}
}

// 필요 없음
