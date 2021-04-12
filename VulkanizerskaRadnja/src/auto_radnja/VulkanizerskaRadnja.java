package auto_radnja;

import java.util.LinkedList;

import auto_radnja.gume.AutoGuma;

/**
 * Klasa koja implementira interfejs Radnja i ima atribut gume (LinkedList)
 * 
 * @author DzoleDzavol
 * @version 1.0
 */

public class VulkanizerskaRadnja implements Radnja {

	/**
	 * lista svih guma, atribut koji predstavlja stanje svih guma u vulkanizerskoj radnji
	 * u njoj se implementiraju metode koje ubacuju novu gumu i vrse pretragu na osnovu marke modela
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	@Override
	public void dodajGumu(AutoGuma a) {
		if (a == null)throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.add(a);
		
	}

	@Override
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == "")
			return gume;
		if(markaModel==null)
			throw new NullPointerException();
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++) {
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		}
		return novaLista;
	}

}
