package main;

import java.util.ArrayList;
import java.util.Collections;


public class RecommendByKeyword implements RecommendResaurantList{ // ���� ������
	private Restaurant[] results;
	
	public Restaurant [] listOfRecommendedList(UserInput input, Restaurant[] restaurantlist) {
			
		ArrayList<Integer> count = new ArrayList<Integer>(); // �� �������� Ű���尡 input�̶� ��� ��ġ�ϴ��� ����
		ArrayList<Integer> indexOfRestaurantList = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>(); // �� ������ ����
		ArrayList<Integer> line = new ArrayList<Integer>();   // �� ������ ����
		
					
		int [][] cloneOfUserInput = input.getinput2Dlist();
		
		int same = 0;
		
		for(int i = 0; i < cloneOfUserInput.length; i++) {
			for (int j = 0; j < cloneOfUserInput[i].length; j++) {
				if (cloneOfUserInput[i][j] == 1) {
					column.add(i);
					line.add(j);
				}
			}
		}  // input���� ���� 2�����迭�� 1�� index ���� ����
		
		for(int i = 0; i < restaurantlist.length; i++) {
			for(int j = 0; j < column.size(); j++) {
				int [][] cloneOfRestaurantKeyword = restaurantlist[i].getKeyword();
				if(cloneOfRestaurantKeyword[column.get(j)][line.get(j)] == 1) {
					same = same + 1;
				}
			}
			count.add(same);
			same = 0;
		}  // �� �������� ������ �ִ� Ű���尡 input�� ��� ��ġ�ϴ��� Ȯ�� �� ����
		
		int maximumOfCountList = Collections.max(count);
		
		for(int i = 0; i < count.size(); i++) {
			if(count.indexOf(maximumOfCountList) == -1) {
				if(maximumOfCountList == 0) {
					break;
				}
				maximumOfCountList = maximumOfCountList - 1;
			}
			
			int index = count.indexOf(maximumOfCountList);
			if(index == -1) {
				continue;
			}
			indexOfRestaurantList.add(index);
			count.set(index, 0);
		}
		
		Restaurant [] outputs = new Restaurant[indexOfRestaurantList.size()];
		
		for(int i = 0; i < indexOfRestaurantList.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = restaurantlist[indexOfRestaurantList.get(i)];
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
