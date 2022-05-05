package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class EsUyumuAnalizi extends AppCompatActivity {

    private Button hesapla_butonu;
    private TextInputEditText kendi_ismi, kendi_tarihi, es_ismi, es_tarihi;
    private TextView sonuc_kismi, sonuc_kismi_iki;
    private Toolbar toolbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_uyumu_analizi);

        hesapla_butonu = findViewById(R.id.hesapla_butonu);
        kendi_ismi = findViewById(R.id.kendi_ismi);
        kendi_tarihi = findViewById(R.id.kendi_tarihi);
        es_ismi = findViewById(R.id.es_ismi);
        es_tarihi = findViewById(R.id.es_tarihi);
        sonuc_kismi = findViewById(R.id.sonuc_kismi);
        sonuc_kismi_iki = findViewById(R.id.sonuc_kismi_iki);
        toolbar3 = findViewById(R.id.toolbar3);

        toolbar3.setTitle("Eş Uyumu Analizi");

        hesapla_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelen_kendi_ismi = kendi_ismi.getText().toString().trim().toLowerCase();
                String gelen_kendi_tarihi = kendi_tarihi.getText().toString().trim();
                String gelen_es_ismi = es_ismi.getText().toString().trim().toLowerCase();
                String gelen_es_tarihi = es_tarihi.getText().toString().trim();

                double kendiTarih = Double.parseDouble(gelen_kendi_tarihi);
                double esTarih = Double.parseDouble(gelen_es_tarihi);

                int tarihtoplam=0;
                int isimtoplam = 0;

                for (int i1 = 0 ; i1 < gelen_kendi_ismi.length() ; i1++ ) {

                    if(gelen_kendi_ismi.charAt(i1) == 's' || gelen_kendi_ismi.charAt(i1) == 'ş' ){
                        isimtoplam +=0;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'a'){
                        isimtoplam += 1;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'b' || gelen_kendi_ismi.charAt(i1) == 'n' || gelen_kendi_ismi.charAt(i1) == 'p'){
                        isimtoplam +=2;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'c' || gelen_kendi_ismi.charAt(i1) == 'ç' || gelen_kendi_ismi.charAt(i1) == 'f' || gelen_kendi_ismi.charAt(i1) == 'j'){
                        isimtoplam +=3;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'd' || gelen_kendi_ismi.charAt(i1) == 'k' || gelen_kendi_ismi.charAt(i1) == 'm' || gelen_kendi_ismi.charAt(i1) == 't'){
                        isimtoplam +=4;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'e'){
                        isimtoplam +=5;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'v' || gelen_kendi_ismi.charAt(i1) == 'l'){
                        isimtoplam +=6;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'o' || gelen_kendi_ismi.charAt(i1) == 'ö' || gelen_kendi_ismi.charAt(i1) == 'u' || gelen_kendi_ismi.charAt(i1) == 'ü' || gelen_kendi_ismi.charAt(i1) == 'z'){
                        isimtoplam +=7;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'g' || gelen_kendi_ismi.charAt(i1) == 'ğ' || gelen_kendi_ismi.charAt(i1) == 'h' || gelen_kendi_ismi.charAt(i1) == 'r'){
                        isimtoplam +=8;
                    }
                    if (gelen_kendi_ismi.charAt(i1) == 'i' || gelen_kendi_ismi.charAt(i1) == 'ı' || gelen_kendi_ismi.charAt(i1) == 'y'){
                        isimtoplam +=10;
                    }
                }
                do {
                    tarihtoplam += kendiTarih % 10;
                    kendiTarih = kendiTarih / 10;
                }while(kendiTarih > 0);

                int tarihtoplam2=0;
                int isimtoplam2 = 0;

                for (int i1 = 0 ; i1 < gelen_es_ismi.length() ; i1++ ) {

                    if(gelen_es_ismi.charAt(i1) == 's' || gelen_es_ismi.charAt(i1) == 'ş' ){
                        isimtoplam2 +=0;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'a'){
                        isimtoplam2 += 1;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'b' || gelen_es_ismi.charAt(i1) == 'n' || gelen_es_ismi.charAt(i1) == 'p'){
                        isimtoplam2 +=2;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'c' || gelen_es_ismi.charAt(i1) == 'ç' || gelen_es_ismi.charAt(i1) == 'f' || gelen_es_ismi.charAt(i1) == 'j'){
                        isimtoplam2 +=3;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'd' || gelen_es_ismi.charAt(i1) == 'k' || gelen_es_ismi.charAt(i1) == 'm' || gelen_es_ismi.charAt(i1) == 't'){
                        isimtoplam2 +=4;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'e'){
                        isimtoplam2 +=5;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'v' || gelen_es_ismi.charAt(i1) == 'l'){
                        isimtoplam2 +=6;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'o' || gelen_es_ismi.charAt(i1) == 'ö' || gelen_es_ismi.charAt(i1) == 'u' || gelen_es_ismi.charAt(i1) == 'ü' || gelen_es_ismi.charAt(i1) == 'z'){
                        isimtoplam2 +=7;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'g' || gelen_es_ismi.charAt(i1) == 'ğ' || gelen_es_ismi.charAt(i1) == 'h' || gelen_es_ismi.charAt(i1) == 'r'){
                        isimtoplam2 +=8;
                    }
                    if (gelen_es_ismi.charAt(i1) == 'i' || gelen_es_ismi.charAt(i1) == 'ı' || gelen_es_ismi.charAt(i1) == 'y'){
                        isimtoplam2 +=10;
                    }
                }
                do {
                    tarihtoplam2 += esTarih % 10;
                    esTarih = esTarih / 10;
                }while(esTarih > 0);


                int yeni_toplam_kendi = isimtoplam + tarihtoplam;
                int yeni_toplam_es = isimtoplam2 + tarihtoplam2;
                sonuc_kismi.setText(String.valueOf("Kendi isminizin ve doğum tarihinizin basamakları toplamı = " + isimtoplam + "+" + tarihtoplam + "= " + yeni_toplam_kendi+"\n"+
                        "Eşinizin ismi ve doğum tarihinin basamakları toplamı = " + isimtoplam2 + "+" + tarihtoplam2 + "= "+ yeni_toplam_es));

                int toplamAnaliz = yeni_toplam_es + yeni_toplam_kendi;

                int yuzler = toplamAnaliz / 100;
                int onlar = (toplamAnaliz % 100) /10;
                int birler = (toplamAnaliz % 100) % 10;

                if((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler ==7)){
                    String isimuyumu = "İYİ";
                    // İYİ İYİ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                                                          +"Yüzler basamağı = " +yuzler + "\n"+
                                                           "Onlar basamağı = "  +onlar +"\n"+
                                                           "Birler basamağı = " +birler +"\n"+
                                                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu + " + " + isimuyumu + " -> %100 uyumlu." ));
                }
                if((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler ==8)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ İYİ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumlu." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ İYİ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumlu." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 1 || birler == 2 || birler == 3 || birler ==7)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumlu." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler ==8)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu2 + " + " + isimuyumu2 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÖTÜ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÇB İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÇB KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // İYİ KÇB KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu +" + " + isimuyum3 + " + " + isimuyum3 + " -> %75 uyumlu." ));
                }
                /*if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7 && birler == 1 || birler == 2 || birler == 3 || birler ==7){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //KÖTÜ İYİ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu + " + " + isimuyumu + " -> %75 uyumlu." ));
                }
                if(yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7 && birler == 4 || birler == 5 || birler == 6 || birler ==8){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //KÖTÜ İYİ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7 && birler == 0 || birler == 9){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÖTÜ İYİ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8 && birler == 1 || birler == 2 || birler == 3 || birler ==7){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //KÖTÜ KÖTÜ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8 && birler == 4 || birler == 5 || birler == 6 || birler ==8){
                    String isimuyumu2 = "KÖTÜ";
                    //KÖTÜ KÖTÜ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu2 + " + " + isimuyumu2 + " -> %100 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8 && birler == 0 || birler == 9){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÖTÜ KÖTÜ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyumu2 + " + " + isimuyum3 + " -> %100 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 0 || onlar == 9 && birler == 1 || birler == 2 || birler == 3 || birler ==7){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÖTÜ KÇB İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyum3 + " + " + isimuyumu + " -> %50" ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 0 || onlar == 9 && birler == 4 || birler == 5 || birler == 6 || birler ==8){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÖTÜ KÇB KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyum3 + " + " + isimuyumu2 + " -> %100 uyumsuz." ));
                }
                if (yuzler == 4 || yuzler == 5 || yuzler == 6 || yuzler == 8 && onlar == 0 || onlar == 9 && birler == 0 || birler == 9){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÖTÜ KÇB KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyumu2 +" + " + isimuyum3 + " + " + isimuyum3 + " -> %100 uyumsuz." ));
                }*/
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB İYİ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB İYİ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB İYİ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumlu." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)){
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyumu2 + " + " + isimuyumu2 + " -> %100 uyumsuz." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)){
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB KÇB İYİ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)){
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÖTÜ
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 +" + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz." ));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)){
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÇB
                    sonuc_kismi_iki.setText(String.valueOf("İsimlerin ve doğum tarihlerinin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            +"Yüzler basamağı = " +yuzler + "\n"+
                            "Onlar basamağı = "  +onlar +"\n"+
                            "Birler basamağı = " +birler +"\n"+
                            "Eş Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyum3 + " -> Kaderi Çabasına Bağlı." ));
                }
            }
        });

    }
}