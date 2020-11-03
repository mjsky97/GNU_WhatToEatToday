package main;

public class KeywordCheck {
	// 필요없음
	private Keyword keyword;
	private int [][] input_2D_list;
	
	public KeywordCheck(int [][] input_2D_list) {
		this.input_2D_list = input_2D_list;
	}
	public Keyword check() {
		Keyword keyword =  new Keyword();
		
		if(input_2D_list[0][0] == 1) {
			keyword.liquor = new Liquor(input_2D_list[0][0]);
			
			for(int i = 1; i < keyword.liquor.Liquor_Category_List.length; i++) {
				keyword.liquor.map.put(keyword.liquor.Liquor_Category_List[i-1], input_2D_list[0][i]);
			}
			
		}
		
		if(input_2D_list[1][0] == 1) {
			keyword.situation = new Situation(input_2D_list[0][0]);
			
			for(int i = 1; i < keyword.situation.Situation_Category_List.length; i++) {
				keyword.situation.map.put(keyword.situation.Situation_Category_List[i-1], input_2D_list[0][i]);
			}
			
		}
		
		if(input_2D_list[2][0] == 1) {
			keyword.fastfood = new Fastfood(input_2D_list[0][0]);
			
			for(int i = 1; i < keyword.fastfood.Fastfood_Category_List.length; i++) {
				keyword.fastfood.map.put(keyword.fastfood.Fastfood_Category_List[i-1], input_2D_list[0][i]);
			}
		}
		
		if(input_2D_list[3][0] == 1) {
			keyword.theme = new Theme(input_2D_list[0][0]);
			
			for(int i = 1; i < keyword.theme.Theme_Category_List.length; i++) {
				keyword.theme.map.put(keyword.theme.Theme_Category_List[i-1], input_2D_list[0][i]);
			}
		}
		
		return keyword;
		
	}
}
