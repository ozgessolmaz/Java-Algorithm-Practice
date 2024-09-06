package com.example.pdf1;
import java.util.Scanner;
//Üniversite öğrenci bilgi sisteminde
// kullanılacak bir program aşağıda verilmiştir,
// ancak bazı kısımları eksik bırakılmıştır.
// Bu programda her öğrencinin adı, soyadı, sınıf
// ve not ortalaması bilgileri bir yapı içerisinde tutulacak
// ve bölümde okuyan 100 öğrencinin bilgileri bir yapı içerisinde
// okunacaktır.Program bölümü birincilikle bitirecek 4.
// sınıf öğrencisinin isim ve soyadını ekrana yazdıracaktır.
//#include <iostream>
//using namespace std;
//struct Oğrenci{
//.....;
//.....;
//.....;
//};
//int main(){
//...... arr[100];
//int bir=0;
//float yuksek=0.0;
//for(int i=0; i<3; i++){
//     cout<<"Oğrencinin isim, soyad, sinif ve ortalaması:";
//     cin>>......;
//     if((.........)&&(......)){
//         .......;
//         ........;
//     }
// }
//cout<<"Bölüm birincisi:"<<endl;
//cout<<"İsim"<<......<<"Soyad:<<........;
//cout<<"Not ortalaması:"<<.......<<endl;
//return 0;
//}
class Ogrenci {
    String ad;
    String soyad;
    int sinif;
    float notOrtalamasi;

    public Ogrenci(String ad, String soyad, int sinif, float notOrtalamasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.notOrtalamasi = notOrtalamasi;
    }
}

public class soru3 {
    public static void main(String[] args) {
        Ogrenci[] arr = new Ogrenci[100];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Öğrencinin ismi: ");
            String ad = scanner.next();
            System.out.print("Öğrencinin soyadı: ");
            String soyad = scanner.next();
            System.out.print("Öğrencinin sınıfı: ");
            int sinif = scanner.nextInt();
            System.out.print("Öğrencinin not ortalaması: ");
            float notOrtalamasi = scanner.nextFloat();

            arr[i] = new Ogrenci(ad, soyad, sinif, notOrtalamasi);
        }

        int bir = 0;
        float yuksek = 0.0f;

        for (int i = 0; i < 3; i++) {
            if (arr[i].sinif == 4 && arr[i].notOrtalamasi > yuksek) {
                yuksek = arr[i].notOrtalamasi;
                bir = i;
            }
        }

        System.out.println("Bölüm birincisi:");
        System.out.println("İsim: " + arr[bir].ad);
        System.out.println("Soyad: " + arr[bir].soyad);
        System.out.println("Not ortalaması: " + arr[bir].notOrtalamasi);

        scanner.close();
    }
}