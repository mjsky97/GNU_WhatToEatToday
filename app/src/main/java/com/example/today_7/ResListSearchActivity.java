package com.example.today_7;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ResListSearchActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private ListView listView;
    private SingleAdapter adapter;

    static Restaurant [] outputs;

    private ArrayList<Restaurant> res;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_list_search);


        UserInput userinput = new UserInput();
//        String [] keyword = {"회식"};
//        userinput.setInputKeyword(keyword);

        RecommendByKeyword rk = new RecommendByKeyword();

        rk.setUserInput(userinput);
        rk.RecommendRestaurantsList();

        Restaurant[] outputs4 = rk.getResults();


//        Restaurant [] outputs;
//
//        decide_recommend.decide();
//
//        outputs = decide_recommend.getR_b_K().getResults();


        adapter = new SingleAdapter();

        listView = (ListView) findViewById(R.id.res_list);
        listView.setAdapter(adapter);

        for (int i = 0; i < outputs4.length; i++) {
            adapter.addItem(outputs4[i]);
        }

        adapter.notifyDataSetChanged();

        res = adapter.getRes();
//


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ResInfoActivity.class);

                // putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값
                Restaurant restaurant = res.get(position);
                intent.putExtra("restaurant", restaurant.getRestaurantName());
                intent.putExtra("image", restaurant.getRestaurantImage());
                intent.putExtra("info", restaurant.getRestaurantLocationURL());
                startActivity(intent);
            }
        });


        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
