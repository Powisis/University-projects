package Okienkowa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextField;

public class Kalkulator extends Klawiatura {

	public int pobierzCalkowita(JTextField a) {
		int argument;
		try {argument = Integer.parseInt(a.getText());}
		catch(NumberFormatException abc) {
			argument = 0;
			a.setText(abc.getMessage());}
		return argument;}
	
	
	public float pobierzRzeczywista(JTextField a) {
		float argument;
		try {argument = Float.parseFloat(a.getText());}
		catch(NumberFormatException abc) {
			argument = 0;
			a.setText(abc.getMessage());}
		return argument;}
	
	Kalkulator(){
		super();
		
		MouseMotionListener mouse = new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
					
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
		};
		
		ActionListener sluchacz = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == przycisk1) 
					dispose();
				
				else if(e.getSource() == przycisk2) {
					int a = pobierzCalkowita(poletekstowe1);
					int b = pobierzCalkowita(poletekstowe2);
					int c = a + b;
//					etykieta.setText( String.valueOf(liczba1 + liczba2) );
					
					if (!(Math.signum(a) == Math.signum(b) && Math.signum(c) != Math.signum(a)))
						etykieta.setText(c + "");
					else
					try {	throw new MójWyj¹tek(a,b);
						
					}
					
					catch (MójWyj¹tek wyj¹tek){
						etykieta.setText(wyj¹tek.getMessage() + " " +  wyj¹tek.sumad);
					}
					
				}
				
				
				else if(e.getSource() == przycisk3) {
					int a = pobierzCalkowita(poletekstowe1);
					int b = pobierzCalkowita(poletekstowe2);
					int c = a - b;
//					etykieta.setText( String.valueOf(liczba1 - liczba2) );
					if (!(Math.signum(a) == Math.signum(-b) && Math.signum(c) != Math.signum(a)))
						etykieta.setText(c + "");
					else
					try {	throw new MójWyj¹tek(a,b);
						
					}
					
					catch (MójWyj¹tek wyj¹tek){
						etykieta.setText(wyj¹tek.getMessage() + " " +  wyj¹tek.roznicad);
					}
	
				}
				
				else if(e.getSource() == przycisk4) {
					float liczba1 = pobierzRzeczywista(poletekstowe1);
					float liczba2 = pobierzRzeczywista(poletekstowe2);
					float iloraz = liczba1/liczba2;
//					etykieta.setText( String.valueOf(liczba1 / liczba2) );
				
					if(Float.isInfinite(iloraz)){
					try{throw new MójWyj¹tekzm(liczba1,liczba2);}
					catch(MójWyj¹tekzm obiektwyj¹tku){
					System.out.println(obiektwyj¹tku.toString());
					etykieta.setText("B³¹d obs³u¿ony, iloraz = "+ obiektwyj¹tku.iloraz);
					}
					}
					else
						etykieta.setText("iloraz= " +iloraz);
				
				
				}

			
				else if(e.getSource() == przycisk5) {
					float a = pobierzRzeczywista(poletekstowe1);
					float b = pobierzRzeczywista(poletekstowe2);
					float c = a*b;
//					etykieta.setText( String.valueOf(liczba1 * liczba2) );
					
					if(Float.isInfinite(c)){
					try{throw new MójWyj¹tekzm(a,b);}
					catch(MójWyj¹tekzm obiektwyj¹tku){
					System.out.println(obiektwyj¹tku.toString());
					etykieta.setText("B³¹d obs³u¿ony, iloczny = "+ obiektwyj¹tku.iloczyn);
					}
					}
					else
						etykieta.setText("iloczyn= " +c);
					
				
				
				}
			}
		};
		
		this.przycisk1.addActionListener(sluchacz);
		this.przycisk2.addActionListener(sluchacz);
		this.przycisk3.addActionListener(sluchacz);
		this.przycisk4.addActionListener(sluchacz);
		this.przycisk5.addActionListener(sluchacz);
	}
	
	public static void main(String[] args) {
		
		Kalkulator kal = new Kalkulator();

	}

}

