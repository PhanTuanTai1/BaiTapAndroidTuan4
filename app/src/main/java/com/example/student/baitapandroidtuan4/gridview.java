package com.example.student.baitapandroidtuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class gridview extends AppCompatActivity {
    GridView gridView;
    ArrayList<Flower> flowers;
    AdapterFlower adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView = findViewById(R.id.gridview);
        flowers = new ArrayList<>();
        adt = new AdapterFlower(this,R.layout.my_layout_1,flowers);
        gridView.setAdapter(adt);
        AddData();
        AddData();
        AddData();
        AddData();
        AddData();
        AddData();
    }
    public void AddData(){
        Flower f = new Flower();
        f.setImg(R.mipmap.england);
        f.setName("England");
        flowers.add(f);
        adt.notifyDataSetChanged();
    }
}
