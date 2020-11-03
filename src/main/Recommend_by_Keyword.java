package main;

import java.util.ArrayList;
import java.util.Collections;


public class Recommend_by_Keyword { // 여기 진행중
	private Restaurant[] results;
	
	public Restaurant [] Re_keyword(User_Input input, Restaurant[] All_list) {
			
		ArrayList<Integer> count = new ArrayList<Integer>(); // 각 음식점의 키워드가 input이랑 몇개나 일치하는지 저장
		ArrayList<Integer> index_of_Res_list = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>(); // 행 정보를 저장
		ArrayList<Integer> line = new ArrayList<Integer>();   // 열 정보를 저장
		
					
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
		
		for(int i = 0; i < count.size(); i++) {
			if(count.indexOf(max_count) == -1) {
				if(max_count == 0) {
					break;
				}
				max_count = max_count - 1;
			}
			
			int index = count.indexOf(max_count);
			if(index == -1) {
				continue;
			}
			index_of_Res_list.add(index);
			count.set(index, 0);
		}
		
		Restaurant [] outputs = new Restaurant[index_of_Res_list.size()];
		
		for(int i = 0; i < index_of_Res_list.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = All_list[index_of_Res_list.get(i)];
		}
		
		return outputs;
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

}
