package Interfejsy;

import java.util.ArrayList;

public interface InterfejsKolejki <Typ> {
String projektowa³ ="Jan Kowalski";
String data ="2019-11-02";
public boolean dodajDoKolejki (Typ x);
public Typ pobierzKolejnego();
public boolean czyPusta();
public int rozmiar();
public int wystêpuje(Typ x);
public boolean Testy(Typ x);
public void wydrukujWszystkich();
public void wydrukujWybranych(int[] x);
public ArrayList <Typ> zwróæListê();
public boolean dodajDoListy(Student x);
}