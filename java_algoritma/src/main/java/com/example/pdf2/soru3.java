package com.example.pdf2;
//void sayiOku(float g[], int n);
//void yazdir(float g[], int n);
//float maksimumHesapla(float g[], int n);
//int main() {
//    float *g;
//    int n;
//    cout << "Girmek istediğiniz sayi adedini giriniz:";
//    cin >> n;
//    g = new float[n];
//    sayiOku(g, n);
//    yazdir(g, n);
//    cout << "En büyük sayi:" << maksimumHesapla(g, n) << endl;
//    delete[] g;
//    return 0;
//}
//void sayiOku(float g[], int n) {
//    for (int i = 0; i < n; i++) {
//        cout << i + 1 << ".sayi:";
//        cin >> g[i];
//    }
//}
//void yazdir(float g[], int n) {
//    for (int i = 0; i < n; i++) {
//        cout << g[i] << endl;
//    }
//}
//float maksimumHesapla(float g[], int n) {
//    float m = g[0];
//    for (int i = 1; i < n; i++) {
//        if (g[i] > m) {
//            m = g[i];
//        }
//    }
//    return m;
//}

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] g;
        int n;
        System.out.print("Girmek istediğiniz sayi adedini giriniz:");
        n = scanner.nextInt();
        g = new float[n]; //sayı adedini verdi
        sayiOku(g, n, scanner);
        yazdir(g, n);
        System.out.println("En büyük sayi:" + maksimumHesapla(g, n));
    }

    public static void sayiOku(float g[], int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ".sayi:");
            g[i] = scanner.nextFloat();
        }
    }

    public static void yazdir(float g[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(g[i]);
        }
    }

    public static float maksimumHesapla(float g[], int n) {
        float m = g[0];
        for (int i = 1; i < n; i++) {
            if (g[i] > m) {
                m = g[i];
            }
        }
        return m;
    }
}