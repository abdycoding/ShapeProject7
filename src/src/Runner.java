package src;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO Bu class doldurunuz

        Scanner input = new Scanner(System.in);
        int secim = 0;
        System.out.println("Welcome to the GEOMETRY club: ");
        do {

            System.out.print("\n 1. Kare \n 2. Dikdortgen \n 3. Daire \n 4.Ucgen \n 5. Cikis \n Seçiminizi yapın: ");
            secim=input.nextInt();
            switch (secim) {
                case 1: Kare.kareIslemi();
                    break;
                case 2: Dikdortgen.dikdortgenIslemi();
                    break;
                case 3: Daire.daireIslemi();
                    break;
                case 4: Ucgen.ucgenIslemi();
                    break;
                case 5:
                    System.out.println("The End");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gecersiz tushlama");


            }
        } while (true);


    }
}
