package src;

import java.util.Scanner;

public class Daire implements  IIslem {
    int yariCap;
    double cevre;
    double alan;


    @Override
    public void alanHesapla() {
        alan=  (Math.PI * (yariCap * yariCap));
    }

    @Override
    public void cevreHesapla() {
    cevre= (2*Math.PI*yariCap);
    }

    public  static void daireIslemi(){
        Scanner input=new Scanner(System.in);
        Daire d1=new Daire();
        System.out.println("yariCap gir: ");
         d1.yariCap=input.nextInt();

        d1.cevreHesapla();
        d1.alanHesapla();
        System.out.println("Dairenin Cevresi: " + d1.cevre);
        System.out.println("Dairenin Alani: "  + d1.alan);
    }

    // TODO Bu class doldurunuz
}
