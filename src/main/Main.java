package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> column = new ArrayList(); // 행 정보를 저장
		ArrayList<Integer> line = new ArrayList();   // 열 정보를 저장
		
		//int same_matrix_index = 0;
		
		/*int [][] test = new int[][] { { 1, 1, 1, 0, 1, 0, 0 }, { 1, 1, 1, 0, 1, 1, 0 },
			{ 1, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 1 } };
		
			for(int i = 0; i < test.length; i++) {
				for (int j = 0; j < test[i].length; j++) {
					if (test[i][j] == 1) {
						column.add(i);
						line.add(j);
					}
				}
			}
		
		for(int i = 0; i < column.size(); i++) {
			System.out.print("[" + column.get(i) + "," + line.get(i) + "]");
			System.out.println();
		}*/
		
		column.add(2);
		column.add(3);
		column.add(3);
		column.add(5);
		column.add(7);
		column.add(8);
		column.add(1);
		column.add(4);
		column.add(3);
		
		System.out.println(column.indexOf(8));
		
		System.out.println(Collections.max(column));
		
		Collections.sort(column);
		
		System.out.println(column.indexOf(8));
		
		System.out.println(column.isEmpty());
	}

}
