package com.example.today_7;

public class RecommendByKeyword  implements RecommendRestaurants {

    private Restaurant[] results;
    private UserInput userInput;

    public void RecommendRestaurantsList() {
        Restaurant [] outputs;

        Restaurants_testcase rt = new Restaurants_testcase(); // 테스트케이스 객체생성
        ManageRestaurantsData mrd = new ManageRestaurantsData(rt); // 테스트케이스에 있는 음식점 배열을 가져오는 부분

        CompareByKeyword km = new CompareByKeyword(); //비교하는 알고리즘이 있는 객체 생성
        km.setUserInput(this.userInput); // 객체에다가 input을 할당
        km.compare(mrd.getRestaurantlist()); // 모든 음식점 리스트를 가져와서 비교 메소드 실행

        outputs = km.getResults(); // 결과(Restaurant [])->ArrayList 바꿀순 있음

        if(outputs.length == 0) {
            System.out.println("There's no results");   //하 이건 어찌표현?
        }

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