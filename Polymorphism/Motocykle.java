
public class Motocykle extends Pojazdy{

	String Typ="Sportowe";
	int liczbaKol = 2;
	String Marka="Kawasaki";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl¹du motocykla:");
	System.out.println("Wymieñ olej w silniku");
	System.out.println("Wymieñ przednie lagi");
	System.out.println("SprawdŸ ³o¿ysko g³ówki ramy");
	
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
