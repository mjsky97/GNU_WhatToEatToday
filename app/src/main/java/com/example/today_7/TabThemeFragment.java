package com.example.today_7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TabThemeFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    private CheckBox cb1;   //theme checkbox 1~6
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_tab_theme, container, false);

        View v = inflater.inflate(R.layout.fragment_tab_theme, container, false);

        cb1 = v.findViewById(R.id.checkBox_th1);   //theme checkbox 1~6
        cb2 = v.findViewById(R.id.checkBox_th2);
        cb3 = v.findViewById(R.id.checkBox_th3);
        cb4 = v.findViewById(R.id.checkBox_th4);
        cb5 = v.findViewById(R.id.checkBox_th5);
        cb6 = v.findViewById(R.id.checkBox_th6);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        cb6.setOnCheckedChangeListener(this);


        textView = v.findViewById(R.id.textView_test);

        return v;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // 체크박스를 클릭해서 상태가 바꾸었을 경우 호출되는 콜백 메서드

        String result = ""; // 문자열 초기화는 빈문자열로 하자

        //theme checkbox 1~6
        if(cb1.isChecked() == true) {   //체크박스 선택이 된다면
            result += cb1.getText().toString();
        }
        if(cb2.isChecked() == true) {
            result += cb2.getText().toString();
        }
        if(cb3.isChecked() == true) {
            result += cb3.getText().toString();
        }
        if(cb4.isChecked() == true) {
            result += cb4.getText().toString();
        }
        if(cb5.isChecked() == true) {
            result += cb5.getText().toString();
        }
        if(cb6.isChecked() == true) {
            result += cb6.getText().toString();
        }


        textView.setText("체크항목: " + result);
    }
}

