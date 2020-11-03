package main;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		Restaurant [] outputs;
		
		
		int [][] input = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
		User_Input ui = new User_Input();
		ui.set_Input_2D_list(input);
		
		Decide_Recommend dr = new Decide_Recommend(ui);

		dr.decide();
		
		outputs = dr.getR_b_K().getResults();
		
		System.out.println(outputs[0].getRes_name());
		
	}
		
		

}
