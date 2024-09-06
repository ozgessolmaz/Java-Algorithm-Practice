package com.example.pdf2;

//void degistir(int* x, int* y, int* z) {
//    int temp = *x;
//    *x = *y;
//    *y = *z;
//    *z = temp;
//}
//
//
//int main() {
//    int x = 10;
//    int y = 30;
//    int z = 40;
//    degistir(&x, &y, &z);
//    cout << x << endl;
//    cout << y << endl;
//    cout << z << endl;
//    return 0;
//}
public class soru4 {
    public static void main(String[] args){
        int x=10,y=30,z=40;
        degistir(x,y,z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void degistir(int x, int y, int z){
        int temp = x;
        x = y;
        y = z;
        z = temp;
    }
}
