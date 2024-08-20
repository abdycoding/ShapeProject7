package src;

import java.util.Scanner;

public class Ucgen implements IIslem {
    double cevre;
    double alan;
    int kenar1;
    int kenar2;
    int kenar3;
    double s;

    @Override
    public void alanHesapla() {
        s = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
    }

    @Override
    public void cevreHesapla() {
        cevre = kenar1 + kenar2 + kenar3;
    }

    public static void ucgenIslemi() {
        Scanner input = new Scanner(System.in);
        Ucgen u = new Ucgen();
        System.out.println("kenar 1 gir: ");
        u.kenar1 = input.nextInt();
        System.out.println("kenar 2 gir: ");
        u.kenar2 = input.nextInt();
        System.out.println("kenar 3 gir: ");
        u.kenar3 = input.nextInt();
        u.cevreHesapla();
        u.alanHesapla();
        System.out.println("Ucgenin Cevresi: " + u.cevre);
        System.out.println("Ucgenin Alani: " + u.alan);
    }
    // TODO Bu class doldurunuz


}
