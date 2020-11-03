package main;

import java.util.Arrays;

public class Restaurants_testcase {
	
	// restaurant에 변수 접근자를 private로 바꿔서 오류나는 거니까 알고리즘 다 짜고 이거 수정할예정

	public Restaurants_testcase() {
		Restaurant[] restaurants = new Restaurant[10];

		for (int i = 0; i < restaurants.length; i++) {
			restaurants[i] = new Restaurant();
		}

		restaurants[0].Res_name = "조커닭";
		restaurants[0].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 0, 1, 1, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

		restaurants[1].Res_name = "아웃닭";
		restaurants[1].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

		restaurants[2].Res_name = "BHC";
		restaurants[2].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

		restaurants[3].Res_name = "국수나무";
		restaurants[3].keyword = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 1 } };

		restaurants[4].Res_name = "고봉민";
		restaurants[4].keyword = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 } };

		restaurants[5].Res_name = "욜로";
		restaurants[5].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

		restaurants[6].Res_name = "상남자키친";
		restaurants[6].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

		restaurants[7].Res_name = "비날";
		restaurants[7].keyword = new int[][] { { 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

		restaurants[8].Res_name = "핑청";
		restaurants[8].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 1 } };

		restaurants[9].Res_name = "수복포차";
		restaurants[9].keyword = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
	}

}
