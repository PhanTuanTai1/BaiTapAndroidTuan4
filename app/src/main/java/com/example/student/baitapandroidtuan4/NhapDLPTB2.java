package com.example.student.baitapandroidtuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhapDLPTB2 extends AppCompatActivity {
    EditText a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_dlptb2);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
    }
    public String LayKetQua(float a,float b,float c){
        if(a == 0 || b*b - 4*a*c < 0) return "Phuong trinh vo nghiem";
        else if(b*b - 4*a*c > 0) return "Phuong trinh co 2 nghiem phan biet";
        else return "Phuong trinh co nghiem kep";
    }
    public void GiaiPhuongTrinh(View view){
        float a1,b1,c1;
        a1 = Float.parseFloat(a.getText().toString());
        b1 = Float.parseFloat(b.getText().toString());
        c1 = Float.parseFloat(c.getText().toString());
        String ketqua = LayKetQua(a1,b1,c1);
        Intent send = new Intent(this,KetQuaPTB2.class);
        send.putExtra("ketqua",ketqua);
        this.startActivity(send);
    }

}
