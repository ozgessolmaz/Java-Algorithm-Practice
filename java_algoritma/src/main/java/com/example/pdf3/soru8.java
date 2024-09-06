package com.example.pdf3v;
import java.util.Scanner;

//Lirayı kuruşa çeviren program (50,25,10,5,1 kuruş)

public class soru8 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Para miktarını lira olarak giriniz:");
        double lira = inp.nextDouble();

        int bolme = (int)(lira * 100);
        int kurus50= bolme/50;
        bolme %= 50;
        int kurus25= bolme/25;
        bolme %= 25;
        int kurus10= bolme/10;
        bolme %= 10;
        int kurus5 = bolme/5;
        bolme %= 5;
        int kurus1 = bolme;

        System.out.println("50 kurus:" +kurus50);
        System.out.println("25 kurus:" +kurus25);
        System.out.println("10 kurus:" +kurus10);
        System.out.println("5 kurus:" +kurus5);
        System.out.println("1 kurus:" +kurus1);

    }
}
