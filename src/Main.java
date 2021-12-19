import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>(); //Tworzenie listy


        System.out.println("Wypisz 5 nazw zwierząt");

        for (int i = 0; i < 5; i++)  //Wypełnia listę
        {
        list1.add(scanner.nextLine());
        }


        for (String s : list1) //Wyswietla elementy listy
        {
            System.out.println(s);
        }


        list1.remove(list1.size() - 1); //Usuwa ostatni element listy
        list1.remove(list1.size() - 1);
        list1.add("krokodyl"); //Dodaje element na koniec listy
        list1.add("lama");
        list1.add("emu");
        System.out.println(list1); //Wyswietla liste

        System.out.println("Lista zawiera " + list1.size() + " elementów"); //Wyswietla ile elementów

        Collections.sort(list1, Collections.reverseOrder()); //Najpierw sortuje alfabetycznie, potem odwraca kolejnosc

        for(String s : list1)
        {
            System.out.println(s);
        }





         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        //Scanner scanner = new Scanner(System.in);
        Set<Integer> li = new TreeSet<>(); //Set nie dopuszcza do powtarzania się elementów i automatycznie je sortuje.

        System.out.println("Wprowadz 10 liczb");

        for (int i = 0; i < 10; i++) //Przyjmuje liczby
        {
            li.add(scanner.nextInt());
        }

        for(Integer i : li) //Wyswietla liczby
        {
            System.out.println(i);
        }



    }

}
