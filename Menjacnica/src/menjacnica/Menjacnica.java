package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	private LinkedList<Valuta> valute=new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
