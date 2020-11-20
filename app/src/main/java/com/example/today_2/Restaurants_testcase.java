package com.example.today_2;

import java.util.Arrays;

public class Restaurants_testcase {

    private Restaurant[] restaurants;
    // restaurant에 변수 접근자를 private로 바꿔서 오류나는 거니까 알고리즘 다 짜고 이거 수정할예정

    public Restaurants_testcase() {
        Restaurant[] restaurants = new Restaurant[10];

        for (int i = 0; i < restaurants.length; i++) {
            restaurants[i] = new Restaurant();
        }


        int [][] zero = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 0, 1, 1, 0 },
                { 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

        int [][] one = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

        int [][] two = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

        int [][] three = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 1 } };

        int [][] four = new int[][] { { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1 } };

        int [][] five = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };

        int [][] six = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0 },
                { 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

        int [][] seven = new int[][] { { 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 } };

        int [][] eight = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 1 } };

        int [][] nine = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };



        restaurants[0].setRes_name("조커닭");
        restaurants[0].setRes_image(R.drawable.jokerdark);
        restaurants[0].setKeyword(zero);

        restaurants[1].setRes_name("아웃닭");
        restaurants[1].setRes_image(R.drawable.outdark);
        restaurants[1].setKeyword(one);

        restaurants[2].setRes_name("BHC");
        restaurants[2].setRes_image(R.drawable.bhc);
        restaurants[2].setKeyword(two);

        restaurants[3].setRes_name("국수나무");
        restaurants[3].setRes_image(R.drawable.guksunamu);
        restaurants[3].setKeyword(three);

        restaurants[4].setRes_name("고봉민");
        restaurants[4].setRes_image(R.drawable.gobongmin);
        restaurants[4].setKeyword(four);

        restaurants[5].setRes_name("욜로");
        restaurants[5].setRes_image(R.drawable.yolo);
        restaurants[5].setKeyword(five);

        restaurants[6].setRes_name("상남자키친");
        restaurants[6].setRes_image(R.drawable.sangnamja);
        restaurants[6].setKeyword(six);

        restaurants[7].setRes_name("비날");
        restaurants[7].setRes_image(R.drawable.binal);
        restaurants[7].setKeyword(seven);

        restaurants[8].setRes_name("핑청");
        restaurants[8].setRes_image(R.drawable.pingchung);
        restaurants[8].setKeyword(eight);

        restaurants[9].setRes_name("수복포차");
        restaurants[9].setRes_image(R.drawable.jokerdark);
        restaurants[9].setKeyword(nine);

        this.restaurants = restaurants;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

}