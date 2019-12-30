package Interfejsy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Nowa {
	
private static void drukuj(Object t) {
	String klasa = t.getClass().getName();
	if (klasa.endsWith("String"))
		System.out.printf("%10s",t);
	else if(klasa.endsWith("Integer"))
		System.out.printf("%10d",t);
	else if (klasa.endsWith("Double"))
		System.out.printf("%10.2f",t);
	} 
	
private static Random generator = new Random();
	
	public static double generuj() {
		return generator.nextInt(100);
	}
	
	public static Object zwróæ(Object t) {
		String klasa = t.getClass().getName();
		if (klasa.endsWith("Integer"))
			return (Object)(generator.nextInt((int)t));
		else if (klasa.endsWith("Double")) {
			return (Object)(generator.nextDouble()*(double)t);
		};
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Double>listaD = new ArrayList<Double>();
		List <Integer>listaI = new ArrayList<Integer>();
		List <Student>listaStud = new ArrayList<Student>();
		
		InterDruk<Object> x = Nowa::drukuj;	
		
		List listaNap = Arrays.asList(237,"Alicja",23,"Urszula",45.7,"Jan");		
		listaNap.forEach(element -> drukuj(element));
		
		Consumer<Object> konsument= Nowa::drukuj;
//		listaNap.forEach(konsument);
		
		Supplier<Double> dostawca1 = Nowa::generuj;
		InnyInt dostawca2 = Nowa::zwróæ;
		
		
		/*
		for(int i=0; i<listaNap.size();i++)
			konsument.accept(listaNap.get(i));
		 */
		
		
		System.out.println("\nWersja I: -------------->");
		for(int i=0;i<5;i++) {
			listaD.add(dostawca1.get());
			listaD.forEach(konsument);
			listaD.clear();
		}
		
		for(int i=0;i<5;i++)
		listaD.add((Double)dostawca2.zwróæ(34.1));
		System.out.println("\nWersja II: -------------->");
		listaD.forEach(konsument);
		for(int i=0; i<5; i++)
		listaI.add((Integer)dostawca2.zwróæ(34));
		System.out.println("\nWersja III: -------------->");
		listaI.forEach(konsument);
		
		System.out.println(" ");
		System.out.println("\n------------------------------------------------------");
		Supplier<Student> dostawca = Student::new;
		for(int i=0; i<5;i++)
			listaStud.add(dostawca.get());
			listaStud.forEach(e ->System.out.println(e));}
		
}
