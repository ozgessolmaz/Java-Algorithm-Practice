package com.example.pdf3;


public class soru9 {
    public static void main(String[] args) {
        Telsiz telsiz = new Telsiz();//nesne oluşturduk static metod nesneye ihtiyaç duymadığı için void kullandık.
        telsiz.konus("Trafik kazası var, yardım gönderin...");//konus fonksiyonu oluşturduk
        telsiz.ledGoster();
        telsiz.ara("112");
        telsiz.gelenMesaj("112 arandı");
        telsiz.tamam();
        telsiz.sesSeviyesi(0);
    }
}
class Telsiz {//sınıf tanımladık
    public void konus(String mesaj) {
        System.out.println(mesaj);
    }

    public void ledGoster() {
        System.out.println("Kırmızı LED yanıyor...");
    }

    public void ara(String numara) {
        System.out.println(numara + " arandı");
    }

    public void gelenMesaj(String mesaj) {
        System.out.println("Gelen mesaj: " + mesaj);
    }

    public void tamam() {
        System.out.println("Tamam...");
    }

    public void sesSeviyesi(int seviye) {
        System.out.println("Ses seviyesi: " + seviye);
    }
}

