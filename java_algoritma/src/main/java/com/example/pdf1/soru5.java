package com.example.pdf1;
//Aş. gösterildiği gibi ilk değer atama yöntemi
// ile iletişim bilgilerini eklenen 5 kişilik bir
// telefon rehberinin yaratıldığını varsayın.Bu rehber üzerinde
//isim, soyadı ya da adres bilgisine göre arama yapan ve arama
//kriterine uygun kayıt bulunması halinde söz konusu kişi ya da
//kişilerin kayıt bilgilerinin ekrana yazdıran bir program yazınız
//Birey rehber[] = {{"Halil","Yilmaz",5555555,"Trabzon"},
//                 {{"Ebru","Dinc",2222222,"Kayseri"},
//                 {{"Tolga","Yalçın",1111111,"Ankara"},
//                 {{"Tolga","Yavuz",3333333,"Bursa"},
//                 {{"Bahar","Ozay",8888888,"Urfa"}
//void arama(Birey rehber[], string aramaKriterleri, string anahtar);
//void kayıtBilgisiGoster(Birey birey);

import java.util.Scanner;

class Kisiler {
    String adi;
    String soyadi;
    int telefon;
    String adres;

    public Kisiler(String adi, String soyadi, int telefon, String adres) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefon = telefon;
        this.adres = adres;
    }
}

public class soru5 {
    public static void main(String[] args) {
        Kisiler[] rehber = {
                new Kisiler("Halil", "Yilmaz", 5555555, "Trabzon"),
                new Kisiler("Ebru", "Dinc", 2222222, "Kayseri"),
                new Kisiler("Tolga", "Yalçın", 1111111, "Ankara"),
                new Kisiler("Tolga", "Yavuz", 3333333, "Bursa"),
                new Kisiler("Bahar", "Ozay", 8888888, "Urfa")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak kişinin adı: ");
        String anahtar = scanner.next();
        arama(rehber, anahtar);
    }

    public static void arama(Kisiler[] rehber, String anahtar) {
        for (Kisiler kisi : rehber) {
            if (kisi.adi.equalsIgnoreCase(anahtar)) {
                kayitBilgisiGoster(kisi);
            }
        }
    }

    public static void kayitBilgisiGoster(Kisiler kisi) {
        System.out.println(kisi.adi + " " + kisi.soyadi + " " + kisi.telefon + " " + kisi.adres);
    }
}
