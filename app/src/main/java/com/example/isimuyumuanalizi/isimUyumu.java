package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class isimUyumu extends AppCompatActivity {

    private Button hesaplama_butonu;
    private TextInputEditText isim_girdisi, tarih_girdisi;
    private TextView sonuc_ciktisi, sonuc2;
    private Toolbar toolbarIsimUyumu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isim_uyumu);

        hesaplama_butonu = findViewById(R.id.hesaplama_butonu);
        isim_girdisi = findViewById(R.id.isim_girdisi);
        tarih_girdisi = findViewById(R.id.tarih_girdisi);
        sonuc_ciktisi = findViewById(R.id.sonuc_ciktisi);
        sonuc2 = findViewById(R.id.sonuc2);

        toolbarIsimUyumu = findViewById(R.id.toolbarIsimUyumu);
        toolbarIsimUyumu.setTitle("İSİM UYUMU ANALİZİ");

        hesaplama_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int tarihtoplam=0;
                int isimtoplam = 0;
                String isim = isim_girdisi.getText().toString().trim().toLowerCase();
                String gelentarih = tarih_girdisi.getText().toString().trim();

                double tarih = Double.parseDouble(gelentarih);


                for (int i1 = 0 ; i1 < isim.length() ; i1++ ) {

                    if(isim.charAt(i1) == 's' || isim.charAt(i1) == 'ş' ){
                        isimtoplam +=0;
                    }
                    else if (isim.charAt(i1) == 'a'){
                        isimtoplam += 1;
                    }
                    else if (isim.charAt(i1) == 'b' || isim.charAt(i1) == 'n' || isim.charAt(i1) == 'p'){
                        isimtoplam +=2;
                    }
                    else if (isim.charAt(i1) == 'c' || isim.charAt(i1) == 'ç' || isim.charAt(i1) == 'f' || isim.charAt(i1) == 'j'){
                        isimtoplam +=3;
                    }
                    else if (isim.charAt(i1) == 'd' || isim.charAt(i1) == 'k' || isim.charAt(i1) == 'm' || isim.charAt(i1) == 't'){
                        isimtoplam +=4;
                    }
                    else if (isim.charAt(i1) == 'e'){
                        isimtoplam +=5;
                    }
                    else if (isim.charAt(i1) == 'v' || isim.charAt(i1) == 'l'){
                        isimtoplam +=6;
                    }
                    else if (isim.charAt(i1) == 'o' || isim.charAt(i1) == 'ö' || isim.charAt(i1) == 'u' || isim.charAt(i1) == 'ü' || isim.charAt(i1) == 'z'){
                        isimtoplam +=7;
                    }
                    else if (isim.charAt(i1) == 'g' || isim.charAt(i1) == 'ğ' || isim.charAt(i1) == 'h' || isim.charAt(i1) == 'r'){
                        isimtoplam +=8;
                    }
                    else if (isim.charAt(i1) == 'i' || isim.charAt(i1) == 'ı' || isim.charAt(i1) == 'y'){
                        isimtoplam +=10;
                    }
                }

                do {
                    tarihtoplam += tarih % 10;
                    tarih = tarih / 10;
                }while(tarih > 0);
                sonuc_ciktisi.setText(String.valueOf("Doğum Tarihi Basamaklar Toplamı = " + tarihtoplam  +"\n"+
                        "İsmin harflerinin toplamı = " + isimtoplam + "\n"));

                int yenitoplam = tarihtoplam + isimtoplam;

                int onlar = yenitoplam /10;
                int birler =yenitoplam - (10 * onlar);


                if((onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 ||birler == 3 || birler == 7) ){
                    String isimuyumu = "İYİ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu + "= %100 uyumlu."));
                }
                if((onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 ||birler == 6 || birler == 8) ){
                    String isimuyumu = "KÖTÜ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu + "= %100 uyumsuz."));
                }
                if ((onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)){
                    String isimuyumu = "Kaderi Çabasına Bağlı";
                    String isimuyumu2 = "İYİ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %75 uyumlu."));
                }
                if ((onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu = "Kaderi Çabasına Bağlı";
                    String isimuyumu2 = "KÖTÜ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %25 uyumlu ya da %75 uyumsuz 'kaderi çabasına bağlı'"));
                }
                if((onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "Kaderi Çabasına Bağlı";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %75 uyumlu."));
                }
                if((onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)){
                    String isimuyumu = "KÖTÜ";
                    String isimuyumu2 = "Kaderi Çabasına Bağlı";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %25 uyumlu ya da %75 uyumsuz 'kaderi çabasına bağlı'"));
                }
                if((onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) &&(birler == 1 || birler == 2 || birler == 3 || birler == 7)  ){
                    String isimuyumu = "KÖTÜ";
                    String isimuyumu2 = "İYİ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %50 uyumlu."));
                }
                if((onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    sonuc2.setText(String.valueOf("Doğum tarihi ile ismin harflerinin toplamının -> \n"+
                            "Onlar basamağı =  " + onlar + "\n"+
                            "Birler basamağı = " + birler+"\n"+
                            isimuyumu + "+" + isimuyumu2 + "= %50 uyumlu."));
                }


            }
        });
    }
}