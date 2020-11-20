package com.example.today_2;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Select_hs_t extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_hs_t);
    }

    private String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자



    int [][] input_2D_list = User_Input.get_Input_2D_list();

    public void ClickButton_t(View v){

        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox14);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox15);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox16);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox17);
        CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox19);
        CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox18);
//        TextView textView = (TextView)findViewById(R.id.textView5);
        input_2D_list [3][0] = 1;

        if(cb1.isChecked() == true) {
            input_2D_list [3][1] = 1;
            result += cb1.getText().toString();
        }
        if(cb2.isChecked() == true) {
            input_2D_list [3][2] = 1;
            result += cb2.getText().toString();
        }
        if(cb3.isChecked() == true) {
            input_2D_list [3][3] = 1;
            result += cb3.getText().toString();
        }
        if(cb4.isChecked() == true) {
            input_2D_list [3][4] = 1;
            result += cb4.getText().toString();
        }
        if(cb5.isChecked() == true) {
            input_2D_list [3][5] = 1;
            result += cb5.getText().toString();
        }
        if(cb6.isChecked() == true) {
            input_2D_list [3][5] = 1;
            result += cb6.getText().toString();
        }
//        textView.setText("선택결과:" + input_2D_list [3][0] + input_2D_list [3][1] + input_2D_list [3][2] + input_2D_list [3][3] + input_2D_list [3][4] + input_2D_list [3][5] + input_2D_list [3][6]);

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


