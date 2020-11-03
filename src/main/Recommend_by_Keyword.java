package main;

import java.util.ArrayList;
import java.util.Collections;


public class Recommend_by_Keyword { // ���� ������
	private Restaurant[] results;
	
	public Restaurant [] Re_keyword(User_Input input, Restaurant[] All_list) {
			
		ArrayList<Integer> count = new ArrayList<Integer>(); // �� �������� Ű���尡 input�̶� ��� ��ġ�ϴ��� ����
		ArrayList<Integer> index_of_Res_list = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>(); // �� ������ ����
		ArrayList<Integer> line = new ArrayList<Integer>();   // �� ������ ����
		
					
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
