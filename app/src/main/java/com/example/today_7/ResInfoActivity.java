package com.example.today_7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResInfoActivity  extends AppCompatActivity {

    private int restaurantImage;
    private String restaurantName;
    private String restaurantLocationURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_info);

        Intent intent = getIntent();

        ImageView imageView = (ImageView) findViewById(R.id.resinfo_imageView);
        TextView textView =(TextView) findViewById(R.id.resinfo_textView);
//        TextView phone=(TextView) findViewById(R.id.tv_pn);

        restaurantImage = getIntent().getIntExtra("image", 1);
        imageView.setImageResource(restaurantImage);
        textView.setText(getIntent().getStringExtra("restaurant"));
//        phone.setText(intent.getStringExtra("phone"));


        if (savedInstanceState == null) {

            ResMapFragment resMapFragment = new ResMapFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.map_fragment, resMapFragment, "main")
                    .commit();
        }
    }

    public void ClickButton_review(View v){
        Intent intent = new Intent(this, AddReviewActivity.class);
        startActivity(intent);
    }
}
