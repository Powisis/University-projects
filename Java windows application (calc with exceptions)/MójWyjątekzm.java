package Okienkowa;


	public class M�jWyj�tekzm extends RuntimeException{
	static final long serialVersionUID = 10;
	double iloraz;
	double iloczyn;
	
	public M�jWyj�tekzm(float x, float y){
	super("Przekroczenie...");
	if (y==0.0)
	iloraz = Double.MAX_VALUE;
	else
	iloraz = (double) x/ (double)y;
	iloczyn = (double) x * (double)y;
	}



}
