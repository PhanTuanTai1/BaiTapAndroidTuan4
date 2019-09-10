package com.example.student.baitapandroidtuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class KetQuaPTB2 extends AppCompatActivity {
    Intent back;
    EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua_ptb2);
        result = findViewById(R.id.ketqua);
        back = this.getIntent();
        result.setText(back.getStringExtra("ketqua"));
    }
    public void TroVe(View view){
        back = new Intent(this,NhapDLPTB2.class);
        this.startActivity(back);
    }
}
