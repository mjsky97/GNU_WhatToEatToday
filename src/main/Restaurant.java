package main;

import java.util.Map;

public class Restaurant {
	private String restaurantName;
	private String restaurantLocationURL;
	private Review review;
	private int starpoint;
	private int [][] keyword;
	private int number;
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantLocationURL() {
		return restaurantLocationURL;
	}
	public void setRestaurantLocationURL(String restaurantLocationURL) {
		this.restaurantLocationURL = restaurantLocationURL;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public int getStarpoint() {
		return starpoint;
	}
	public void setStarpoint(int starpoint) {
		this.starpoint = starpoint;
	}
	public int[][] getKeyword() {
		return keyword;
	}
	public void setKeyword(int[][] keyword) {
		this.keyword = keyword;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
