
public class Samochody extends Pojazdy {

	String Typ="Spalinowe";
	int liczbaKol = 4;
	String Marka = "Pe�ot";
	
	public void PrzegladPojazdu() {
	System.out.println("\nSpecyfikacja przegl�du samochodu:");
	System.out.println("Wymie� olej w skrzyni");
	System.out.println("Wymie�/uzupe�nij olej w silniku");
	System.out.println("Sprawd� pasek rozrz�du");
	System.out.println("Wymie� klocki hamulcowe");
	System.out.println("Wyczy�� DPF");
	
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
