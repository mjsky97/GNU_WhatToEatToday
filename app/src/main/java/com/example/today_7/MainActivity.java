package com.example.today_7;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    String inputText ="";


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Intent intent1 = new Intent(getApplicationContext(), ResListRandomActivity.class);
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    startActivity(intent1);
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void ClickButton_h(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
       userinput.setInputKeyword(keyword);
    }

    public void ClickButton_d(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_m(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_s(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_c(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_r(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_f(View v){
        Intent intent = new Intent(this, ResListActivity.class);
        startActivity(intent);
        UserInput userinput = new UserInput();
        String [] keyword = {"회식"};
        userinput.setInputKeyword(keyword);
    }

    public void ClickButton_search(View v){ //검색 기능
//        Intent intent = new Intent(this, ResListSearchActivity.class);
//        startActivity(intent);
     //이 위에부분 주석 풀어야 넘어간담


        EditText input = (EditText) findViewById(R.id.input_text);


        if(input.getText().toString().equals("")) { //입력이 없는 경우
            Toast.makeText(MainActivity.this,
                    "상호명을 입력해주세요.",
                    Toast.LENGTH_LONG).show();
        } else {    //입력이 있는 경우
            inputText = input.getText().toString();  //text field에 적은 값을 가져와 inputText에(이걸 가져다 쓰셈)
        }

        //input.setText(String.valueOf(inputText)); //이거 풀면 저 텍스트 필드에 그대로 입력 됨

    }

}
