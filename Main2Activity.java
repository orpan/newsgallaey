package com.example.saurabhpandey.newsgallarytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends BaseAdapter {
    ArrayList<String> arrayList;
    Activity activity;

    public Main2Activity(ArrayList<String> i, Activity j) {
        this.arrayList = i;
        this.activity = j;


    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(activity).inflate(R.layout.activity_main2, null);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        }
        else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }
        mViewHolder.buttonmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity,Main22Activity.class);
                activity.startActivity(intent);
            }
        });
        mViewHolder.buttonmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity,Main23Activity.class);
                activity.startActivity(intent);
            }
        });
        return convertView;
    }
    private class MyViewHolder {

        TextView textViewmore1, textViewmore2;
        ImageView imageView1,imageView2;
        Button buttonmore1,buttonmore2;

        public MyViewHolder(View item) {
            textViewmore1 = (TextView) item.findViewById(R.id.text);
            textViewmore2 = (TextView) item.findViewById(R.id.text1);
            imageView1 = (ImageView) item.findViewById(R.id.images);
            imageView2 = (ImageView) item.findViewById(R.id.images1);
            buttonmore1= (Button) item.findViewById(R.id.button);
            buttonmore2= (Button) item.findViewById(R.id.button1);


        }
    }


}
