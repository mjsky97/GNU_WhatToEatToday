package main;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		Restaurant [] outputs1;
		Restaurant [] outputs2;
		Restaurant [] outputs3;
		
		
		int [][] input = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
			
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);

		System.out.println("START POINT OF RECOMMEND BY KEYWORD");
		
		UserInput ui_1 = new UserInput();
		ui_1.setinput2Dlist(input);
		
		RecommendByKeyword keyword = new RecommendByKeyword();
		keyword.setUserInput(ui_1);
		keyword.listOfRecommendedList(mrd.getRestaurantlist());
		
		outputs1 = keyword.getResults();
		
		if(outputs1.length == 0) {
			System.out.println("There's no results");
		}
		else {
			for(int i = 0; i < outputs1.length; i++) {
				System.out.println(outputs1[i].getRestaurantName());
			}			
		}
		
		System.out.println("END POINT OF RECOMMEND BY KEYWORD");
		
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println();
		
		
		System.out.println("START POINT OF RECOMMEND RANDOM");
		
		RecommendRandom random = new RecommendRandom();
		random.listOfRecommendedList(mrd.getRestaurantlist());
		outputs2 = random.getResults();
		
		for(int i = 0; i < outputs2.length; i++) {
			System.out.println(outputs2[i].getRestaurantName());
		}
		
		System.out.println("END POINT OF RECOMMEND RANDOM");
		
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println();
		
		
		System.out.println("START POINT OF SEARCH BY SEARCHWORD");
		
		UserInput ui_2 = new UserInput();
		ui_2.setSearchword("Æ÷Â÷");
		
		RecommendBySearchword search = new RecommendBySearchword();
		search.setUserInput(ui_2);
		search.listOfRecommendedList(mrd.getRestaurantlist());
		
		outputs3 = search.getResults();
		
		if(outputs3.length == 0) {
			System.out.println("There's no results");
		}
		else {
			
			for(int i = 0; i < outputs3.length; i++) {
				System.out.println(outputs3[i].getRestaurantName());
			}	
			
		}
		
		System.out.println("END POINT OF SEARCH BY SEARCHWORD");
		
	}
	
}
