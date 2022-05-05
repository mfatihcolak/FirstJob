package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IsciUyumuAnalizi extends AppCompatActivity {

    private Button hesapla_isci_uyumu;
    private EditText calisan_isim, calisan_tarih, isveren_isim, isveren_tarih,is_yeri_isim, isyeri_tarih;
    private TextView sonucbir, sonuciki;
    private Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isci_uyumu_analizi);

        hesapla_isci_uyumu = findViewById(R.id.hesapla_isci_uyumu);
        calisan_isim = findViewById(R.id.calisan_isim);
        calisan_tarih = findViewById(R.id.calisan_tarih);
        isveren_isim = findViewById(R.id.isveren_isim);
        isveren_tarih = findViewById(R.id.isveren_tarih);
        is_yeri_isim = findViewById(R.id.is_yeri_isim);
        isyeri_tarih = findViewById(R.id.isyeri_tarih);
        sonucbir = findViewById(R.id.sonucbir);
        sonuciki = findViewById(R.id.sonuciki);
        toolbar2 = findViewById(R.id.toolbar2);

        toolbar2.setTitle("İşçi Uyumu Analizi");

        hesapla_isci_uyumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenCalisanIsim = calisan_isim.getText().toString().trim().toLowerCase();
                String gelenCalisanTarih = calisan_tarih.getText().toString().trim();
                String gelenIsverenIsim = isveren_isim.getText().toString().trim().toLowerCase();
                String gelenIsverenTarih = isveren_tarih.getText().toString().trim();
                String gelenIsyeriIsmi = is_yeri_isim.getText().toString().trim().toLowerCase();
                String gelenIsyeriTarih = isyeri_tarih.getText().toString().trim();

                double calisantarih = Double.parseDouble(gelenCalisanTarih);
                double isverentarih = Double.parseDouble(gelenIsverenTarih);
                double isyeritarih = Double.parseDouble(gelenIsyeriTarih);

                int tarihtoplam = 0;
                int isimtoplam = 0;

                for (int i1 = 0; i1 < gelenCalisanIsim.length(); i1++) {

                    if (gelenCalisanIsim.charAt(i1) == 's' || gelenCalisanIsim.charAt(i1) == 'ş') {
                        isimtoplam += 0;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'a') {
                        isimtoplam += 1;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'b' || gelenCalisanIsim.charAt(i1) == 'n' || gelenCalisanIsim.charAt(i1) == 'p') {
                        isimtoplam += 2;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'c' || gelenCalisanIsim.charAt(i1) == 'ç' || gelenCalisanIsim.charAt(i1) == 'f' || gelenCalisanIsim.charAt(i1) == 'j') {
                        isimtoplam += 3;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'd' || gelenCalisanIsim.charAt(i1) == 'k' || gelenCalisanIsim.charAt(i1) == 'm' || gelenCalisanIsim.charAt(i1) == 't') {
                        isimtoplam += 4;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'e') {
                        isimtoplam += 5;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'v' || gelenCalisanIsim.charAt(i1) == 'l') {
                        isimtoplam += 6;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'o' || gelenCalisanIsim.charAt(i1) == 'ö' || gelenCalisanIsim.charAt(i1) == 'u' || gelenCalisanIsim.charAt(i1) == 'ü' || gelenCalisanIsim.charAt(i1) == 'z') {
                        isimtoplam += 7;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'g' || gelenCalisanIsim.charAt(i1) == 'ğ' || gelenCalisanIsim.charAt(i1) == 'h' || gelenCalisanIsim.charAt(i1) == 'r') {
                        isimtoplam += 8;
                    }
                    if (gelenCalisanIsim.charAt(i1) == 'i' || gelenCalisanIsim.charAt(i1) == 'ı' || gelenCalisanIsim.charAt(i1) == 'y') {
                        isimtoplam += 10;
                    }
                }
                do {
                    tarihtoplam += calisantarih % 10;
                    calisantarih = calisantarih / 10;
                } while (calisantarih > 0);

                int tarihtoplam2 = 0;
                int isimtoplam2 = 0;

                for (int i1 = 0; i1 < gelenIsverenIsim.length(); i1++) {

                    if (gelenIsverenIsim.charAt(i1) == 's' || gelenIsverenIsim.charAt(i1) == 'ş') {
                        isimtoplam2 += 0;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'a') {
                        isimtoplam2 += 1;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'b' || gelenIsverenIsim.charAt(i1) == 'n' || gelenIsverenIsim.charAt(i1) == 'p') {
                        isimtoplam2 += 2;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'c' || gelenIsverenIsim.charAt(i1) == 'ç' || gelenIsverenIsim.charAt(i1) == 'f' || gelenIsverenIsim.charAt(i1) == 'j') {
                        isimtoplam2 += 3;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'd' || gelenIsverenIsim.charAt(i1) == 'k' || gelenIsverenIsim.charAt(i1) == 'm' || gelenIsverenIsim.charAt(i1) == 't') {
                        isimtoplam2 += 4;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'e') {
                        isimtoplam2 += 5;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'v' || gelenIsverenIsim.charAt(i1) == 'l') {
                        isimtoplam2 += 6;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'o' || gelenIsverenIsim.charAt(i1) == 'ö' || gelenIsverenIsim.charAt(i1) == 'u' || gelenIsverenIsim.charAt(i1) == 'ü' || gelenIsverenIsim.charAt(i1) == 'z') {
                        isimtoplam2 += 7;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'g' || gelenIsverenIsim.charAt(i1) == 'ğ' || gelenIsverenIsim.charAt(i1) == 'h' || gelenIsverenIsim.charAt(i1) == 'r') {
                        isimtoplam2 += 8;
                    }
                    if (gelenIsverenIsim.charAt(i1) == 'i' || gelenIsverenIsim.charAt(i1) == 'ı' || gelenIsverenIsim.charAt(i1) == 'y') {
                        isimtoplam2 += 10;
                    }
                }
                do {
                    tarihtoplam2 += isverentarih % 10;
                    isverentarih = isverentarih / 10;
                } while (isverentarih > 0);

                int tarihtoplam3 = 0;
                int isimtoplam3 = 0;

                for (int i1 = 0; i1 < gelenIsyeriIsmi.length(); i1++) {

                    if (gelenIsyeriIsmi.charAt(i1) == 's' || gelenIsyeriIsmi.charAt(i1) == 'ş') {
                        isimtoplam3 += 0;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'a') {
                        isimtoplam3 += 1;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'b' || gelenIsyeriIsmi.charAt(i1) == 'n' || gelenIsyeriIsmi.charAt(i1) == 'p') {
                        isimtoplam3 += 2;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'c' || gelenIsyeriIsmi.charAt(i1) == 'ç' || gelenIsyeriIsmi.charAt(i1) == 'f' || gelenIsyeriIsmi.charAt(i1) == 'j') {
                        isimtoplam3 += 3;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'd' || gelenIsyeriIsmi.charAt(i1) == 'k' || gelenIsyeriIsmi.charAt(i1) == 'm' || gelenIsyeriIsmi.charAt(i1) == 't') {
                        isimtoplam3 += 4;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'e') {
                        isimtoplam3 += 5;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'v' || gelenIsyeriIsmi.charAt(i1) == 'l') {
                        isimtoplam3 += 6;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'o' || gelenIsyeriIsmi.charAt(i1) == 'ö' || gelenIsyeriIsmi.charAt(i1) == 'u' || gelenIsyeriIsmi.charAt(i1) == 'ü' || gelenIsyeriIsmi.charAt(i1) == 'z') {
                        isimtoplam3 += 7;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'g' || gelenIsyeriIsmi.charAt(i1) == 'ğ' || gelenIsyeriIsmi.charAt(i1) == 'h' || gelenIsyeriIsmi.charAt(i1) == 'r') {
                        isimtoplam3 += 8;
                    }
                    if (gelenIsyeriIsmi.charAt(i1) == 'i' || gelenIsyeriIsmi.charAt(i1) == 'ı' || gelenIsyeriIsmi.charAt(i1) == 'y') {
                        isimtoplam3 += 10;
                    }
                }
                do {
                    tarihtoplam3 += isyeritarih % 10;
                    isyeritarih = isyeritarih / 10;
                } while (isyeritarih > 0);

                int yeni_toplam_kendi = isimtoplam + tarihtoplam;
                int yeni_toplam_isveren = isimtoplam2 + tarihtoplam2;
                int yenitoplamisyeri = isimtoplam3 + tarihtoplam3;

                sonucbir.setText(String.valueOf("Kendi isminizin ve doğum tarihinizin basamakları toplamı = " + isimtoplam +" + "+  tarihtoplam + "= " + yeni_toplam_kendi + "   " +
                                                "İşveren ismi ve doğum tarihinin basamakları toplamı = " + isimtoplam2 + " + " + tarihtoplam2 + "= " + yeni_toplam_isveren + "   " +
                                                "İş yeri ismi ve açılış tarihinin basamakları toplamı = " + isimtoplam3 + " + " + tarihtoplam3 + "= " + yenitoplamisyeri));

                int toplamAnaliz = yenitoplamisyeri + yeni_toplam_kendi + yeni_toplam_isveren;

                int yuzler = toplamAnaliz / 100;
                int onlar = (toplamAnaliz % 100) / 10;
                int birler = (toplamAnaliz % 100) % 10;

                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    // İYİ İYİ İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyumu + " -> %100 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ İYİ KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ İYİ KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu2 + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÖTÜ KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÇB İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÇB KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // İYİ KÇB KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyum3 + " + " + isimuyum3 + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB İYİ İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB İYİ KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB İYİ KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyumu2 + " -> %100 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB KÇB İYİ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÖTÜ
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)) {
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÇB
                    sonuciki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyum3 + " -> Kaderi Çabasına Bağlı."));

                }




            }
        });


    }
}