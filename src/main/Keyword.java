package main;

public class Keyword {
	private String Keyword_List[][] = {  {"소주", "맥주", "막걸리", "술&밥", null, null, null},
										{"회식", "데이트", "과팅(소개팅)", "간단한 식사", "가성비", "비오는날"},
										{"치킨", "햄버거", "피자", null, null, null, null},
										{"한식", "중식", "양식", "일식", "분식", "밀면", "분식"}
									 };

	public String[][] getKeyword_List() {
		return Keyword_List;
	}

	public void setKeyword_List(String[][] keyword_List) {
		Keyword_List = keyword_List;
	}
	
	
}

// 4*7 행렬