package Okienkowa;


	public class MójWyj¹tekzm extends RuntimeException{
	static final long serialVersionUID = 10;
	double iloraz;
	double iloczyn;
	
	public MójWyj¹tekzm(float x, float y){
	super("Przekroczenie...");
	if (y==0.0)
	iloraz = Double.MAX_VALUE;
	else
	iloraz = (double) x/ (double)y;
	iloczyn = (double) x * (double)y;
	}



}
