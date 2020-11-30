package main;

import java.util.ArrayList;

public class RecommendBySearchword {
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void listOfRecommendedList(Restaurant[] allOfRestaurantList) {
		
		String [] arrayOfInputtedWord = userInput.getSearchword().split("");
		
		ArrayList<Integer> indexOfMatchedRestaurant = new ArrayList<Integer>();
		
		
		
		for(int i = 0; i < allOfRestaurantList.length; i++) {
			
			int count = 0;
			
			for(int j = 0; j < arrayOfInputtedWord.length; j++) {						
				
				if(allOfRestaurantList[i].getRestaurantName().contains(arrayOfInputtedWord[j])) {
					count ++;
				}
				
				if(count == arrayOfInputtedWord.length) {
					indexOfMatchedRestaurant.add(i);
				}
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
