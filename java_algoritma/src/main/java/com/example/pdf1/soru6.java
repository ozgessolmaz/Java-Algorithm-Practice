package com.example.pdf1;
import java.util.Scanner;
//kod hatalı


class Kosucu {
    String ad;
    String soyad;
    String cinsiyet;
    String ulke;
    int saat;
    int dakika;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getDakika() {
        return dakika;
    }

    public void setDakika(int dakika) {
        this.dakika = dakika;
    }

    public int getSaniye() {
        return saniye;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }

    int saniye;

    public Kosucu(){

    }
    public Kosucu(String ad, String soyad,String cinsiyet, String ulke, int saat, int dakika,int saniye) {
        this.ad = ad;
        this.soyad=soyad;
        this.cinsiyet=cinsiyet;
        this.ulke=ulke;
        this.saat = saat;
        this.dakika = dakika;
        this.saniye=saniye;
    }
}

public class soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kişi maratona katıldı? ");
        int katilimciSayisi = scanner.nextInt();

        Kosucu[] kosucular = new Kosucu[katilimciSayisi];
        Kosucu kosucu = new Kosucu();

        for (int i = 0; i < katilimciSayisi; i++) {
            System.out.println("Koşucu " + (i + 1) + " bilgilerini girin:");//kaçıncı koşucunun bilgilerini istediğimizi belirtir.
            System.out.print("Adı: ");
            String ad = scanner.next();
            System.out.print("Soyadı: ");
            String soyad = scanner.next();
            System.out.print("Cinsiyet: ");
            String cinsiyet = scanner.next();
            System.out.print("Ülke: ");
            String ulke = scanner.next();
            System.out.print("Saat: ");
            int saat = scanner.nextInt();
            System.out.print("Dakika: ");
            int dakika = scanner.nextInt();
            System.out.print("Saniye: ");
            int saniye = scanner.nextInt();

            kosucu.saniye=saniye;
            kosucu.ad=ad;
            kosucu.soyad=soyad;
            kosucu.cinsiyet=cinsiyet;
            kosucu.ulke=ulke;
            kosucu.saat=saat;
            kosucu.dakika=dakika;

            kosucular[i] = new Kosucu(ad,soyad,cinsiyet,ulke,saat,dakika,saniye);
        }

        Kosucu enHizliKosucu = enHizliKosucuyuBul(kosucular);
        System.out.println("En hızlı koşucu bilgileri:");
        System.out.println("Adı: " + enHizliKosucu.ad);
        System.out.println("Soyadı: " + enHizliKosucu.soyad);
        System.out.println("Cinsiyeti: " + enHizliKosucu.cinsiyet);
        System.out.println("Ülkesi: " + enHizliKosucu.ulke);
        System.out.println("SAat: " + enHizliKosucu.saat);
        System.out.println("Dakika: " + enHizliKosucu.dakika);
        System.out.println("Saniye: " + enHizliKosucu.saniye);

    }

    public static Kosucu enHizliKosucuyuBul(Kosucu[] kosucular) {
        Kosucu enHizli = kosucular[0];
        for (int i = 0 ; i < kosucular.length; i++) {
            if (kosucular[i].saat < enHizli.saat ) {
                enHizli = kosucular[i];
            }
                else if(kosucular[i].dakika< enHizli.dakika ){
                    enHizli = kosucular[i];
                }
                else if ( kosucular[i].saniye< enHizli.saniye ) {
                    enHizli = kosucular[i];

                }

            }
        return enHizli;
    }
}
