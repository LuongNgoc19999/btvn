package com.example.ad37_luongngoc_btvn41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class contact_activity extends AppCompatActivity {
    TextView tens, phonenb, vitri, thoigian, sdt;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_activity);
        sdt = findViewById(R.id.sdts);
        tens = findViewById(R.id.ten);
        phonenb = findViewById(R.id.tvsdt);
        vitri = findViewById(R.id.tvvt);
        thoigian = findViewById(R.id.tg);
        image = findViewById(R.id.images);
        Intent data = getIntent();
        Bundle bundle = data.getExtras();
        sdt.setText(bundle.getString("sdt"));
        tens.setText(bundle.getString("name"));
        phonenb.setText(bundle.getString("sdt"));
        vitri.setText(bundle.getString("vitri"));
        thoigian.setText(bundle.getString("tg"));
        if (bundle.getBoolean("image") == true){
            image.setImageResource(R.drawable.kkk);
        }
    }
}
