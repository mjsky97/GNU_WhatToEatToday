package com.example.today_7;

public class ManageRestaurantsData {

    private Restaurant[] restaurantlist;

    public ManageRestaurantsData(Restaurants_testcase rt) {
        restaurantlist = rt.getRestaurants();
    }

    public Restaurant[] getRestaurantlist() {
        return restaurantlist;
    }

    public void setRestaurantlist(Restaurant[] restauratnlist) {
        this.restaurantlist = restauratnlist;
    }



}