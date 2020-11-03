package main;

import java.util.Map;

public class Decide_Recommend {
	public User_Input user_input;
	
	public Decide_Recommend(User_Input user_input) {
		this.user_input = user_input;
	}
		
	public void decide() {
		if(user_input.get_Search_word() != null) {
			//검색어 추천 함수 호출
		}
		
		else if(user_input.get_Input_2D_list() != null) {
			// 키워드 추천 함수 호출
			Restaurants_testcase rt = new Restaurants_testcase();
			Manage_Restaurants_Data mrd = new Manage_Restaurants_Data(rt);
			
			Recommend_by_Keyword keyword = new Recommend_by_Keyword();
			keyword.Re_keyword(this.user_input, mrd.getRestauratn_list());
			
		}
		
		else {
			//랜덤 추천 함수 호출
		}
	}

}
