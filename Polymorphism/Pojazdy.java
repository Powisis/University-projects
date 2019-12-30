
public class Pojazdy {
	String Typ;
	int liczbaKol;
	String Marka;

	public void PrzegladPojazdu() {
		System.out.println("Specyfikacja przegl¹du pojazdu");
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
