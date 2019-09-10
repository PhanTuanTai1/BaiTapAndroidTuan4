package com.example.student.baitapandroidtuan4;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterFlower extends ArrayAdapter<Flower> {
    Activity Context;
    ArrayList<Flower> arr;
    int layoutID;
    public AdapterFlower(@NonNull Activity context, int textViewResourceId, @NonNull ArrayList<Flower> objects) {
        super(context, textViewResourceId, objects);
        this.Context = context;
        layoutID = textViewResourceId;
        arr = objects;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(Context).inflate(layoutID,null);
        ImageView pic;
        TextView content;
        pic = convertView.findViewById(R.id.imgFlower);
        content = convertView.findViewById(R.id.nameFlower);
        if(arr.size() > 0 && position >= 0){
            Flower f = arr.get(position);
            pic.setImageResource(f.getImg());
            content.setText(f.toString());
        }
        return  convertView;
    }
}
