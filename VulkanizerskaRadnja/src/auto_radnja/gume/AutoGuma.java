package auto_radnja.gume;
/**
 * Klasa auto guma, koja ima markaModela, precnik, sirina, visina
 * 
 * @author DzoleDzavol
 * @version 1.0
 */
public class AutoGuma {
	/**
	 *Marka modela kao string 
	 */
	private String markaModel = null;
	/**
	 * Precnik kao int vrednost
	 */
	private int precnik = -1;
	/**
	 * Sirina kao int vrednost
	 */
	private int sirina = -1;
	/**
	 * Visina kao int vrednost
	 */
	private int visina =-1;
	/**
	 * Konstruktor koji inicilajizuje objekat
	 */
	public AutoGuma() {
		
	}
/**
 * Konstruktor koji inicijalizuje objekar i postavlja vrednosti
 * 
 * @param markaModela - markaModela kao string
 * @param precnik kao int
 * @param sirina kao int
 * @param visina kao int
 */
	public AutoGuma(String markaModela, int precnik, int sirina, int visina) {
		super();
		this.markaModel = markaModela;
		this.precnik = precnik;
		this.sirina = sirina;
		this.visina = visina;
	}

	/**
	 * Vraca marku modela
	 * @return vraca string 
	 */
	public String getMarkaModela() {
		return markaModel;
	}
	/**
	 * Postavlja atribut markaModel na novu vrednost
	 * @param markaModela za auto gumu
	 */
	public void setMarkaModela(String markaModela) {
		if(markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
		
		this.markaModel = markaModela;
	}

	/**
	 * Vraca precnik auto gume
	 * @return vreca int precnik
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja atribut precnik na neku novu vrednost
	 * @param precnik auto gume
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Vraca sirinu gume
	 * @return vraca sirinu auto gume
	 */
	public int getSirina() {		
		return sirina;
	}
	
	/**
	 * Postavlja vrednost atributa sirina na neku novu vrednost
	 * @param sirina auto gume
	 */

	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Vraca visinu gume
	 * @return vraca visinu gume
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja atribut visina na neku novu vrednost
	 * @param visina auto gume
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * Vraca informacije za auto gumu
	 */
	
	@Override public String toString() {
		return"AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina=" + visina + "]";
		}

	/**
	 * Provera da li su 2 auto gume iste, u tom slucaju vraca true, drugacije false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
	
	
}
