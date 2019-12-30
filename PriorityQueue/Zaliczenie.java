import java.util.PriorityQueue;
import java.util.Scanner;

class Pracownik implements Comparable<Pracownik> {

    private String imię;
    private String nazwisko;
    private String stanowisko;
    private int pensja;


    public Pracownik(String imie, String nazwisko, String stanowisko, int pensja) {
        this.imię = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.pensja = pensja;

    }

    // get zwraca dane
    public String getImię() {

        return imię;
    }

    public String getNazwisko() {

        return nazwisko;
    }


    public String getStanowisko() {

        return stanowisko;
    }


    public double getPensja() {
        return pensja;
    }






    //@Override- Informacja, że nadpisuje oraz przestroga dla kompilatora by przepuścił tylko i wyłącznie gdy coś nadpisuje.
    @Override
    public String toString() {
        return "\r\n"+ "\r\n"+"imię: " + getImię() + ", nazwisko: " + getNazwisko() + ", stanowisko: " + getStanowisko()+ ", pensja:" + getPensja() +"$" ;
    }

    // Porównywanie obiektów pracownik po ich pensji
    @Override
    public int compareTo(Pracownik pracownik) {
        if(this.getPensja() < pracownik.getPensja()) {
            return 1;
        } else if (this.getPensja() > pracownik.getPensja()) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Zaliczenie {


    public static PriorityQueue<Pracownik> PracownicyKolejkaPriorytetowa;



    public static void main(String[] args) {

        // Tworzenie kolejki priorytetowej
        PriorityQueue<Pracownik> PracownicyKolejkaPriorytetowa = new PriorityQueue<Pracownik>();


        // Dodawanie do listy priorytetowej

        PracownicyKolejkaPriorytetowa.add(new Pracownik("Janusz", "Malinowski", "Senior Java developer", 23000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Alicja", "Wirska", "Java developer", 14000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Monika", "Malotka","Prezes", 50000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Adam", "Czeriński","Prezes", 50000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Michał", "Przybylski", "Java developer", 12500 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Jakub", "Nowakowski", "Java developer", 12000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Franciszek", "Kowal", "Java developer", 10000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Renata", "Gara","Junior Java developer", 5000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Hans", "Miller", "Właściciel", 100000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Anna", "Kowalska","Project manager", 35000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Maciej", "Nowak", "Senior Java developer", 25000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Wiktor", "Wiktorszewski", "Junior Java developer", 6000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Dawid", "Mławicki","Junior Java developer", 3700 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Wojciech","Kopytko", "Junior Java developer", 4000 ));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Krzysztof","Bury", "Prezes", 50000));
        PracownicyKolejkaPriorytetowa.add(new Pracownik("Paulina", "Małachowska","Prezes", 50000));




        // Menu switch
        System.out.println("Wybierz co chcesz robić: ");
        System.out.println("1. Dodać do kolejki pracownika");
        System.out.println("2. Zobaczyć rozmiar kolejki");
        System.out.println("3. Usunąc pracownika z najwyższym priorytetem");
        System.out.println("4. Wyświetlenie kolejki priorytetowej");
        System.out.println("5. Wyjście");


        // Wczytywanie z klawiatury
        Scanner scanner = new Scanner(System.in);


        // Instrukcja sterująca switch
        // pętlą nieskońcozną while(true)
        // etykietą "pętla" by zakończyć działanie
        pętla:     while (true) {

            int wybór = scanner.nextInt();
            switch (wybór) {
                case 1:
                     dodajDoKolejki(PracownicyKolejkaPriorytetowa);
                    break;

                case 2:
                    System.out.println(PracownicyKolejkaPriorytetowa.size());
                    break;
                case 3:
                    PracownicyKolejkaPriorytetowa.remove();
                    System.out.println("Usunięto pierwszego");
                    break;
                case 4:
                    System.out.println(PracownicyKolejkaPriorytetowa);
                    break;
                case 5:
                    System.out.println("Do widzenia");
                    break pętla;
            }

        }

               //  Czyszczenie kolejki

        System.out.println(" ");
        System.out.println("W kolejce pozostali a następnie zostali usunięci:");
        while (!PracownicyKolejkaPriorytetowa.isEmpty()) {
            System.out.println(PracownicyKolejkaPriorytetowa.remove());
        }



    }




    public static void dodajDoKolejki(PriorityQueue<Pracownik> kolejka ) {
        System.out.println("Podaj imię nowego pracownika");
        Scanner sc1 = new Scanner(System.in);
        String imie = sc1.nextLine();

        System.out.println("Podaj nazwisko nowego pracownika");
        Scanner sc2 = new Scanner(System.in);
        String nazwisko = sc2.nextLine();

        System.out.println("Podaj stanowisko nowego pracownika");
        Scanner sc3 = new Scanner(System.in);
        String stanowskio = sc3.nextLine();

        System.out.println("Podaj pensję nowego pracownika");
        Scanner sc4 = new Scanner(System.in);
        int pensja = sc4.nextInt();

        kolejka.add(new Pracownik(imie, nazwisko, stanowskio, pensja));
        System.out.println("Dodano " + imie + " " + nazwisko + " " + stanowskio + " " + pensja);
    }


}
