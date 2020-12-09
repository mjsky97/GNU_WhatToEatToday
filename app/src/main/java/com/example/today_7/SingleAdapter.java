package com.example.today_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SingleAdapter extends BaseAdapter {

    private TextView textView;
    private ImageView imageView;

    private ArrayList<Restaurant> res = new ArrayList<Restaurant>();

    public ArrayList<Restaurant> getRes() {                                 ////////////
        return res;
    }


//    Restaurant [] outputs = Result_p.getOutputs();

    public SingleAdapter(){}

    @Override
    public int getCount() {//이건 뭐냐
        return res.size() ;
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    Restaurant restaurant;



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

//        SingleResView singleResView = null;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_single_res, parent, false);
        }
        textView = (TextView)convertView.findViewById(R.id.textView6);
        imageView = (ImageView)convertView.findViewById(R.id.imageView2);
        //

        restaurant = res.get(position); /////////////////////////////////////////////////////

        textView.setText(restaurant.getRestaurantName());
        imageView.setImageResource(restaurant.getRestaurantImage());

        return  convertView;

    }

    public void addItem(Restaurant restaurant){
        res.add(restaurant);
    }

    @Override
    public Object getItem(int position) {
        return res.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
