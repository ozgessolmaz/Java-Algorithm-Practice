package com.example.pdf1;
import java.util.Scanner;
//Bir otele giriş yapan turistlerin bilgilerini saklayan ve otelde
//kalan misafirlerin ortalama yaşını hesaplayan program ad,soyad,ülke,yaş Yeni giriş yapıcak mısın(E/H)
class Turist {
    String ad;
    String soyad;
    String ulke;
    int yas;

    public Turist(String ad, String soyad, String ulke, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.ulke = ulke;
        this.yas = yas;
    }
}
public class soru4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Turist[] turistler = new Turist[100];
        int turistSayisi = 0;

        do {
            System.out.print("Ad: ");
            String ad = inp.nextLine();
            System.out.print("Soyad: ");
            String soyad = inp.nextLine();
            System.out.print("Ulke: ");
            String ulke = inp.nextLine();
            System.out.print("Yas: ");
            int yas = inp.nextInt();
            inp.nextLine();

            turistler[turistSayisi++] = new Turist(ad, soyad, ulke, yas);

            System.out.print("Yeni giriş yapacak mısınız? (e/h): ");
            String devam = inp.next();
            inp.nextLine();
            if (!devam.toLowerCase().equals("e")) {
                break;
            }
        } while (true);

        inp.close();

        if (turistSayisi > 0) {
            int toplamYas = 0;
            for (int i = 0; i < turistSayisi; i++) {
                toplamYas += turistler[i].yas;
            }
            double ortYas = (double) toplamYas / turistSayisi;
            System.out.println("Misafirlerin ortalama yaşı: " + ortYas);
        }
    }
}






