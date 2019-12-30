package Interfejsy;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;



public class InterfejsKolejkiClass {
    static Comparator <String> komparator = new Comparator<String>() {
    	Collator c = Collator.getInstance(new Locale("pl", "PL"));
    	@Override
    	public int compare(String s1, String s2) {
    	return c.compare(s1, s2);
    	}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfejsKolejki<Student> kolejka = new InterfejsKolejki<Student>(){
		public ArrayList <Student> aL = new ArrayList <Student>();
		
		public boolean dodajDoKolejki(Student x) {
			return aL.add(x);
		}
		
		
		public boolean dodajDoListy (Student x) {
			for(Student st : aL) {
			if((komparator.compare(x.nazwisko, st.nazwisko) == -1) || (x.nazwisko.equals(st.nazwisko) && (komparator.compare(x.imie, st.imie) == -1))) {
					aL.add(aL.indexOf(st),x);
					return false;
				}
			
			}
			return aL.add(x);
		}
		
		public Student pobierzKolejnego(){
		return aL.remove(0);
		}
		
		public boolean czyPusta() {
		return aL.isEmpty();
		}
		
		public int rozmiar() {
		return aL.size();
		}
		
		public int wystêpuje(Student x) {
		return 0;
		}
		
		public boolean Testy(Student x) {
			if(aL.size()==0) {
				aL.add(x);
				return true;
			}
			
			for(Student st : aL) {
				if(st.nazwisko.equals(x.nazwisko) && st.imie.equals(x.imie))
					return false;
			}
				aL.add(x);
			return true;
		}
		

		public void wydrukujWszystkich() {
			for(Student st: aL){
				System.out.println("Student: "+ st +" ");
			}
		}
		
		public void wydrukujWybranych(int[] x) {
			for(int i: x){
				System.out.println("Student \n"+aL.get(i)+"\n");
			}
		}

		@Override
		public ArrayList<Student> zwróæListê() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
		
			
		
		};
		

		kolejka.dodajDoKolejki(new Student("Marek", "Kowlaski", "Elektryczny", "1998-11-11", 3.77));
		kolejka.dodajDoKolejki(new Student("Piotr", "Kowal", "Mechaniczny", "1999-12-12", 5.00));
		kolejka.dodajDoKolejki(new Student("Robert", "Micha³owski", "Nawigacyjny", "1997-12-12", 5.00));
		kolejka.dodajDoKolejki(new Student("Janusz", "Antkiewicz", "Mechaniczny", "1998-08-11", 4.19));
		kolejka.dodajDoKolejki(new Student("Stanis³aw", "Antczak", "Mechaniczny", "1998-01-11", 4.13));
		
    	//System.out.println(studenci.get(0).okreslWiek());
    	

    	
//    	System.out.println(kolejka.rozmiar());   	
//    	System.out.println(kolejka.pobierzKolejnego());
    	Student Robert = new Student("Robert", "Micha³owski", "Nawigacyjny", "1997-12-12", 5.00);
    	Student Jan = new Student("Jan", "Nowak", "Mechaniczny", "1995-05-03", 4.55);
		Student Bartosz = new Student ("Bartosz", "Malnowski", "Nawigacyjny", "1998-06-07", 2.13);
		Student Zbyszek = new Student ("Zbyszek", "Zamachowksi", "Elektryczny", "1998-10-10", 4.37);
		Student Adam = new Student ("Adamek", "Alkowski", "Elektryczny", "1998-10-10", 4.33);

		
		//Zadanie 4
//    	System.out.println("Zadanie 4 " + kolejka.Testy(Robert));
    	
    	//Zadanie 6
    	 	
    	int[] X = {0,1,2};
//   	kolejka.wydrukujWybranych(X);
    	
    	//Zadanie7
//    	kolejka.wydrukujWszystkich();
    	
    	//inna wersja
    	
    	kolejka.dodajDoListy(Zbyszek);
    	kolejka.dodajDoListy(Adam);
    	kolejka.wydrukujWszystkich();

	}


}
