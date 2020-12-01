package maintest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ManageRestaurantsData;
import main.RecommendRandom;
import main.Restaurant;
import main.Restaurants_testcase;

public class RecommendRandomTest {

	//@Test
	/*public void testBinarySearch() {
		fail("Not yet implemented");
		
		Restaurant test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12;
				
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
		
		RecommendRandom random = new RecommendRandom();
			
		test1 = random.binarySearch(0, mrd.getRestaurantlist());
		test2 = random.binarySearch(1, mrd.getRestaurantlist());
		test3 = random.binarySearch(2, mrd.getRestaurantlist());
		test4 = random.binarySearch(3, mrd.getRestaurantlist());
		test5 = random.binarySearch(4, mrd.getRestaurantlist());
		test6 = random.binarySearch(5, mrd.getRestaurantlist());
		test7 = random.binarySearch(6, mrd.getRestaurantlist());
		test8 = random.binarySearch(7, mrd.getRestaurantlist());
		test9 = random.binarySearch(8, mrd.getRestaurantlist());
		test10 = random.binarySearch(9, mrd.getRestaurantlist());
		test11 = random.binarySearch(10, mrd.getRestaurantlist());
		test12 = random.binarySearch(11, mrd.getRestaurantlist());
		
		
		assertNotNull(test1);
		assertNotNull(test2);
		assertNotNull(test3);
		assertNotNull(test4);
		assertNotNull(test5);
		assertNotNull(test6);
		assertNotNull(test7);
		assertNotNull(test8);
		assertNotNull(test9);
		assertNotNull(test10);
		assertNotNull(test11);		// 반환된 객체가 Null이 아닌지 확인
		
		assertNull(test12); 		// 입력되어있지 않은 값에 대하여 검색을 했으므로 Null인지 확인
		
		
		assertSame(mrd.getRestaurantlist()[0], test1);
		assertSame(mrd.getRestaurantlist()[1], test2);
		assertSame(mrd.getRestaurantlist()[2], test3);
		assertSame(mrd.getRestaurantlist()[3], test4);
		assertSame(mrd.getRestaurantlist()[4], test5);
		assertSame(mrd.getRestaurantlist()[5], test6);
		assertSame(mrd.getRestaurantlist()[6], test7);
		assertSame(mrd.getRestaurantlist()[7], test8);
		assertSame(mrd.getRestaurantlist()[8], test9);
		assertSame(mrd.getRestaurantlist()[9], test10);
		assertSame(mrd.getRestaurantlist()[10], test11); 		// 함수를 통해 찾은 결과가 실제값과 같은지 확인
			
	}*/
	
	//  질문해야할 사항! (인터페이스에 정의되어있지 않아 test가 불가,
	//  하지만 이 함수는 Random에만 사용되기에 다른 클래스에 구현될 필요가 없음
	//  test 방법이 의문

	@Test
	public void testListOfRecommendedList() {
		
		Restaurant [] outputs2;
		
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
		
		RecommendRandom random = new RecommendRandom();
		random.listOfRecommendedList(mrd.getRestaurantlist());
		outputs2 = random.getResults();
		
		assertNotNull(outputs2);
		
	}

}
