package com.example.today_7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareByKeyword implements CompareUserInputandResaurantList {

    private Restaurant[] results;
    private UserInput userInput;

    public void compare(Restaurant[] allOfRestaurantList) {

        String [] cloneOfInputKeywords = userInput.getInputKeyword(); // 입력한 문자열을 받음

        ArrayList<Restaurant> matchedRestaurants = new ArrayList<Restaurant>(); // 결과를 저장할 List

        for(int i = 0; i < allOfRestaurantList.length; i++) {

            int same = 0;

            Map<String, Integer> cloneOfMap = allOfRestaurantList[i].getKeyword().getMap(); // 음식점 맵 변수 비교를 위한 복제

            for(int j = 0; j < cloneOfInputKeywords.length; j++) {

                if((int)cloneOfMap.get(cloneOfInputKeywords[j]) == 1) {
                    same ++;
                } // 음식점 키워드 중 입력받은 문자열에 해당한는 부분이 1이면

                if(same == cloneOfInputKeywords.length) {
                    matchedRestaurants.add(allOfRestaurantList[i]);
                } // 입력받은 문자열의 길이와 음식점의 키워드가 1 인 갯수가 일치하면 결과에 추가
            }
        }

        Restaurant [] outputs = new Restaurant[matchedRestaurants.size()];

        for(int i = 0; i < matchedRestaurants.size(); i++) {
            outputs[i] = new Restaurant();
            outputs[i] = matchedRestaurants.get(i);
        }

        //outputs = (Restaurant[]) matchedRestaurants.toArray();

        this.results = outputs;


    }

    public Restaurant[] getResults() {
        return results;
    }

    public void setResults(Restaurant[] results) {
        this.results = results;
    }

    public UserInput getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInput userInput) {
        this.userInput = userInput;
    }

}