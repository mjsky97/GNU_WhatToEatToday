package com.example.today_7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TabFastfoodFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    private CheckBox cb_f1;    //fastfood checkbox 1~6
    private CheckBox cb_f2;
    private CheckBox cb_f3;

//    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_tab_fastfood, container, false);

        View v = inflater.inflate(R.layout.fragment_tab_fastfood, container, false);

        cb_f1 = v.findViewById(R.id.checkBox_f1);    //fastfood checkbox 1~6
        cb_f2 = v.findViewById(R.id.checkBox_f2);
        cb_f3 = v.findViewById(R.id.checkBox_f3);

        cb_f1.setOnCheckedChangeListener(this);
        cb_f2.setOnCheckedChangeListener(this);
        cb_f3.setOnCheckedChangeListener(this);


//        textView = v.findViewById(R.id.textView_test);

        return v;

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // 체크박스를 클릭해서 상태가 바꾸었을 경우 호출되는 콜백 메서드

        String result = ""; // 문자열 초기화는 빈문자열로 하자

        //fastfood checkbox 1~6
        if(cb_f1.isChecked() == true) {
            result += cb_f1.getText().toString();
        }
        if(cb_f2.isChecked() == true) {
            result += cb_f2.getText().toString();
        }
        if(cb_f3.isChecked() == true) {
            result += cb_f3.getText().toString();
        }


//        textView.setText("체크항목: " + result);
    }
}
