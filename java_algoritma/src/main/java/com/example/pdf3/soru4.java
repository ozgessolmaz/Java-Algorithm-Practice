package com.example.pdf3;
//#include <iostream>
////Aşağıda bir saatin çalışmasını gösteren program verilmiş
////ancak bazı kısımlar eksik bırakılmış
//using namespace std;
//class Saat{
//    int saat, dakika;
//public:
//    void basla(int s,int d);
//    void arttir();
//    void goster();
//};
//void Saat :: basla(int s,int d){
//    saat=s;
//    dakika=d;
//}
//void Saat::arttir(){
//    if(dakika<59)
//        dakika++;
//    else{
//        dakika=0;
//        if(saat<23)
//            saat++;
//        else
//            saat=0;
//    }
//}
//void Saat::goster() {
//    if(saat==0)
//        cout<<"00:";
//    else if(saat<10)
//        cout<<"0"<<saat<<":";
//    else
//        cout<<saat<<":";
//    if(dakika==0)
//        cout<<"00"<<endl;
//    else if(dakika<10)
//        cout<<"0"<<dakika<<endl;
//    else
//        cout<<dakika<<endl;
//}
//}
//
//int main() {
//    Saat s;
//    s.basla(12,30);
//    cout<<"Saat:";
//    s.goster();
//    cout<<"10 dakika boyunca:"<<endl;
//    for(int i=1; i<=10; i++){
//        s.arttir();
//        s.goster();
//    }
//    return 0;
//}


class Saat {
    private int saat, dakika;
    public void basla(int s, int d) {
        saat = s;
        dakika = d;
    }
    public void arttir() {
        if (dakika < 59)
            dakika++;
        else {
            dakika = 0;
            if (saat < 23)
                saat++;
            else
                saat = 0;
        }
    }
    public void goster() {
        if (saat == 0)
            System.out.print("00:");
        else if (saat < 10)
            System.out.print("0:");
        else
            System.out.print(saat + ":");

        if (dakika == 0)
            System.out.println("00");
        else if (dakika < 10)
            System.out.println("0" + dakika);
        else
            System.out.println(dakika);
    }
}
public class soru4 {
    public static void main(String[] args) {
        Saat s = new Saat();
        s.basla(14,55 );
        System.out.print("Saat:");
        s.goster();
        System.out.println("10 dakika boyunca:");
        for (int i = 0; i <= 10; i++) {
            s.arttir();
            s.goster();
        }
    }
}
