
public class Dorozki extends Pojazdy{
	
	String Typ="dwukonne";
	int liczbaKol = 4;
	String Marka="Drewniak";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl�du dorozki:");
	System.out.println("Wymie� lejce");
	System.out.println("Wymie� lozyska w kolach");
	System.out.println("Sprawd� dyszel");
	System.out.println("Wymie� drewniane deski");
	
	
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
