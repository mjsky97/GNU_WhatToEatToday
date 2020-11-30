package main;

import java.util.ArrayList;
import java.util.Collections;


public class RecommendByKeyword implements RecommendResaurantList{
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void listOfRecommendedList(Restaurant[] allOfRestaurantList) {
			
		ArrayList<Integer> count = new ArrayList<Integer>(); // �� �������� Ű���尡 input�̶� ��� ��ġ�ϴ��� ����
		ArrayList<Integer> indexOfRestaurantList = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>(); // �� ������ ����
		ArrayList<Integer> line = new ArrayList<Integer>();   // �� ������ ����
					
		int same = 0;
		
		for(int i = 0; i < userInput.getinput2Dlist().length; i++) {
			for (int j = 0; j < userInput.getinput2Dlist()[i].length; j++) {
				if (userInput.getinput2Dlist()[i][j] == 1) {
					column.add(i);
					line.add(j);
				}
			}
		} // input���� ���� 2�����迭�� 1�� index ���� ����

		
		for(int i = 0; i < allOfRestaurantList.length; i++) {
			for(int j = 0; j < column.size(); j++) {
				if(allOfRestaurantList[i].getKeyword()[column.get(j)][line.get(j)] == 1) {
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
			outputs[i] = allOfRestaurantList[indexOfRestaurantList.get(i)];
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
