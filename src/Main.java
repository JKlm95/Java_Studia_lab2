import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


//        int i = 0;
//        int index = 234230;
//        int lastIndex = index % 10;
//        int lastTwoIndex = index % 100;
//
//        for (i = 100; i > 0; i-- )
//        {
//            if (lastIndex != 0) {
//                if (i % lastIndex == 0) {
//
//                    System.out.println("liczba " + i + " jest podzielna przez " + lastIndex);
//
//                }
//            }
//            else if (i % lastTwoIndex == 0)
//            {
//                System.out.println("liczba " + i + " jest podzielna przez " + lastTwoIndex);
//
//            }
//        }





        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


//        int[] tab = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj liczby");
//        for(int i=0; i<5; i++)
//            tab[i] = Integer.parseInt(scanner.nextLine());
//
//        for (int zmienna: tab)
//        {
//            System.out.println(zmienna + 11);
//        }
    }
}
