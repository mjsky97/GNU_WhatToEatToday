package main;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		Restaurant [] outputs;
		
		
		int [][] input = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };
			
		UserInput ui = new UserInput();
		ui.setinput2Dlist(input);
		
		DecideRecommend dr = new DecideRecommend(ui);

		dr.decide();
		
		outputs = dr.getRbK().getResults();
		
		for(int i = 0; i < outputs.length; i++) {
			System.out.println(outputs[i].getRes_name());
		}
		
		Keyword keyword = new Keyword();
		
		
		
	}
		
		

}
