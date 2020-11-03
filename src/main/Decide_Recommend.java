package main;

import java.util.Map;

public class Decide_Recommend {
	private User_Input user_input;
	private Recommend_by_Keyword R_b_K;
	private Recommend_by_Search_word R_b_S;
	private Recommend_Random R_R;
	
	public Recommend_by_Keyword getR_b_K() {
		return R_b_K;
	}

	public void setR_b_K(Recommend_by_Keyword r_b_K) {
		this.R_b_K = r_b_K;
	}

	public Recommend_by_Search_word getR_b_S() {
		return R_b_S;
	}

	public void setR_b_S(Recommend_by_Search_word r_b_S) {
		this.R_b_S = r_b_S;
	}

	public Recommend_Random getR_R() {
		return R_R;
	}

	public void setR_R(Recommend_Random r_R) {
		this.R_R = r_R;
	}

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
			R_b_K = new Recommend_by_Keyword();
			R_b_K.setResults(keyword.Re_keyword(this.user_input, mrd.getRestauratn_list()));
		}
		
		else {
			//랜덤 추천 함수 호출
		}
	}

	public User_Input getUser_input() {
		return user_input;
	}

	public void setUser_input(User_Input user_input) {
		this.user_input = user_input;
	}

}
