package com.example.pdf2;
import java.util.Scanner;

public class soru5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz: ");
        int n = scanner.nextInt();

        String[] dizi = new String[n];//diziyi tanımladık

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.next();
        }

        System.out.println("Dizinin elemanları: ");
        for (int i = 0; i < n; i++) {
            System.out.println(dizi[i]);
        }

        System.out.println("Dizideki kaçıncı elemanı silmek istiyorsunuz? ");
        int sil = scanner.nextInt();


        dizi[sil - 1] = null;//null dizinin boş elemanını temsil etmek için kullanılır.
        //silmek istediğimiz elemanın indeksini bulmak için sil değerinden -1 çıkartırız.

        System.out.println("Dizinin güncel hali: ");
        for (int i = 0; i < n; i++) {
            if (dizi[i] != null) {
                System.out.println(dizi[i]);
            }
        }
    }
}
