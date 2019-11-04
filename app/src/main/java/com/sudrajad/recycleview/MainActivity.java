package com.sudrajad.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa>mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
    private void tambahData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Hery Purnomo", "Ayah", "1965", getDrawable(R.drawable.ayah)));
        mahasiswaArrayList.add(new Mahasiswa("Sri Harlinah", "Ibu", "1970", getDrawable(R.drawable.ibu)));
        mahasiswaArrayList.add(new Mahasiswa("Indah Nur Puspitasari", "Anak Pertama", "1992", getDrawable(R.drawable.mbakpieth)));
        mahasiswaArrayList.add(new Mahasiswa("Dwi Adi Iswara", "Anak Kedua", "1999", getDrawable(R.drawable.aku)));
        mahasiswaArrayList.add(new Mahasiswa("Satya Aji Nugraha", "Anak Ketiga", "2005", getDrawable(R.drawable.tyo)));
    }
}
