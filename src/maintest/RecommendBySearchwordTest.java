package maintest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ManageRestaurantsData;
import main.RecommendBySearchword;
import main.Restaurant;
import main.Restaurants_testcase;
import main.UserInput;

public class RecommendBySearchwordTest {

	@Test
	public void testListOfRecommendedList() {
		
		Restaurant [] outputs3;
		Restaurant [] compare = new Restaurant[2];		
		
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
		
		UserInput ui_2 = new UserInput();
		ui_2.setSearchword("포차");
		
		RecommendBySearchword search = new RecommendBySearchword();
		search.setUserInput(ui_2);
		search.listOfRecommendedList(mrd.getRestaurantlist());
		
		compare[0] = rt.getRestaurants()[9];		// 수복포차
		compare[1] = rt.getRestaurants()[10];		// 만고포차
		
		outputs3 = search.getResults();
		
		assertNotNull(outputs3);
		assertArrayEquals(compare, outputs3);
		
	}

}
