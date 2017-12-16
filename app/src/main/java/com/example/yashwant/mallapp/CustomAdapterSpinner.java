package com.example.yashwant.mallapp;

/**
 * Created by iyashwant on 25/7/17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapterSpinner extends BaseAdapter {
    Context context;
    
    String[] CarType;
    LayoutInflater inflter;

    public CustomAdapterSpinner(Context applicationContext, String[] CarType) {
        this.context = applicationContext;
      
        this.CarType = CarType;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return CarType.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spin_type, null);
       // ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.spin_text);
       // icon.setImageResource(flags[i]);
        names.setText(CarType[i]);
        return view;
    }
}