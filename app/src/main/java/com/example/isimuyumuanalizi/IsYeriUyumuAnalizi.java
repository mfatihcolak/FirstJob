package com.example.isimuyumuanalizi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class IsYeriUyumuAnalizi extends AppCompatActivity {

    private Button hesaplama_butonu_isyeri;
    private TextInputEditText isim_alani, tarih_alani, is_yeri_ismi, is_yeri_tarih;
    private TextView sonuc_bir, sonuc_iki;
    private Toolbar toolbar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_yeri_uyumu_analizi);

        hesaplama_butonu_isyeri = findViewById(R.id.hesaplama_butonu_isyeri);
        isim_alani = findViewById(R.id.isim_alani);
        tarih_alani = findViewById(R.id.tarih_alani);
        is_yeri_ismi = findViewById(R.id.is_yeri_ismi);
        is_yeri_tarih = findViewById(R.id.is_yeri_tarih);
        sonuc_bir = findViewById(R.id.sonuc_bir);
        sonuc_iki = findViewById(R.id.sonuc_iki);
        toolbar4 = findViewById(R.id.toolbar4);

        toolbar4.setTitle("İş Yeri Uyumu Analizi");

        hesaplama_butonu_isyeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenIsim = isim_alani.getText().toString().trim().toLowerCase();
                String gelenTarih = tarih_alani.getText().toString().trim();
                String gelenIsYeriIsmi = is_yeri_ismi.getText().toString().trim().toLowerCase();
                String gelenIsYeriTarihi = is_yeri_tarih.getText().toString().trim();

                double dogumTarihi = Double.parseDouble(gelenTarih);
                double isYeriTarihi = Double.parseDouble(gelenIsYeriTarihi);

                int tarihtoplam = 0;
                int isimtoplam = 0;

                for (int i1 = 0; i1 < gelenIsim.length(); i1++) {

                    if (gelenIsim.charAt(i1) == 's' || gelenIsim.charAt(i1) == 'ş') {
                        isimtoplam += 0;
                    }
                    if (gelenIsim.charAt(i1) == 'a') {
                        isimtoplam += 1;
                    }
                    if (gelenIsim.charAt(i1) == 'b' || gelenIsim.charAt(i1) == 'n' || gelenIsim.charAt(i1) == 'p') {
                        isimtoplam += 2;
                    }
                    if (gelenIsim.charAt(i1) == 'c' || gelenIsim.charAt(i1) == 'ç' || gelenIsim.charAt(i1) == 'f' || gelenIsim.charAt(i1) == 'j') {
                        isimtoplam += 3;
                    }
                    if (gelenIsim.charAt(i1) == 'd' || gelenIsim.charAt(i1) == 'k' || gelenIsim.charAt(i1) == 'm' || gelenIsim.charAt(i1) == 't') {
                        isimtoplam += 4;
                    }
                    if (gelenIsim.charAt(i1) == 'e') {
                        isimtoplam += 5;
                    }
                    if (gelenIsim.charAt(i1) == 'v' || gelenIsim.charAt(i1) == 'l') {
                        isimtoplam += 6;
                    }
                    if (gelenIsim.charAt(i1) == 'o' || gelenIsim.charAt(i1) == 'ö' || gelenIsim.charAt(i1) == 'u' || gelenIsim.charAt(i1) == 'ü' || gelenIsim.charAt(i1) == 'z') {
                        isimtoplam += 7;
                    }
                    if (gelenIsim.charAt(i1) == 'g' || gelenIsim.charAt(i1) == 'ğ' || gelenIsim.charAt(i1) == 'h' || gelenIsim.charAt(i1) == 'r') {
                        isimtoplam += 8;
                    }
                    if (gelenIsim.charAt(i1) == 'i' || gelenIsim.charAt(i1) == 'ı' || gelenIsim.charAt(i1) == 'y') {
                        isimtoplam += 10;
                    }
                }
                do {
                    tarihtoplam += dogumTarihi % 10;
                    dogumTarihi = dogumTarihi / 10;
                } while (dogumTarihi > 0);

                int tarihtoplam2 = 0;
                int isimtoplam2 = 0;

                for (int i1 = 0; i1 < gelenIsYeriIsmi.length(); i1++) {

                    if (gelenIsYeriIsmi.charAt(i1) == 's' || gelenIsYeriIsmi.charAt(i1) == 'ş') {
                        isimtoplam2 += 0;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'a') {
                        isimtoplam2 += 1;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'b' || gelenIsYeriIsmi.charAt(i1) == 'n' || gelenIsYeriIsmi.charAt(i1) == 'p') {
                        isimtoplam2 += 2;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'c' || gelenIsYeriIsmi.charAt(i1) == 'ç' || gelenIsYeriIsmi.charAt(i1) == 'f' || gelenIsYeriIsmi.charAt(i1) == 'j') {
                        isimtoplam2 += 3;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'd' || gelenIsYeriIsmi.charAt(i1) == 'k' || gelenIsYeriIsmi.charAt(i1) == 'm' || gelenIsYeriIsmi.charAt(i1) == 't') {
                        isimtoplam2 += 4;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'e') {
                        isimtoplam2 += 5;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'v' || gelenIsYeriIsmi.charAt(i1) == 'l') {
                        isimtoplam2 += 6;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'o' || gelenIsYeriIsmi.charAt(i1) == 'ö' || gelenIsYeriIsmi.charAt(i1) == 'u' || gelenIsYeriIsmi.charAt(i1) == 'ü' || gelenIsYeriIsmi.charAt(i1) == 'z') {
                        isimtoplam2 += 7;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'g' || gelenIsYeriIsmi.charAt(i1) == 'ğ' || gelenIsYeriIsmi.charAt(i1) == 'h' || gelenIsYeriIsmi.charAt(i1) == 'r') {
                        isimtoplam2 += 8;
                    }
                    if (gelenIsYeriIsmi.charAt(i1) == 'i' || gelenIsYeriIsmi.charAt(i1) == 'ı' || gelenIsYeriIsmi.charAt(i1) == 'y') {
                        isimtoplam2 += 10;
                    }
                }
                do {
                    tarihtoplam2 += isYeriTarihi % 10;
                    isYeriTarihi = isYeriTarihi / 10;
                } while (isYeriTarihi > 0);

                int yeni_toplam_kendi = isimtoplam + tarihtoplam;
                int yeni_toplam_isyeri = isimtoplam2 + tarihtoplam2;

                sonuc_bir.setText(String.valueOf("Kendi isminizin ve doğum tarihinizin basamakları toplamı = " + isimtoplam + " + " + tarihtoplam + "= " + yeni_toplam_kendi + "\n" +
                        "İş yeri ismi ve açılış tarihinin basamakları toplamı = " + isimtoplam2 + " + " + tarihtoplam2 + "= " + yeni_toplam_isyeri));

                int toplamAnaliz = yeni_toplam_isyeri + yeni_toplam_kendi;

                int yuzler = toplamAnaliz / 100;
                int onlar = (toplamAnaliz % 100) / 10;
                int birler = (toplamAnaliz % 100) % 10;

                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    // İYİ İYİ İYİ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyumu + " -> %100 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ İYİ KÖTÜ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ İYİ KÇB
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu + " + " + isimuyum3 + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ İYİ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu = "İYİ";
                    String isimuyumu2 = "KÖTÜ";
                    //İYİ KÖTÜ KÖTÜ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
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
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //İYİ KÇB İYİ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
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
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 1 || yuzler == 2 || yuzler == 3 || yuzler == 7) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // İYİ KÇB KÇB
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyumu + " + " + isimuyum3 + " + " + isimuyum3 + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB İYİ İYİ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
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
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 1 || onlar == 2 || onlar == 3 || onlar == 7) && (birler == 0 || birler == 9)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB İYİ KÇB
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
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
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyumu + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÖTÜ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyumu2 + " -> %100 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 4 || onlar == 5 || onlar == 6 || onlar == 8) && (birler == 0 || birler == 9)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÖTÜ KÇB
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyumu2 + " + " + isimuyum3 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 1 || birler == 2 || birler == 3 || birler == 7)) {
                    String isimuyumu = "İYİ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    // KÇB KÇB İYİ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyumu + " -> %75 uyumlu."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 4 || birler == 5 || birler == 6 || birler == 8)) {
                    String isimuyumu2 = "KÖTÜ";
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÖTÜ
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyumu2 + " -> %75 uyumsuz."));
                }
                if ((yuzler == 0 || yuzler == 9) && (onlar == 0 || onlar == 9) && (birler == 0 || birler == 9)) {
                    String isimuyum3 = "Kaderi Çabasına Bağlı";
                    //KÇB KÇB KÇB
                    sonuc_iki.setText(String.valueOf("İsimlerin ve tarihlerin basmakları toplamının -> \n" + toplamAnaliz + " \n"
                            + "Yüzler basamağı = " + yuzler + "\n" +
                            "Onlar basamağı = " + onlar + "\n" +
                            "Birler basamağı = " + birler + "\n" +
                            "İş Yeri Uyumu = " + isimuyum3 + " + " + isimuyum3 + " + " + isimuyum3 + " -> Kaderi Çabasına Bağlı."));

                }
            }
        });

        }
}