
public class Motocykle extends Pojazdy{

	String Typ="Sportowe";
	int liczbaKol = 2;
	String Marka="Kawasaki";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl�du motocykla:");
	System.out.println("Wymie� olej w silniku");
	System.out.println("Wymie� przednie lagi");
	System.out.println("Sprawd� �o�ysko g��wki ramy");
	
}
	
	public String zwrocTyp() {
		return Typ;
	}
	
	public int zwrocLiczbeKol() {
		return liczbaKol;
	}
	
	public String zwrocMarke() {
		return Marka;
	}
	
    @Override
    public String toString() {
        return   "\nSuper: " + getClass().getGenericSuperclass().getTypeName()+ ", klasa: "+ getClass().getTypeName()  +", Typ: " + Typ + ", marka: "+ Marka +", liczba k�: " + liczbaKol;
    }
}
