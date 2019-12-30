
public class Samochody extends Pojazdy {

	String Typ="Spalinowe";
	int liczbaKol = 4;
	String Marka = "Pe¿ot";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl¹du samochodu:");
	System.out.println("Wymieñ olej w skrzyni");
	System.out.println("Wymieñ/uzupe³nij olej w silniku");
	System.out.println("SprawdŸ pasek rozrz¹du");
	System.out.println("Wymieñ klocki hamulcowe");
	System.out.println("Wyczyœæ DPF");
	
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
