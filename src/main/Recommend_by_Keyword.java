package main;

import java.util.ArrayList;
import java.util.Collections;


public class Recommend_by_Keyword { // ���� ������
	private Restaurant[] results;
	
	public void Re_keyword(User_Input input, Restaurant[] All_list) {
		
		results = null;
		
		ArrayList<Integer> count = new ArrayList<>(); // �� �������� Ű���尡 input�̶� ��� ��ġ�ϴ��� ����
		ArrayList<Integer> index_of_Res_list = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>(); // �� ������ ����
		ArrayList<Integer> line = new ArrayList<>();   // �� ������ ����
		
					
		int [][] input_clone = input.get_Input_2D_list();
		
		int same = 0;
		
		for(int i = 0; i < input_clone.length; i++) {
			for (int j = 0; j < input_clone[i].length; j++) {
				if (input_clone[i][j] == 1) {
					column.add(i);
					line.add(j);
				}
			}
		}  // input���� ���� 2�����迭�� 1�� index ���� ����
		
		for(int i = 0; i < All_list.length; i++) {
			for(int j = 0; j < column.size(); j++) {
				int [][] restaurant_keyword_clone = All_list[i].getKeyword();
				if(restaurant_keyword_clone[column.get(j)][line.get(j)] == 1) {
					same = same + 1;
				}
			}
			count.add(same);
			same = 0;
		}  // �� �������� ������ �ִ� Ű���尡 input�� ��� ��ġ�ϴ��� Ȯ�� �� ����
		
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
