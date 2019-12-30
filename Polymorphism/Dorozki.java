
public class Dorozki extends Pojazdy{
	
	String Typ="dwukonne";
	int liczbaKol = 4;
	String Marka="Drewniak";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przeglądu dorozki:");
	System.out.println("Wymień lejce");
	System.out.println("Wymień lozyska w kolach");
	System.out.println("Sprawdź dyszel");
	System.out.println("Wymień drewniane deski");
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
    	return   "\nSuper: " + getClass().getGenericSuperclass().getTypeName()+ ", klasa: "+ getClass().getTypeName()  +", Typ: " + Typ + ", marka: "+ Marka +", liczba kół: " + liczbaKol;
    }
}
