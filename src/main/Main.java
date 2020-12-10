package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("START POINT OF RECOMMEND RANDOM");
		
		RecommendRandom rr = new RecommendRandom();
		rr.RecommendRestaurantsList();
		Restaurant[] outputs2 = rr.getResults();
		
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
		ui_2.setSearchword("포차");
		
		RecommendBySearchword rs = new RecommendBySearchword();
		rs.setUserInput(ui_2);
		rs.RecommendRestaurantsList();
		Restaurant[] outputs3 = rs.getResults();
				
		if(outputs3.length == 0) {
			System.out.println("There's no results");
		}
		else {
			
			for(int i = 0; i < outputs3.length; i++) {
				System.out.println(outputs3[i].getRestaurantName());
			}	
			
		}
		
		System.out.println("END POINT OF SEARCH BY SEARCHWORD");
		
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println();
		
		
		System.out.println("START POINT OF RECOMMEND BY KEYWORD MAP");
		
		UserInput ui_3 = new UserInput();
		String [] testkeyword = {"회식"}; // Userinput
		ui_3.putInputKeywords(testkeyword[0]); // UserInput에다가 String배열을 할당
	
		RecommendByKeyword rk = new RecommendByKeyword();
		rk.setUserInput(ui_3);
		rk.RecommendRestaurantsList();
		Restaurant[] outputs4 = rk.getResults();
		
		if(outputs4.length == 0) {
			System.out.println("There's no results");
		}
		else {
			
			for(int i = 0; i < outputs4.length; i++) {
				System.out.println(outputs4[i].getRestaurantName());
			}	
			
		}
		
		System.out.println("START POINT OF RECOMMEND BY KEYWORD MAP"); 

						
	}

}
