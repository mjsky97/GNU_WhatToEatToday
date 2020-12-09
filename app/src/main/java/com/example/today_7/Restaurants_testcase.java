package com.example.today_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Restaurants_testcase { // keyword 는 4*8 행렬

    private Restaurant[] restaurants;

    public Restaurants_testcase() {
        Restaurant[] restaurants = new Restaurant[11];

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

        int [][] ten = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

        String LiquorCategoryList [] = {"소주", "맥주", "막걸리", "술&밥"};

        String SituationCategoryList [] = {"회식", "데이트", "과팅(소개팅)",
                "간단한 식사", "가성비", "비오는날", "격식"};

        String FastfoodCategoryList [] = {"치킨", "햄버거", "피자"};

        String ThemeCategoryList [] = {"국밥", "한식", "중식", "양식", "밀면", "분식", "일식"};

        int [] zero_liquor = { 1, 1, 0, 1 };
        int [] zero_situation = { 1, 1, 1, 0, 1, 1, 0 };
        int [] zero_fastfood = { 1, 0, 1 };
        int [] zero_theme = { 1, 0, 0, 0, 1, 0, 0};

        int [] one_liquor = { 1, 1, 0, 1 };
        int [] one_situation = { 0, 1, 0, 1, 0, 0, 0 };
        int [] one_fastfood = { 1, 0, 0 };
        int [] one_theme = { 0, 0, 0, 0, 0, 0, 0 };

        int [] two_liquor = { 1, 1, 0, 1 };
        int [] two_situation = { 0, 1, 0, 1, 0, 0, 0 };
        int [] two_fastfood = { 1, 0, 0 };
        int [] two_theme = { 0, 0, 0, 0, 0, 0, 0 };

        int [] three_liquor = { 0, 0, 0, 0 };
        int [] three_situation = { 0, 1, 0, 1, 1, 1, 0 };
        int [] three_fastfood = { 0, 0, 0 };
        int [] three_theme = { 0, 1, 1, 0, 1, 1, 0 };

        int [] four_liquor = { 0, 0, 0, 0 };
        int [] four_situation = { 0, 1, 0, 1, 1, 0, 0 };
        int [] four_fastfood = { 0, 0, 0 };
        int [] four_theme = { 0, 1, 0, 1, 1, 1, 0 };

        int [] five_liquor = { 1, 1, 0, 1 };
        int [] five_situation = { 0, 1, 1, 0, 0, 0, 0 };
        int [] five_fastfood = { 1, 0, 1 };
        int [] five_theme = { 0, 0, 0, 1, 0, 1, 0 };

        int [] six_liquor = { 1, 1, 0, 1 };
        int [] six_situation = { 0, 1, 0, 0, 0, 0, 0 };
        int [] six_fastfood = { 1, 0, 1 };
        int [] six_theme = { 0, 0, 0, 1, 0, 0, 0 };

        int [] seven_liquor = { 1, 1, 0, 0 };
        int [] seven_situation = { 1, 1, 1, 0, 1, 1, 0 };
        int [] seven_fastfood = { 0, 0, 0 };
        int [] seven_theme = { 0, 0, 0, 1, 0, 0, 0 };

        int [] eight_liquor = { 1, 1, 0, 1 };
        int [] eight_situation = { 1, 1, 1, 1, 1, 1, 0 };
        int [] eight_fastfood = { 1, 0, 0 };
        int [] eight_theme = { 0, 1, 1, 1, 0, 1, 0 };

        int [] nine_liquor = { 1, 1, 0, 1 };
        int [] nine_situation = { 0, 1, 0, 1, 0, 0, 0 };
        int [] nine_fastfood = { 1, 0, 0 };
        int [] nine_theme = { 0, 0, 0, 0, 0, 0, 0 };

        int [] ten_liquor = { 1, 1, 0, 1 };
        int [] ten_situation = { 0, 1, 0, 1, 0, 0, 0 };
        int [] ten_fastfood = { 1, 0, 0 };
        int [] ten_theme = { 0, 0, 0, 0, 0, 0, 0 };

        Map<String, Integer> map0 = new HashMap();
        Map<String, Integer> map1 = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        Map<String, Integer> map3 = new HashMap();
        Map<String, Integer> map4 = new HashMap();
        Map<String, Integer> map5 = new HashMap();
        Map<String, Integer> map6 = new HashMap();
        Map<String, Integer> map7 = new HashMap();
        Map<String, Integer> map8 = new HashMap();
        Map<String, Integer> map9 = new HashMap();
        Map<String, Integer> map10 = new HashMap();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < zero_liquor.length; j++) {
                map0.put(LiquorCategoryList[j], zero_liquor[j]);
            }

            for(int j = 0; j < zero_situation.length; j++) {
                map0.put(SituationCategoryList[j], zero_situation[j]);
            }

            for(int j = 0; j < zero_fastfood.length; j++) {
                map0.put(FastfoodCategoryList[j], zero_fastfood[j]);
            }

            for(int j = 0; j < zero_theme.length; j++) {
                map0.put(ThemeCategoryList[j], zero_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < one_liquor.length; j++) {
                map1.put(LiquorCategoryList[j], one_liquor[j]);
            }

            for(int j = 0; j < one_situation.length; j++) {
                map1.put(SituationCategoryList[j], one_situation[j]);
            }

            for(int j = 0; j < one_fastfood.length; j++) {
                map1.put(FastfoodCategoryList[j], one_fastfood[j]);
            }

            for(int j = 0; j < one_theme.length; j++) {
                map1.put(ThemeCategoryList[j], one_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < two_liquor.length; j++) {
                map2.put(LiquorCategoryList[j], two_liquor[j]);
            }

            for(int j = 0; j < two_situation.length; j++) {
                map2.put(SituationCategoryList[j], two_situation[j]);
            }

            for(int j = 0; j < two_fastfood.length; j++) {
                map2.put(FastfoodCategoryList[j], two_fastfood[j]);
            }

            for(int j = 0; j < two_theme.length; j++) {
                map2.put(ThemeCategoryList[j], two_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < three_liquor.length; j++) {
                map3.put(LiquorCategoryList[j], three_liquor[j]);
            }

            for(int j = 0; j < three_situation.length; j++) {
                map3.put(SituationCategoryList[j], three_situation[j]);
            }

            for(int j = 0; j < three_fastfood.length; j++) {
                map3.put(FastfoodCategoryList[j], three_fastfood[j]);
            }

            for(int j = 0; j < three_theme.length; j++) {
                map3.put(ThemeCategoryList[j], three_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < four_liquor.length; j++) {
                map4.put(LiquorCategoryList[j], four_liquor[j]);
            }

            for(int j = 0; j < four_situation.length; j++) {
                map4.put(SituationCategoryList[j], four_situation[j]);
            }

            for(int j = 0; j < four_fastfood.length; j++) {
                map4.put(FastfoodCategoryList[j], four_fastfood[j]);
            }

            for(int j = 0; j < four_theme.length; j++) {
                map4.put(ThemeCategoryList[j], four_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < five_liquor.length; j++) {
                map5.put(LiquorCategoryList[j], five_liquor[j]);
            }

            for(int j = 0; j < five_situation.length; j++) {
                map5.put(SituationCategoryList[j], five_situation[j]);
            }

            for(int j = 0; j < five_fastfood.length; j++) {
                map5.put(FastfoodCategoryList[j], five_fastfood[j]);
            }

            for(int j = 0; j < five_theme.length; j++) {
                map5.put(ThemeCategoryList[j], five_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < six_liquor.length; j++) {
                map6.put(LiquorCategoryList[j], six_liquor[j]);
            }

            for(int j = 0; j < six_situation.length; j++) {
                map6.put(SituationCategoryList[j], six_situation[j]);
            }

            for(int j = 0; j < six_fastfood.length; j++) {
                map6.put(FastfoodCategoryList[j], six_fastfood[j]);
            }

            for(int j = 0; j < six_theme.length; j++) {
                map6.put(ThemeCategoryList[j], six_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < seven_liquor.length; j++) {
                map7.put(LiquorCategoryList[j], seven_liquor[j]);
            }

            for(int j = 0; j < seven_situation.length; j++) {
                map7.put(SituationCategoryList[j], seven_situation[j]);
            }

            for(int j = 0; j < seven_fastfood.length; j++) {
                map7.put(FastfoodCategoryList[j], seven_fastfood[j]);
            }

            for(int j = 0; j < seven_theme.length; j++) {
                map7.put(ThemeCategoryList[j], seven_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < eight_liquor.length; j++) {
                map8.put(LiquorCategoryList[j], eight_liquor[j]);
            }

            for(int j = 0; j < eight_situation.length; j++) {
                map8.put(SituationCategoryList[j], eight_situation[j]);
            }

            for(int j = 0; j < eight_fastfood.length; j++) {
                map8.put(FastfoodCategoryList[j], eight_fastfood[j]);
            }

            for(int j = 0; j < eight_theme.length; j++) {
                map8.put(ThemeCategoryList[j], eight_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < nine_liquor.length; j++) {
                map9.put(LiquorCategoryList[j], nine_liquor[j]);
            }

            for(int j = 0; j < nine_situation.length; j++) {
                map9.put(SituationCategoryList[j], nine_situation[j]);
            }

            for(int j = 0; j < nine_fastfood.length; j++) {
                map9.put(FastfoodCategoryList[j], nine_fastfood[j]);
            }

            for(int j = 0; j < nine_theme.length; j++) {
                map9.put(ThemeCategoryList[j], nine_theme[j]);
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < ten_liquor.length; j++) {
                map10.put(LiquorCategoryList[j], ten_liquor[j]);
            }

            for(int j = 0; j < ten_situation.length; j++) {
                map10.put(SituationCategoryList[j], ten_situation[j]);
            }

            for(int j = 0; j < ten_fastfood.length; j++) {
                map10.put(FastfoodCategoryList[j], ten_fastfood[j]);
            }

            for(int j = 0; j < ten_theme.length; j++) {
                map10.put(ThemeCategoryList[j], ten_theme[j]);
            }
        }


        restaurants[0].setRestaurantName("조커닭");
        restaurants[0].setKeyword2D(zero);
        restaurants[0].setNumber(1);
        restaurants[0].getKeyword().setMap(map0);

        restaurants[1].setRestaurantName("아웃닭");
        restaurants[1].setKeyword2D(one);
        restaurants[1].setNumber(2);
        restaurants[1].getKeyword().setMap(map1);

        restaurants[2].setRestaurantName("BHC");
        restaurants[2].setKeyword2D(two);
        restaurants[2].setNumber(3);
        restaurants[2].getKeyword().setMap(map2);

        restaurants[3].setRestaurantName("국수나무");
        restaurants[3].setKeyword2D(three);
        restaurants[3].setNumber(4);
        restaurants[3].getKeyword().setMap(map3);

        restaurants[4].setRestaurantName("고봉민");
        restaurants[4].setKeyword2D(four);
        restaurants[4].setNumber(5);
        restaurants[4].getKeyword().setMap(map4);

        restaurants[5].setRestaurantName("욜로");
        restaurants[5].setKeyword2D(five);
        restaurants[5].setNumber(6);
        restaurants[5].getKeyword().setMap(map5);

        restaurants[6].setRestaurantName("상남자키친");
        restaurants[6].setKeyword2D(six);
        restaurants[6].setNumber(7);
        restaurants[6].getKeyword().setMap(map6);

        restaurants[7].setRestaurantName("비날");
        restaurants[7].setKeyword2D(seven);
        restaurants[7].setNumber(8);
        restaurants[7].getKeyword().setMap(map7);

        restaurants[8].setRestaurantName("핑청");
        restaurants[8].setKeyword2D(eight);
        restaurants[8].setNumber(9);
        restaurants[8].getKeyword().setMap(map8);

        restaurants[9].setRestaurantName("수복포차");
        restaurants[9].setKeyword2D(nine);
        restaurants[9].setNumber(10);
        restaurants[9].getKeyword().setMap(map9);

        restaurants[10].setRestaurantName("만고포차");
        restaurants[10].setKeyword2D(ten);
        restaurants[10].setNumber(11);
        restaurants[10].getKeyword().setMap(map10);

        this.restaurants = restaurants;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }
}