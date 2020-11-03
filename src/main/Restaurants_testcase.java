package main;

import java.util.Arrays;

public class Restaurants_testcase {

	public Restaurants_testcase() {
		Restaurant[] restaurants = new Restaurant[10];

		for (int i = 0; i < restaurants.length; i++) {
			restaurants[i] = new Restaurant();
		}

		restaurants[0].Res_name = "Á¶Ä¿´ß";
		restaurants[0].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 0, 1, 1, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

		restaurants[1].Res_name = "¾Æ¿ô´ß";
		restaurants[1].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

		restaurants[2].Res_name = "BHC";
		restaurants[2].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

		restaurants[3].Res_name = "±¹¼ö³ª¹«";
		restaurants[3].keyword = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 1 } };

		restaurants[4].Res_name = "°íºÀ¹Î";
		restaurants[4].keyword = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 } };

		restaurants[5].Res_name = "¿ç·Î";
		restaurants[5].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

		restaurants[6].Res_name = "»ó³²ÀÚÅ°Ä£";
		restaurants[6].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

		restaurants[7].Res_name = "ºñ³¯";
		restaurants[7].keyword = new int[][] { { 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

		restaurants[8].Res_name = "ÇÎÃ»";
		restaurants[8].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 1 } };

		restaurants[9].Res_name = "¼öº¹Æ÷Â÷";
		restaurants[9].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
	}

}
