import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

//        Scanner scan = new Scanner((System.in));
//        System.out.print("Podaj liczbę: ");
//        int a = Integer.parseInt(scan.nextLine());
//
//        switch (a % 2) {
//            case 0:
//                System.out.println("Liczba podzielna przez 2");
//                break;
//            default:
//                System.out.println("Liczba nie podzielna przez 2");
//                break;
//        }



//        Scanner scan = new Scanner((System.in));
//        System.out.print("Podaj liczbę: ");
//        int a = Integer.parseInt(scan.nextLine());
//
//        switch (a % 7) {
//            case 0:
//                System.out.println("Liczba podzielna przez 7");
//                break;
//            default:
//                System.out.println("Liczba nie podzielna przez 7");
//                break;
//        }




        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */


//        String s = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
//        int[] tab = {0, 0, 0, 0, 0, 0};
//
//
//        for (char zmiennaChar : s.toCharArray())
//        {
//            switch (zmiennaChar) {
//                case 'o':
//                    ++tab[0];
//                    break;
//
//                case 'p':
//                    ++tab[1];
//                    break;
//
//                case 'x':
//                    ++tab[2];
//                    break;
//                case 'z':
//                    ++tab[3];
//                    break;
//                case 'q':
//                    ++tab[4];
//                    break;
//                default:
//                    ++tab[5];
//                    break;
//            }
//        }
//                System.out.printf("\nLitera występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy\ninne: %d - razy",
//                        tab[0], tab[1], tab[2], tab[3], tab[4], tab[5]);





    }
}
