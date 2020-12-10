package main;

import java.util.ArrayList;

/*

 검색어가 input으로 들어옴
 이 검색어를 포함하는 결과만 출력
 
*/

public class CompareBySearchword implements CompareUserInputandResaurantList {
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void compare(Restaurant[] allOfRestaurantList) {
 		
		String [] arrayOfInputtedWord = userInput.getSearchword().split(""); // 한글자씩 나눔(split)
		
		ArrayList<Integer> indexOfMatchedRestaurant = new ArrayList<Integer>(); // 결과를 저장할 List
		
		for(int i = 0; i < allOfRestaurantList.length; i++) {		// 모든 Restaurant 갯수만큼 반복
			
			int count = 0;		// 한 글자 포함 여부 갯수를 셀 변수
			
			for(int j = 0; j < arrayOfInputtedWord.length; j++) {		// input으로 들어온 문자열의 글 갯수만큼 반복	
				
				if(allOfRestaurantList[i].getRestaurantName().contains(arrayOfInputtedWord[j])) {
					count ++;
				}		// 글자를 포함하면 count를 1 올림
				
				if(count == arrayOfInputtedWord.length) {
					indexOfMatchedRestaurant.add(i);
				}		// 음식점 이름에 대하여 count와 input으로 들어온 String의 배열 길이와 같으면(=검색어를 모두 포함) 
			}
		}

		Restaurant [] outputs = new Restaurant[indexOfMatchedRestaurant.size()];
		
		for(int i = 0; i < indexOfMatchedRestaurant.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = allOfRestaurantList[indexOfMatchedRestaurant.get(i)];
			
		}
		
		this.results = outputs;
		
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public void setUserInput(UserInput userInput) {
		this.userInput = userInput;
	}
}
