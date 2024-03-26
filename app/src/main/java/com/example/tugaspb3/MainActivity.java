package com.example.tugaspb3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Model(R.drawable.abmi, "Abmi Sukma Edri", "12250120341"));
        arrayList.add(new Model(R.drawable.ahmad, "Ahmad Kurniawan", "12250111514"));
        arrayList.add(new Model(R.drawable.aufa, "Aufa Hajati", "12250120338"));
        arrayList.add(new Model(R.drawable.dafin, "Daffa Finanda", "12250111603"));
        arrayList.add(new Model(R.drawable.dafa, "Daffa Ikhwan NurFauzan", "1225011097914"));
        arrayList.add(new Model(R.drawable.jelita, "Dwi Jelita Adhliyah", "12250120331"));
        arrayList.add(new Model(R.drawable.dwim, "Dwi Mahdini", "12250111298"));
        arrayList.add(new Model(R.drawable.fajri, "Fajri", "12250110382"));
        arrayList.add(new Model(R.drawable.fakhri, "Fakhri", "12250111381"));
        arrayList.add(new Model(R.drawable.farras, "Farras Lathief", "12250111328"));
        arrayList.add(new Model(R.drawable.gilang, "Gilang Ramadhan Indra", "12250111323"));
        arrayList.add(new Model(R.drawable.hafidz, "Hafidz Alhadid Rahman", "1225011179"));
        arrayList.add(new Model(R.drawable.aldy, "Haritsah Naufaldy", "12250110361"));
        arrayList.add(new Model(R.drawable.nabil, "M. Nabil Dawami", "12250111527"));
        arrayList.add(new Model(R.drawable.zaki, "Muh. Zaki Erbai Syas", "12250111134"));
        arrayList.add(new Model(R.drawable.adit, "Muhammad Aditya Rinaldi", "12250111048"));
        arrayList.add(new Model(R.drawable.dimas, "Muhammad Dhimas Hadid", "12250111231"));
        arrayList.add(new Model(R.drawable.faruq, "Muhammad Faruq", "12250111791"));
        arrayList.add(new Model(R.drawable.rafly, "Muhammaad Rafly Wirayudha", "12250111489"));
        arrayList.add(new Model(R.drawable.nurika, "Nurika Dwi Wahyuni", "12250120360"));
        arrayList.add(new Model(R.drawable.ogya, "Ogya Secio Noegroho", "12250111346"));
        arrayList.add(new Model(R.drawable.rahma, "Rahma Laksita", "12250124357"));
        arrayList.add(new Model(R.drawable.surya, "Surya Hidayatullah Firdaus", "12250111759"));


        ModlRecyclerView modlRecyclerView = new ModlRecyclerView(this, arrayList);
        recyclerView.setAdapter(modlRecyclerView);

    }
}