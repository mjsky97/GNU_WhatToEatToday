package com.example.today_2;

public class User_Input {
    private String search_word = null;
    private static int [][] input_2D_list = { { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 } };

    public String get_Search_word() {
        return search_word;
    }
    public void set_Search_word(String search_word) {
        this.search_word = search_word;
    }
    public static int[][] get_Input_2D_list() {
        return input_2D_list;
    }
    public static void set_Input_2D_list(int[][] input_2d_list) {
        input_2D_list = input_2d_list;
    }
}
