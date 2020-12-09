package com.example.today_7;

public class Restaurant {


    //이미지 부분 추가
    private int restaurantImage;


    public int getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(int restaurantImage) {
        this.restaurantImage = restaurantImage;
    }




    private String restaurantName;
    private String restaurantLocationURL;
    private Keyword keyword = new Keyword();
    private Review review;
    private int starpoint;
    private int [][] keyword2D;

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
    public Keyword getKeyword() {
        return keyword;
    }
    public void setKeyword2D(Keyword keyword) {
        this.keyword = keyword;
    }
    public int[][] getKeyword2D() {
        return keyword2D;
    }
    public void setKeyword2D(int[][] keyword2d) {
        keyword2D = keyword2d;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


}