public class Main {
	
	static void zrobTo (Pojazdy p) {
		

	
//	String typ = ((Pojazdy) p).zwrocTyp();
//	System.out.println ("\nTyp pojazdu " + typ);
//	int kolo = ((Pojazdy) p).zwrocLiczbeKol();
//	System.out.println ("Liczba kol w pojezdzie " + kolo);
//	String Marka = ((Pojazdy) p).zwrocMarke();
//	System.out.println ("Marka pojazdu " + Marka);
//	String aa=p.getClass().getTypeName();
//	System.out.println ("Klasa " + aa);
//	String a = p.getClass().getGenericSuperclass().getTypeName();
//	System.out.println("Super "+ a);
//	System.out.println("----------------");
	
	
	String napis = ((Pojazdy) p).toString();
	System.out.println (napis);
	p.PrzegladPojazdu();
	System.out.println("-------------------------");
	}
	 
	
    public static void main(String[] args) {
        Samochody samochod = new Samochody();
        Dorozki dorozka = new Dorozki();
        Motocykle motocykl = new Motocykle();
        
        zrobTo(samochod);
        zrobTo(dorozka);
        zrobTo(motocykl);

        //samochod.PrzegladPojazdu();
        //dorozka.PrzegladPojazdu();
        //motocykl.PrzegladPojazdu();
    }
}