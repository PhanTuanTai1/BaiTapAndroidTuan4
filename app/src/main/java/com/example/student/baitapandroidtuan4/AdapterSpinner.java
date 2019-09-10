package com.example.student.baitapandroidtuan4;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterSpinner extends ArrayAdapter<FootballPlayer> {
    Activity context = null;
    ArrayList<FootballPlayer> lstPlayer;
    int layoutID;

    public AdapterSpinner(@NonNull Activity context,int textViewResourceId, @NonNull ArrayList<FootballPlayer> objects) {
        super(context,textViewResourceId, objects);

            this.context = context;
            this.lstPlayer = objects;
            this.layoutID = textViewResourceId;

    }

    @Override
    public View getView(int postion, View convert, ViewGroup parent){
        convert = LayoutInflater.from(context).inflate(layoutID,null);

        if(lstPlayer.size() > 0 && postion >= 0){
            ImageView imgAVT,imgCountry;
            TextView tvContent;
            FootballPlayer fb = lstPlayer.get(postion);
            imgAVT = convert.findViewById(R.id.imgAVT);
            imgCountry = convert.findViewById(R.id.imgCountry);
            tvContent = convert.findViewById(R.id.tvContent);
            imgAVT.setImageResource(fb.getImgAVT());
            imgCountry.setImageResource(fb.getImgCountry());
            tvContent.setText(fb.toString());
        }
        return convert;
    }
}
