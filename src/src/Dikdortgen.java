package src;

import java.util.Scanner;

public class Dikdortgen implements IIslem {
    int uzunKenar;
    int kisaKenar;
    double cevre;
    double alan;

    @Override
    public void alanHesapla() {
        alan=uzunKenar*kisaKenar;

    }

    @Override
    public void cevreHesapla() {
        cevre=2*(uzunKenar+kisaKenar);

    }
    public  static void dikdortgenIslemi(){
        Scanner input=new Scanner(System.in);
        Dikdortgen d=new Dikdortgen();
        System.out.println("uzun kenar gir: ");
        d.uzunKenar= input.nextInt();
        System.out.println("Kisa kenar gir: ");
        d.kisaKenar=input.nextInt();
        d.cevreHesapla();
        d.alanHesapla();
        System.out.println("Dikdortgenin Cevresi: " +d.cevre);
        System.out.println("Dikdortgenin Alani: " + d.alan);
    }

    // TODO Bu class doldurunuz
}
