package com.example.student.baitapandroidtuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
    AdapterSpinner adt;
    ArrayList<FootballPlayer> lstFB;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listview = findViewById(R.id.listview);
        lstFB = new ArrayList<>();
        adt = new AdapterSpinner(this,R.layout.my_layout,lstFB);
        listview.setAdapter(adt);
        AddData();
        AddData();
        AddData();
    }
    public void AddData(){
        FootballPlayer fb = new FootballPlayer();
        fb.setImgCountry(R.mipmap.england);
        fb.setImgAVT(R.mipmap.footbalplayer);
        fb.setName("Beckcam");
        fb.setYear(1887);
        lstFB.add(fb);
        adt.notifyDataSetChanged();
    }
}
