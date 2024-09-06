package com.example.pdf3;
import java.util.Scanner;

//Silindir sınıfına ait sınıf diyagramı ve bu sınıfa ait fonksiyonların
//gerçekleştirilmesinde kullanışacak formüller aş. verilmiştir.
public class soru5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int yukseklik,pi,yaricap;

        System.out.print("Silindirin yüksekliği giriniz(h):");
        yukseklik = inp.nextInt();

        System.out.print("Silindirin taban yarıçapı(r):");
        yaricap= inp.nextInt();

        double alan = (2*Math.PI*yaricap*yukseklik)+(2*Math.PI*yaricap*yaricap);

        System.out.println("Silindirin Yüzey alanı(A):"+alan);

        double hacmi = Math.PI*yaricap*yaricap*yukseklik;

        System.out.println("Silindirin Hacmi(H):"+hacmi);



    }
}
