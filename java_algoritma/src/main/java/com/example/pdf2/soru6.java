package com.example.pdf2;
//Diyet Programın süresi(hafta sayısı):2
//1.hafta:72.3
//2.hafta:71.1
//kilo kaybı:1,2

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int hafta;
        double kiloKaybi = 0;
        double ilkKilo, sonKilo;

        System.out.print("Diyet Programın süresi(hafta sayısı):");
        hafta = scanner.nextInt();

        System.out.print("Başlangıç kilonuzu girin:");
        ilkKilo = scanner.nextDouble();

        for(int i = 1; i <= hafta; i++){
            System.out.print(i + ".hafta:");
            sonKilo = scanner.nextDouble();
            kiloKaybi += ilkKilo - sonKilo;
            ilkKilo = sonKilo;//her döngü adımında önceki
            // haftanın son kilosunu ilk kiloya atar.
        }

        System.out.println("Toplam kilo kaybı:" + kiloKaybi);
    }
}
