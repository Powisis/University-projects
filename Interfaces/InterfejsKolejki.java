package Interfejsy;

import java.util.ArrayList;

public interface InterfejsKolejki <Typ> {
String projektowa� ="Jan Kowalski";
String data ="2019-11-02";
public boolean dodajDoKolejki (Typ x);
public Typ pobierzKolejnego();
public boolean czyPusta();
public int rozmiar();
public int wyst�puje(Typ x);
public boolean Testy(Typ x);
public void wydrukujWszystkich();
public void wydrukujWybranych(int[] x);
public ArrayList <Typ> zwr��List�();
public boolean dodajDoListy(Student x);
}