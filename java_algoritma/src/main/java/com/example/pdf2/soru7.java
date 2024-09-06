package com.example.pdf2;
import java.util.Scanner;
//bir dizinin modunu bulan program
// tüm değerler sadece 1 kez tekrarlanıyorsa -1 al
//33456789 modu:3

public class soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        int mod = findMod(dizi);
        System.out.println("verinin modu: " + mod);
    }

    public static int findMod(int[] dizi) {
        int[] tekrarSayisi = new int[21];

        for (int num : dizi) {
            tekrarSayisi[num]++;
        }

        boolean tekTekrarlananVar = false;
        int mod = -1;
        for (int i = 0; i < tekrarSayisi.length; i++) {
            if (tekrarSayisi[i] > 1) {
                if (tekTekrarlananVar) {
                    return -1; // Birden fazla eleman tekrarlanıyorsa kullandım
                }
                tekTekrarlananVar = true;
                mod = i;
            }
        }

        return mod;
    }
}
