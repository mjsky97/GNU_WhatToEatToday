package main;

public class Keyword {
	private String Keyword_List[][] = {  {"����", "����", "���ɸ�", "��&��", null, null, null},
										{"ȸ��", "����Ʈ", "����(�Ұ���)", "������ �Ļ�", "������", "����³�"},
										{"ġŲ", "�ܹ���", "����", null, null, null, null},
										{"�ѽ�", "�߽�", "���", "�Ͻ�", "�н�", "�и�", "�н�"}
									 };

	public String[][] getKeyword_List() {
		return Keyword_List;
	}

	public void setKeyword_List(String[][] keyword_List) {
		Keyword_List = keyword_List;
	}
	
	
}

// 4*7 ���