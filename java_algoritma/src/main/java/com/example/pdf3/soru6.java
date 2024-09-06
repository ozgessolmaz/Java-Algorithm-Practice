package com.example.pdf3;
import java.util.Scanner;

public class soru6 {
    public static void main(String[] args){
        while(true){
        Scanner inp = new Scanner(System.in);
        String ybi;
        int ybn,dogum,olum;
        System.out.print("Yerleşim Biriminin ismini giriniz:");
        ybi= inp.nextLine();
        System.out.print("Nufusunu giriniz:");
        ybn= inp.nextInt();
        System.out.print("Dogum sayısını giriniz:");
        dogum= inp.nextInt();
        System.out.print("Olum sayısını giriniz:");
        olum= inp.nextInt();

        double dogumOrani = (double)dogum/ybn;
        System.out.println(ybi  + "------ Dogum Orani" + dogumOrani);

        double olumOrani = (double)olum/ybn;
        System.out.println(ybi  + "------- Olum Orani" +olumOrani);



    }
  }
}