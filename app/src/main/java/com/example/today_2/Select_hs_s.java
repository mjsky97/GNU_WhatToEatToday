package com.example.today_2;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Select_hs_s extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_hs_s);
    }
    private String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자



    int [][] input_2D_list = User_Input.get_Input_2D_list();

    public void ClickButton_s(View v){

        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox7);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox8);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox9);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox10);
        CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox11);
        CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox12);
//        TextView textView = (TextView)findViewById(R.id.textView3);
        input_2D_list [1][0] = 1;

        if(cb1.isChecked() == true) {
            input_2D_list [1][1] = 1;
            result += cb1.getText().toString();
        }
        if(cb2.isChecked() == true) {
            input_2D_list [1][2] = 1;
            result += cb2.getText().toString();
        }
        if(cb3.isChecked() == true) {
            input_2D_list [1][3] = 1;
            result += cb3.getText().toString();
        }
        if(cb4.isChecked() == true) {
            input_2D_list [1][4] = 1;
            result += cb4.getText().toString();
        }
        if(cb5.isChecked() == true) {
            input_2D_list [1][5] = 1;
            result += cb5.getText().toString();
        }
        if(cb6.isChecked() == true) {
            input_2D_list [1][6] = 1;
            result += cb6.getText().toString();
        }
//        textView.setText("선택결과:" + input_2D_list [1][0] + input_2D_list [1][1] + input_2D_list [1][2] + input_2D_list [1][3] + input_2D_list [1][4] + input_2D_list [1][5] + input_2D_list [1][6]);

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