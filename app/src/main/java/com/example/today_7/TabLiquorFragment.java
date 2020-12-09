package com.example.today_7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TabLiquorFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {


    private CheckBox cb_l1;   //liquor checkbox 1~6
    private CheckBox cb_l2;
    private CheckBox cb_l3;
    private CheckBox cb_l4;

//    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_tab_liquor, container, false);

        View v = inflater.inflate(R.layout.fragment_tab_liquor, container, false);

        cb_l1 = v.findViewById(R.id.checkBox_l1);   //liquor checkbox 1~6
        cb_l2 = v.findViewById(R.id.checkBox_l2);
        cb_l3 = v.findViewById(R.id.checkBox_l3);
        cb_l4 = v.findViewById(R.id.checkBox_l4);

        cb_l1.setOnCheckedChangeListener(this);
        cb_l2.setOnCheckedChangeListener(this);
        cb_l3.setOnCheckedChangeListener(this);
        cb_l4.setOnCheckedChangeListener(this);


//        textView = v.findViewById(R.id.textView_test);

        return v;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // 체크박스를 클릭해서 상태가 바꾸었을 경우 호출되는 콜백 메서드

        String result = ""; // 문자열 초기화는 빈문자열로 하자

        //liquor checkbox 1~6
        if(cb_l1.isChecked() == true) {
            result += cb_l1.getText().toString();
        }
        if(cb_l2.isChecked() == true) {
            result += cb_l2.getText().toString();
        }
        if(cb_l3.isChecked() == true) {
            result += cb_l3.getText().toString();
        }
        if(cb_l4.isChecked() == true) {
            result += cb_l4.getText().toString();
        }


//        textView.setText("체크항목: " + result);
    }
}

