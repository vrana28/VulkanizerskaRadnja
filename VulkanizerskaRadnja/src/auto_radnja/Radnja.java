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
	 * Metoda koja dodaje gumu u listu.
	 * @param a Guma koja se dodaje
	 */
	void dodajGumu(AutoGuma a);
	/**
	 * Metoda koja nalazi listu svih guma po njihovom modelu.
	 * 
	 * @param markaModel
	 * @return listu svih guma koje odgovaraju trazenom modelu
	 */
	LinkedList<AutoGuma> pronadjiGumu(String markaModel);
	
}
