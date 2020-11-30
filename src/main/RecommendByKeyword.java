package main;

import java.util.ArrayList;
import java.util.Collections;


public class RecommendByKeyword implements RecommendResaurantList{
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void listOfRecommendedList(Restaurant[] allOfRestaurantList) {
			
		ArrayList<Integer> count = new ArrayList<Integer>(); // 각 음식점의 키워드가 input이랑 몇개나 일치하는지 저장
		ArrayList<Integer> indexOfRestaurantList = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>(); // 행 정보를 저장
		ArrayList<Integer> line = new ArrayList<Integer>();   // 열 정보를 저장
					
		int same = 0;
		
		for(int i = 0; i < userInput.getinput2Dlist().length; i++) {
			for (int j = 0; j < userInput.getinput2Dlist()[i].length; j++) {
				if (userInput.getinput2Dlist()[i][j] == 1) {
					column.add(i);
					line.add(j);
				}
			}
		} // input으로 들어온 2차원배열의 1의 index 들을 저장

		
		for(int i = 0; i < allOfRestaurantList.length; i++) {
			for(int j = 0; j < column.size(); j++) {
				if(allOfRestaurantList[i].getKeyword()[column.get(j)][line.get(j)] == 1) {
					same = same + 1;
				}
			}
			count.add(same);
			same = 0;
		}  // 각 음식점이 가지고 있는 키워드가 input과 몇개나 일치하는지 확인 후 저장
		
		int maximumOfCountList = Collections.max(count);
		
		for(int i = 0; i < count.size(); i++) {
			if(count.indexOf(maximumOfCountList) == -1) {
				if(maximumOfCountList == 0) {
					break;
				}
				maximumOfCountList = maximumOfCountList - 1;
			}
			
			int index = count.indexOf(maximumOfCountList);
			if(index == -1) {
				continue;
			}
			indexOfRestaurantList.add(index);
			count.set(index, 0);
		}
		
		Restaurant [] outputs = new Restaurant[indexOfRestaurantList.size()];
		
		for(int i = 0; i < indexOfRestaurantList.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = allOfRestaurantList[indexOfRestaurantList.get(i)];
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
