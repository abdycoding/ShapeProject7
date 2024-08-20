package src;

import java.util.Scanner;

public class Kare implements IIslem{
   int kenaruzunlugu;
   double cevre;
   double alan;

    @Override
    public void alanHesapla() {
        alan= Math.pow(kenaruzunlugu,2);

    }

    @Override
    public void cevreHesapla() {
        cevre=4*kenaruzunlugu;
    }

    public static void kareIslemi(){
        Scanner input=new Scanner(System.in);
        Kare k=new Kare();
        System.out.println("kenar uzunlugu gir: ");
         k.kenaruzunlugu= input.nextInt();
        k.cevreHesapla();
        k.alanHesapla();
        System.out.println("Karenin Cevresi: " + k.cevre);
        System.out.println("Karenin Alani: "+k.alan);
    }

    // TODO Bu class doldurunuz
}
