package main;

public class RecommendRandom implements RecommendRestaurants {
	
	private Restaurant[] results;
	
	public void RecommendRestaurantsList() {
		Restaurant [] outputs;
		
		Restaurants_testcase rt = new Restaurants_testcase(); // 테스트케이스 객체생성
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt); // 테스트케이스에 있는 음식점 배열을 가져오는 부분
		
		CompareRandom random = new CompareRandom();
		random.compare(mrd.getRestaurantlist());
		outputs = random.getResults();
		
		this.results = outputs;
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

}
