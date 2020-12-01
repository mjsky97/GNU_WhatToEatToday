package maintest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ManageRestaurantsData;
import main.RecommendByKeyword;
import main.Restaurant;
import main.Restaurants_testcase;
import main.UserInput;

public class RecommendByKeywordTest {

	@Test
	public void testListOfRecommendedList() {
		
		Restaurant [] outputs1;
		Restaurant [] compare = new Restaurant[9];
		
		int [][] input = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			// input으로 들어갈 임의의 2차원 배열 생성
			
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
			
		UserInput ui_1 = new UserInput();
		ui_1.setinput2Dlist(input);
		
		RecommendByKeyword keyword = new RecommendByKeyword();
		keyword.setUserInput(ui_1);
		keyword.listOfRecommendedList(mrd.getRestaurantlist());
		
		outputs1 = keyword.getResults();
		
		compare[0] = rt.getRestaurants()[0];
		compare[1] = rt.getRestaurants()[1];
		compare[2] = rt.getRestaurants()[2];
		compare[3] = rt.getRestaurants()[5];
		compare[4] = rt.getRestaurants()[6];
		compare[5] = rt.getRestaurants()[8];
		compare[6] = rt.getRestaurants()[9];
		compare[7] = rt.getRestaurants()[10];
		compare[8] = rt.getRestaurants()[7];
		// 기대값에 대한 배열 생성
		
		assertNotNull(outputs1);
		assertArrayEquals(compare, outputs1);
	}

}
