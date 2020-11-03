package main;

import java.util.Arrays;

public class Restaurants_testcase { // keyword ´Â 4*8 Çà·Ä
	
	private Restaurant[] restaurants;

	public Restaurants_testcase() {
		Restaurant[] restaurants = new Restaurant[10];

		for (int i = 0; i < restaurants.length; i++) {
			restaurants[i] = new Restaurant();
		}
		
		
		int [][] zero = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 0, 1, 1, 0 },
			{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };
			
		int [][] one = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
		int [][] two = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
		int [][] three = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 1 } };
			
		int [][] four = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 } };
			
		int [][] five = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0, 0, 0 },
			{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

		int [][] six = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
			{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

		int [][] seven = new int[][] { { 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };
			
		int [][] eight = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 1 } };
			
		int [][] nine = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
		
		
		restaurants[0].setRes_name("Á¶Ä¿´ß");
		restaurants[0].setKeyword(zero);
		
		restaurants[1].setRes_name("¾Æ¿ô´ß");
		restaurants[1].setKeyword(one);
		
		restaurants[2].setRes_name("BHC");
		restaurants[2].setKeyword(two);
		
		restaurants[3].setRes_name("±¹¼ö³ª¹«");
		restaurants[3].setKeyword(three);
		
		restaurants[4].setRes_name("°íºÀ¹Î");
		restaurants[4].setKeyword(four);
		
		restaurants[5].setRes_name("¿ç·Î");
		restaurants[5].setKeyword(five);
		
		restaurants[6].setRes_name("»ó³²ÀÚÅ°Ä£");
		restaurants[6].setKeyword(six);
		
		restaurants[7].setRes_name("ºñ³¯");
		restaurants[7].setKeyword(seven);
		
		restaurants[8].setRes_name("ÇÎÃ»");
		restaurants[8].setKeyword(eight);
		
		restaurants[9].setRes_name("¼öº¹Æ÷Â÷");
		restaurants[9].setKeyword(nine);
		
		this.restaurants = restaurants;
	}

	public Restaurant[] getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}

}
