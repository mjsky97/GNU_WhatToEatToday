package main;

public class Manage_Restaurants_Data {
	
	private Restaurant[] Restauratn_list;
	
	public Manage_Restaurants_Data(Restaurants_testcase rt) {
		Restauratn_list = rt.getRestaurants();
	}

	public Restaurant[] getRestauratn_list() {
		return Restauratn_list;
	}

	public void setRestauratn_list(Restaurant[] Restauratn_list) {
		this.Restauratn_list = Restauratn_list;
	}
	
	

}
