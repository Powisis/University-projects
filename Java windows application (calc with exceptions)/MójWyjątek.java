package Okienkowa;

public class M�jWyj�tek extends RuntimeException{
	static final long serialVersionUID = 1;
	int suma;
	int roznica;
	long sumad;
	long roznicad;
	
	public M�jWyj�tek(short x, short y) {
		super("Przekroczenie zakresu typu short");
		suma = (int) x + (int)y;
		roznica = (int) x - (int)y;
		
	}
	
	public M�jWyj�tek(int x, int y) {
		super("Przekroczenie zakresu typu int");
		sumad =(long) x + (long)y;
		roznicad = (long) x - (long)y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}