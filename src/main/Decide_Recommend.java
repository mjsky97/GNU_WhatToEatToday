package main;

import java.util.Map;

public class Decide_Recommend {
	public User_Input user_input;
	
	public Decide_Recommend(User_Input user_input) {
		this.user_input = user_input;
	}
		
	public void decide() {
		if(user_input.get_Search_word() != null) {
			//�˻��� ��õ �Լ� ȣ��
		}
		
		else if(user_input.get_Input_2D_list() != null) {
			// Ű���� ��õ �Լ� ȣ��
			Recommend_by_Keyword keyword = new Recommend_by_Keyword();
			keyword.
			
		}
		
		else {
			//���� ��õ �Լ� ȣ��
		}
	}

}
