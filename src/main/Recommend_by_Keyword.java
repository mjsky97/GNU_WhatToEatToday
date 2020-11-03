package main;

import java.util.ArrayList;
import java.util.Collections;


public class Recommend_by_Keyword { // 여기 진행중
	private Restaurant[] results;
	
	public void Re_keyword(User_Input input, Restaurant[] All_list) {
		
		results = null;
		
		ArrayList<Integer> count = new ArrayList<>(); // 각 음식점의 키워드가 input이랑 몇개나 일치하는지 저장
		ArrayList<Integer> index_of_Res_list = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>(); // 행 정보를 저장
		ArrayList<Integer> line = new ArrayList<>();   // 열 정보를 저장
		
					
		int [][] input_clone = input.get_Input_2D_list();
		
		int same = 0;
		
		for(int i = 0; i < input_clone.length; i++) {
			for (int j = 0; j < input_clone[i].length; j++) {
				if (input_clone[i][j] == 1) {
					column.add(i);
					line.add(j);
				}
			}
		}  // input으로 들어온 2차원배열의 1의 index 들을 저장
		
		for(int i = 0; i < All_list.length; i++) {
			for(int j = 0; j < column.size(); j++) {
				int [][] restaurant_keyword_clone = All_list[i].getKeyword();
				if(restaurant_keyword_clone[column.get(j)][line.get(j)] == 1) {
					same = same + 1;
				}
			}
			count.add(same);
			same = 0;
		}  // 각 음식점이 가지고 있는 키워드가 input과 몇개나 일치하는지 확인 후 저장
		
		int max_count = Collections.max(count);
		
		while(max_count != 0) {
			
			if(count.indexOf(max_count) == -1) {
				max_count = max_count - 1;
			}
			
			int index = count.indexOf(max_count);
			index_of_Res_list.add(index);
		}
		
		for(int i = 0; i < index_of_Res_list.size(); i++) {
			results[i] = new Restaurant();
			results[i] = All_list[index_of_Res_list.get(i)];
		}
				
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

}
