
package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button isim_uyumu, es_uyumu, isyeri_uyumu, isci_uyumu,buttonNeAnlamaGeliyor,IsımUyumuNedir;
    private Toolbar toolbarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isim_uyumu = findViewById(R.id.isim_uyumu);
        es_uyumu = findViewById(R.id.es_uyumu);
        isyeri_uyumu = findViewById(R.id.isyeri_uyumu);
        isci_uyumu = findViewById(R.id.isci_uyumu);
        buttonNeAnlamaGeliyor = findViewById(R.id.buttonNeAnlamaGeliyor);
        IsımUyumuNedir = findViewById(R.id.IsımUyumuNedir);
        toolbarMain = findViewById(R.id.toolbarMain);

        toolbarMain.setTitle("ANASAYFA");

        isim_uyumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,isimUyumu.class));
            }
        });
        es_uyumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EsUyumuAnalizi.class));
            }
        });
        isyeri_uyumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IsYeriUyumuAnalizi.class));
            }
        });
        isci_uyumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IsciUyumuAnalizi.class));
            }
        });
        buttonNeAnlamaGeliyor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IsimUyumuNedir.class));
            }
        });
    }
}