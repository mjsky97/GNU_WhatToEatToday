package com.example.today_2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Result_p extends AppCompatActivity {

    int [][] input_2D_list = User_Input.get_Input_2D_list();
    private ListView listView;
    private SingleAdapter adapter;

    public static Restaurant[] getOutputs() {
        return outputs;
    }

    static Restaurant [] outputs;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_p);

        User_Input user_input = new User_Input();
        Decide_Recommend decide_recommend = new Decide_Recommend(user_input);



        decide_recommend.decide();

        outputs = decide_recommend.getR_b_K().getResults();

//        adapter = new SingleAdapter();
//
//        listView = (ListView)findViewById(R.id.listview);
//        listView.setAdapter(adapter);
//
//        for(int i = 0; i < outputs.length; i++){
//            adapter.addItem(outputs[i]);
//        }
//
//        adapter.notifyDataSetChanged();
//


//                "선택결과:" + input_2D_list [0][0] + input_2D_list [0][1] + input_2D_list [0][2] + input_2D_list [0][3] + input_2D_list [0][4]
//                + input_2D_list [1][0] + input_2D_list [1][1] + input_2D_list [1][2] + input_2D_list [1][3] + input_2D_list [1][4] + input_2D_list [1][5] + input_2D_list [1][6]
//                + input_2D_list [2][0] + input_2D_list [2][1] + input_2D_list [2][2] + input_2D_list [2][3]
//                + input_2D_list [3][0] + input_2D_list [3][1] + input_2D_list [3][2] + input_2D_list [3][3] + input_2D_list [3][4] + input_2D_list [3][5] + input_2D_list [3][6]);



        //Log.d(this.getClass().getName(), (String)textView.getText());


    }


}
