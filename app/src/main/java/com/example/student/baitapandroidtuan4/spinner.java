package com.example.student.baitapandroidtuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class spinner extends AppCompatActivity {
    Spinner spinner;
    ArrayList<FootballPlayer> ListFB;
    AdapterSpinner adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinner);
        ListFB = new ArrayList<>();
        adt = new AdapterSpinner(this,R.layout.my_layout,ListFB);
        spinner.setAdapter(adt);
        AddData();
    }
    public void AddData(){
        FootballPlayer fb = new FootballPlayer();
        fb.setImgCountry(R.mipmap.england);
        fb.setImgAVT(R.mipmap.footbalplayer);
        fb.setName("Beckcam");
        fb.setYear(1887);
        FootballPlayer fb1 = new FootballPlayer();
        fb.setImgCountry(R.mipmap.england);
        fb.setImgAVT(R.mipmap.footbalplayer);
        fb.setName("Beckcam");
        fb.setYear(1887);
        FootballPlayer fb2 = new FootballPlayer();
        fb.setImgCountry(R.mipmap.england);
        fb.setImgAVT(R.mipmap.footbalplayer);
        fb.setName("Beckcam");
        fb.setYear(1887);
        ListFB.add(fb);
        ListFB.add(fb1);
        ListFB.add(fb2);
        adt.notifyDataSetChanged();
    }
}
