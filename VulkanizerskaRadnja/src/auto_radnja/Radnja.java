package auto_radnja;

import java.util.LinkedList;

import auto_radnja.gume.AutoGuma;

/**
 * Interfejs koji ima 2 metode, dodajGumu i pronadjiGumu
 * 
 * @author DzoleDzavol
 * @version 1.0
 */

public interface Radnja {


	/**
	 * Metoda koja dodaje gumu u listu svih guma koje se odnose na vulkanizersku radnju
	 * @param a Guma klase AutoGuma
	 */
	void dodajGumu(AutoGuma a);
	/**
	 * Metoda koja nalazi listu svih guma klase AutoGuma po njihovom modelu.
	 * @param markaModel markaModela kao atribut koji ce nam pomoci da nadjemo trazene gume
	 * @return listu svih guma klase AutoGuma koje odgovaraju trazenom modelu
	 */
	LinkedList<AutoGuma> pronadjiGumu(String markaModel);
	
	
}
