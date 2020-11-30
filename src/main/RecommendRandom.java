package main;

import java.util.Random;

public class RecommendRandom implements RecommendResaurantList {
	
	private Restaurant[] results;
	private final int SIZE_OF_RESTAURANT_LIST = 3;
	
	
	private Restaurant binarySearch(int key, Restaurant[] restaurantlist) {
		int mid = 0;
		int left = 0;
		int right = restaurantlist.length - 1;
		Restaurant restaurant = new Restaurant();

		while(right >= left) {
			mid = (right + left) / 2;
			
			if (key == restaurantlist[mid].getNumber()) {
				restaurant = new Restaurant();
				restaurant = restaurantlist[mid];				
				break;
			}
			
			if (key < restaurantlist[mid].getNumber()) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		return restaurant;
	}
		
	public void listOfRecommendedList(Restaurant[] allOfRestaurantList) {
		
		Random random = new Random();
		int [] listOfRandomNumbers = new int [SIZE_OF_RESTAURANT_LIST];
		Restaurant [] outputs = new Restaurant[SIZE_OF_RESTAURANT_LIST];
					
		for(int i = 0; i < SIZE_OF_RESTAURANT_LIST; i++) {
			
			listOfRandomNumbers[i] = random.nextInt(allOfRestaurantList.length) + 1;
			
			for(int j = 0; j < i; j++) {
				if(listOfRandomNumbers[i] == listOfRandomNumbers[j]) {
					i--;
				}
			}
			
			outputs[i] = new Restaurant();
			outputs[i] = this.binarySearch(listOfRandomNumbers[i], allOfRestaurantList);
		}
		
		this.results = outputs;
		
	}
	
	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}
}
