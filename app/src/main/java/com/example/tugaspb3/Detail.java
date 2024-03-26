package com.example.tugaspb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    ImageView foto1;
    TextView nama1, nim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();
        foto1 = findViewById(R.id.foto1);
        nama1 = findViewById(R.id.nama1);
        nim1 = findViewById(R.id.nim1);

        Intent intent = getIntent();
        String nama = intent.getExtras().getString("name");
        String nim = intent.getExtras().getString("number");
        int foto = intent.getExtras().getInt("image");

        nama1.setText(nama);
        nim1.setText(nim);
        foto1.setImageResource(foto);

    }
}