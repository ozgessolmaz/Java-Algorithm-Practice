package com.example.pdf3;


public class soru7 {
    public static void main(String[] args) {
        double kolaFiyati = 2.5;
        int odeme = 3;
        int kolaAdedi = 100;

        double paraUstu = odeme - kolaFiyati;

        if (paraUstu >= 0) {
            kolaAdedi--;
            int kurus = (int) (paraUstu * 100);
            int paraUstuKurus = kurus % 100;
            System.out.println("Kolanız veriliyor.");
            System.out.println("Para üstünüz: " + paraUstuKurus + " kuruş");
        } else {
            System.out.println("Yetersiz ödeme.");
        }

        System.out.println("Son durum:");
        System.out.println("    Kolanın fiyatı: " + kolaFiyati + " lira.");
        System.out.println("    Kalan kola sayısı: " + kolaAdedi);
    }
}

