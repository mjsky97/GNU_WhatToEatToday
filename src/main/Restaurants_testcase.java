package main;

import java.util.Arrays;

public class Restaurants_testcase { // keyword ´Â 4*8 Çà·Ä
	
	private Restaurant[] restaurants;

	public Restaurants_testcase() {
		Restaurant[] restaurants = new Restaurant[11];

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
			
		int [][] ten = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
		
		restaurants[0].setRestaurantName("Á¶Ä¿´ß");
		restaurants[0].setKeyword(zero);
		restaurants[0].setNumber(1);
		
		restaurants[1].setRestaurantName("¾Æ¿ô´ß");
		restaurants[1].setKeyword(one);
		restaurants[1].setNumber(2);
		
		restaurants[2].setRestaurantName("BHC");
		restaurants[2].setKeyword(two);
		restaurants[2].setNumber(3);
		
		restaurants[3].setRestaurantName("±¹¼ö³ª¹«");
		restaurants[3].setKeyword(three);
		restaurants[3].setNumber(4);
		
		restaurants[4].setRestaurantName("°íºÀ¹Î");
		restaurants[4].setKeyword(four);
		restaurants[4].setNumber(5);
		
		restaurants[5].setRestaurantName("¿ç·Î");
		restaurants[5].setKeyword(five);
		restaurants[5].setNumber(6);
		
		restaurants[6].setRestaurantName("»ó³²ÀÚÅ°Ä£");
		restaurants[6].setKeyword(six);
		restaurants[6].setNumber(7);
		
		restaurants[7].setRestaurantName("ºñ³¯");
		restaurants[7].setKeyword(seven);
		restaurants[7].setNumber(8);
		
		restaurants[8].setRestaurantName("ÇÎÃ»");
		restaurants[8].setKeyword(eight);
		restaurants[8].setNumber(9);
		
		restaurants[9].setRestaurantName("¼öº¹Æ÷Â÷");
		restaurants[9].setKeyword(nine);
		restaurants[9].setNumber(10);
		
		restaurants[10].setRestaurantName("¸¸°íÆ÷Â÷");
		restaurants[10].setKeyword(ten);
		restaurants[10].setNumber(11);
		
		this.restaurants = restaurants;
	}

	public Restaurant[] getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}
}
