package com.example.today_2;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Select_hs_ff extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_hs_ff);
    }

    private String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자



    int [][] input_2D_list = User_Input.get_Input_2D_list();

    public void ClickButton_ff(View v){

        CheckBox cbf1 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox cbf2 = (CheckBox)findViewById(R.id.checkBox6);
        CheckBox cbf3 = (CheckBox)findViewById(R.id.checkBox13);
//        TextView textViewf = (TextView)findViewById(R.id.textView4);
        input_2D_list [2][0] = 1;

        if(cbf1.isChecked() == true) {
            input_2D_list [2][1] = 1;
            result += cbf1.getText().toString();
        }
        if(cbf2.isChecked() == true) {
            input_2D_list [2][2] = 1;
            result += cbf2.getText().toString();
        }
        if(cbf3.isChecked() == true) {
            input_2D_list [2][3] = 1;
            result += cbf3.getText().toString();
        }
//        textViewf.setText("선택결과:" + input_2D_list [2][0] + input_2D_list [2][1] + input_2D_list [2][2] + input_2D_list [2][3]);

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
