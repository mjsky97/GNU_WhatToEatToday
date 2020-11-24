package main;

import java.util.Map;

public class DecideRecommend {
	private UserInput userInput;
	private RecommendByKeyword recommendByKeyword;
	private RecommendBySearchword recommendBySearchword;
	private RecommendRandom recommendByRandom;
	
	public RecommendByKeyword getRbK() {
		return recommendByKeyword;
	}

	public void setR_b_K(RecommendByKeyword rbK) {
		this.recommendByKeyword = rbK;
	}

	public RecommendBySearchword getRbS() {
		return recommendBySearchword;
	}

	public void setR_b_S(RecommendBySearchword rbS) {
		this.recommendBySearchword = rbS;
	}

	public RecommendRandom getRR() {
		return recommendByRandom;
	}

	public void setR_R(RecommendRandom rR) {
		this.recommendByRandom = rR;
	}

	public DecideRecommend(UserInput userinput) {
		this.userInput = userinput;
	}
		
	public void decide() {
		if(userInput.getSearchword() != null) {
			//검색어 추천 함수 호출
		}
		
		else if(userInput.getinput2Dlist() != null) {
			// 키워드 추천 함수 호출
			Restaurants_testcase rt = new Restaurants_testcase();
			ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
			
			RecommendByKeyword keyword = new RecommendByKeyword();
			recommendByKeyword = new RecommendByKeyword();
			recommendByKeyword.setResults(keyword.listOfRecommendedList(this.userInput, mrd.getRestauratn_list()));
		}
		
		else {
			//랜덤 추천 함수 호출
		}
	}

	public UserInput getUser_input() {
		return userInput;
	}

	public void setUser_input(UserInput user_input) {
		this.userInput = user_input;
	}

}
