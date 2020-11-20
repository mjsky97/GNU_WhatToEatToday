package com.example.today_2;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Select_hs_al extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_hs_al);

    }

    private String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자



    int [][] input_2D_list = User_Input.get_Input_2D_list();

    public void ClickButton_al(View v){

        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
//        TextView textView = (TextView)findViewById(R.id.textView2);
        input_2D_list [0][0] = 1;

        if(cb1.isChecked() == true) {
            input_2D_list [0][1] = 1;
            result += cb1.getText().toString();
        }
        if(cb2.isChecked() == true) {
            input_2D_list [0][2] = 1;
            result += cb2.getText().toString();
        }
        if(cb3.isChecked() == true) {
            input_2D_list [0][3] = 1;
            result += cb3.getText().toString();
        }
        if(cb4.isChecked() == true) {
            input_2D_list [0][4] = 1;
            result += cb4.getText().toString();
        }
//        textView.setText("선택결과:" + input_2D_list [0][0] + input_2D_list [0][1] + input_2D_list [0][2] + input_2D_list [0][3] + input_2D_list [0][4] );

        User_Input.set_Input_2D_list(input_2D_list);


    }

    public int[][] getInput_2D_list() {
        return input_2D_list;
    }

    public void setInput_2D_list(int[][] input_2D_list) {
        this.input_2D_list = input_2D_list;
    }

    public String getResult() {
        return result;
    }
}
