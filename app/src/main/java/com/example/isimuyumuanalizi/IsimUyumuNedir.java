package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class IsimUyumuNedir extends AppCompatActivity {

    private TextView textViewIsimUyumu;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isim_uyumu_nedir2);

        textViewIsimUyumu = findViewById(R.id.textViewIsimUyumu);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("ÇIKAN SONUÇLAR NE ANLAMA GELİYOR?");

    }
}