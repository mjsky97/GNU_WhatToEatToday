package com.example.today_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Management_Sys management_sys = new Management_Sys();
        //User_Input user_input = new User_Input();
    }

    public void ClickButton1(View v){
        Intent intent = new Intent(this, Select_hs_s.class);
        startActivity(intent);
    }

    public void ClickButton2(View v){
        Intent intent = new Intent(this, Select_hs_ff.class);
        startActivity(intent);
    }

    public void ClickButton3(View v){
        Intent intent = new Intent(this, Select_hs_al.class);
        startActivity(intent);
    }

    public void ClickButton4(View v){
        Intent intent = new Intent(this, Select_hs_t.class);
        startActivity(intent);
    }

    public void ClickButton5(View v){
        Intent intent = new Intent(this, Mix_hs.class);
        startActivity(intent);
    }
}
