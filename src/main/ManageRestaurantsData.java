package main;

public class ManageRestaurantsData {
	
	private Restaurant[] restaurantlist;
	
	public ManageRestaurantsData(Restaurants_testcase rt) {
		restaurantlist = rt.getRestaurants();
	}

	public Restaurant[] getRestauratn_list() {
		return restaurantlist;
	}

	public void setRestauratn_list(Restaurant[] restauratnlist) {
		this.restaurantlist = restauratnlist;
	}
	
	

}
