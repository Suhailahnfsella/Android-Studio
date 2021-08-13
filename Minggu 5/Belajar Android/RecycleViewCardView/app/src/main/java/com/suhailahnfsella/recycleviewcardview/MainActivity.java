package com.suhailahnfsella.recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Eko", "Surabaya"));
        siswaList.add(new Siswa("Tejo", "Surabaya"));
        siswaList.add(new Siswa("Siti", "Surabaya"));
        siswaList.add(new Siswa("Roni", "Surabaya"));
        siswaList.add(new Siswa("Bobi", "Surabaya"));
        siswaList.add(new Siswa("Dino", "Surabaya"));
        siswaList.add(new Siswa("Fiko", "Surabaya"));
        siswaList.add(new Siswa("Karen", "Surabaya"));
        siswaList.add(new Siswa("Budi", "Surabaya"));
        siswaList.add(new Siswa("Sulis", "Surabaya"));
        siswaList.add(new Siswa("Bowo", "Surabaya"));
        siswaList.add(new Siswa("Ronal", "Surabaya"));
        siswaList.add(new Siswa("Maryam", "Surabaya"));
        siswaList.add(new Siswa("Popo", "Surabaya"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("JONI RAMBO", "JAKARTA"));
        adapter.notifyDataSetChanged();
    }
}