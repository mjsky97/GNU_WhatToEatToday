package main;

import java.util.Random;

/*

모든 음식점 중 랜덤으로 3개 출력

*/

public class CompareRandom implements CompareUserInputandResaurantList {
	
	private Restaurant[] results;
	private final int SIZE_OF_RESTAURANT_LIST = 3;		//결과로 보여질 리스트 갯수(상수) 
	
	public Restaurant binarySearch(int key, Restaurant[] restaurantlist) {
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
		
	public void compare(Restaurant[] allOfRestaurantList) {
		
		Random random = new Random();
		int [] listOfRandomNumbers = new int [SIZE_OF_RESTAURANT_LIST];		// 난수를 저장할 배열
		Restaurant [] outputs = new Restaurant[SIZE_OF_RESTAURANT_LIST];	// output 음식점 객체 배열
					
		for(int i = 0; i < SIZE_OF_RESTAURANT_LIST; i++) {  // 상수만큼 반복
			
			listOfRandomNumbers[i] = random.nextInt(allOfRestaurantList.length) + 1; // 난수발생(3)
			
			for(int j = 0; j < i; j++) {
				if(listOfRandomNumbers[i] == listOfRandomNumbers[j]) {
					i--;
				}
			} // 난수 중복방지를 위한 반복문
			
			outputs[i] = new Restaurant();  // 레퍼런스 할당
			outputs[i] = this.binarySearch(listOfRandomNumbers[i], allOfRestaurantList);  // 객체배열에 객체 할당
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
