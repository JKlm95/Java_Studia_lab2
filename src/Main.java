import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        zad1();

        zad2();


        zad3("Kuba");
        zad3("Kuba", "Klimiuk");
        zad3("Kuba", "Klimiuk", 26);



        int zmiennaA = zad4(1, 2);
        int zmiennaB = zad4(7, 8, 9);
        System.out.println(zmiennaA + zmiennaB);



        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */


    }




     /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */


    public static void zad1() {
        //Wyświetla 20 elementów od 40 do 21.

        int[] tab = new int[20];
        for (int i = 0, j = 40; i < tab.length; i++, j--) {
            tab[i] = j;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }


     /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */


    public static void zad2()

    {
        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */


        String[] str = new String[6];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < str.length; i++)
        {
            str[i] = scanner.nextLine();
        }

        String[] odwrotne = new String[str.length];
        for (int i = str.length -1; i > 0;)
        {
             for (int j = 0; j< str.length; j++)
            {
                odwrotne[j] = str[i];
                i--;
            }

                System.out.println(Arrays.toString(odwrotne));
        }
    }



/* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */


    public static void zad3(String kuba)
    {
        System.out.println("imie: " + kuba);
    }

    public static void zad3(String kuba, String klimiuk)
    {
        System.out.println("imie: " + kuba + ", nazwisko: " + klimiuk);
    }

    public static void zad3(String kuba, String klimiuk, int i)
    {
        System.out.println("imie: " + kuba + ", nazwisko: " + klimiuk + ", wiek: " + i);
    }




    /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */


    public static int zad4(int zmienna1, int zmienna2)
    {
        return zmienna1 + zmienna2;
    }

    public static int zad4(int zmienna3, int zmienna4, int zmienna5)
    {
        return zmienna3 + zmienna4 + zmienna5;
    }



}










