package Interfejsy;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Student {
    String imie = "Jan";
    String nazwisko = "Nowak";
    String wydzial = "PiT";
    String dataUr = "1999-12-12";
    double srednia = 3.5;
    
    int lata;
    int miesiace;
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/");
    static String data=sdf.format(new Date());
    static final int bMiesiac=Integer.parseInt(data.substring(5,7));
    static final int bRok=Integer.parseInt(data.substring(0,4));

    public Student(String imie, String nazwisko, String wydzial,
                   String dataUr, double srednia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wydzial=wydzial;
        this.dataUr=dataUr;
        this.srednia=srednia;
        studenci.add(this);}

    public Student(){studenci.add(this);}

    static ArrayList<Student> studenci = new  ArrayList<Student>();
    
    static Comparator <String> komparator = new Comparator<String>() {
    	Collator c = Collator.getInstance(new Locale("pl"
    	, "PL"));
    	@Override
    	public int compare(String s1, String s2) {
    	return c.compare(s1, s2);
    	}};

    @Override
    public String toString() {
        return  "Imiê: " + this.imie +
                " Nazwisko: " + this.nazwisko +
                " Wydzia³:  " + this.wydzial+
                " Œrednia:  " + this.srednia; }
    public String okreslWiek(){
        data=this.dataUr;
        int uRok=Integer.parseInt(data.substring(0,4));
        int uMiesiac=Integer.parseInt(data.substring(5,7));
        lata=Student.bRok-uRok;
        miesiace=Student.bMiesiac-uMiesiac;
        if(miesiace<0) {
            lata-=1;
            miesiace=12+miesiace;}
        return lata + " lat "+ miesiace + " miesiêcy";
    }
    
    
    
    public static void main(String[] args) { 
    	
    	
    	
    	
    }}
