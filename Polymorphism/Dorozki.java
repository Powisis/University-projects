
public class Dorozki extends Pojazdy{
	
	String Typ="dwukonne";
	int liczbaKol = 4;
	String Marka="Drewniak";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl¹du dorozki:");
	System.out.println("Wymieñ lejce");
	System.out.println("Wymieñ lozyska w kolach");
	System.out.println("SprawdŸ dyszel");
	System.out.println("Wymieñ drewniane deski");
	
	
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
    	return   "\nSuper: " + getClass().getGenericSuperclass().getTypeName()+ ", klasa: "+ getClass().getTypeName()  +", Typ: " + Typ + ", marka: "+ Marka +", liczba kó³: " + liczbaKol;
    }
}
