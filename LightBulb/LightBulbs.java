import java.util.Scanner;

public class LightBulbs extends LightBulb {

        String producent = "no name";
        String Type= "Żarowa";

static LightBulbs[] kolekcja = new LightBulbs[100];
static int ilosc;

        void rozjasnij() {
        if(this.CurrentU + this.MaxU/10 <= this.MaxU) {
        this.CurrentU = this.CurrentU + this.MaxU / 10;
        if(this.Condition==false) this.Condition=true; }	}

        void przyćmij() {
        if(this.CurrentU - this.MaxU / 10 >= 0) {
        this.CurrentU = this.CurrentU - this.MaxU / 10;
        if(this.CurrentU == 0) this.Condition = false; }	}

        void drukujStan() {
        super.drukujStan();
        System.out.println("Producent: " + this.producent);
        System.out.println("Typ żarówki: " + this.Type);
        System.out.println();}

        @Override
public String toString() {
        return "Producent: " + this.producent + ", " + "typ żarówki: " + this.Type;}

public LightBulbs(String produ, String typ, int napAkt, int napMaks) {
        super(napAkt, napMaks);
        this.producent = produ;
        this.Type = typ;
        kolekcja[ilosc++] = this;}

public LightBulbs() {
        kolekcja[ilosc++] = this;}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LightBulbs z1 = new LightBulbs("prod1", "typ1", 0, 230);
    LightBulbs z2 = new LightBulbs("Philips", "Led", 40,230);
    LightBulb z3 = new LightBulbs("Philips", "Żarowa", 50, 230); 	//rzutowanie klas
    LightBulbs z4 = new LightBulbs("Osram", "Żarowa", 0, 230);
    LightBulbs z5 = new LightBulbs("Osram", "Żarowa", 230, 230);
    LightBulbs z6 = new LightBulbs("Osram", "Halogen", 0, 230);
    LightBulbs z7 = new LightBulbs("NARVA", "Led", 0, 230);
    LightBulbs z8 = new LightBulbs("Osram", "Żarowa", 40, 230);
    LightBulbs z9 = new LightBulbs("Osram", "Żarowa", 20, 230);
    LightBulbs z10 = new LightBulbs("Osram", "Żarowa", 50, 230);
    LightBulbs z11 = new LightBulbs("Osram", "Żarowa", 30, 230);
    LightBulbs z12 = new LightBulbs("Osram", "Żarowa", 0, 230);


        // Menu switch

        System.out.println("Wybierz co chcesz robiæ: ");
        System.out.println("1. Wydrukować wszystkie zarówki");
        System.out.println("2. Wydrukować wszystkie zapalone i zgaszone zarówki");
        System.out.println("3. Zapalić żarówki 1, 2 i 5");
        System.out.println("4. Zgasić zarówki 0, 3, 9, 11");
        System.out.println("5. Wydrukować charakterystykę żarówki numer 5");
        System.out.println("6. Zasić wszystkie żarówki");
        System.out.println("7. Wyjście");




        pętla:     while (true) {

            int wybór = scanner.nextInt();
            switch (wybór) {
                case 1:
                    for(int i=0; i<ilosc; i++)
                        kolekcja[i].drukujStan();
                    break;
                case 2:
                    int liczbaZapalonych=0;
                    int liczbaZgaszonych=0;
                    for(int i=0; i<ilosc; i++) {
                        if(kolekcja[i].Condition==true) liczbaZapalonych++;
                        else liczbaZgaszonych++; }
                    System.out.println("zapalonych: " + liczbaZapalonych + ", zgaszonych: " + liczbaZgaszonych);
                    break;
                case 3:
                    int [] zapalic = {1,2,5};
                    for(int i:zapalic)
                        kolekcja[i].zapal();
                    break;
                case 4:
                    int [] zgasic = {0,9,3,11};
                    for(int i:zgasic)
                        kolekcja[i].zgas();
                    break;
                case 5:
                    System.out.println(((LightBulbs)z5).toString());
                    break;
                case 6:
                    for(int i=0; i<ilosc; i++)
                        kolekcja[i].zgas();
                    break;
                case 7:
                    System.out.println("Do widzenia");
                    break pętla;
            }

        }
        }

        }
