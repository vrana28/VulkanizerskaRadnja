package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest {

	protected Radnja radnja;

	@Test
	void testDodajGumu() {
		AutoGuma a =new AutoGuma();
		a.setMarkaModela("Guma 1");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		
		radnja.dodajGumu(a);
		

		
	}

	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class,
				()-> radnja.dodajGumu(null));
		
	}
	
	@Test
	void testDodajGumuDuplikat() {
		AutoGuma a =new AutoGuma();
		a.setMarkaModela("Guma 1");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		
		radnja.dodajGumu(a);
		
		AutoGuma b =new AutoGuma();
		b.setMarkaModela("Guma 1");
		b.setPrecnik(15);
		b.setSirina(155);
		b.setVisina(55);
		
		RuntimeException e = assertThrows(java.lang.RuntimeException.class,
				()-> radnja.dodajGumu(b));
		assertEquals("Ovakva  guma vec postoji", e.getMessage());
		

		
	}
	
	@Test
	void testPronadjiGumuNull() {
		assertThrows(java.lang.NullPointerException.class,
				()-> radnja.pronadjiGumu(null));
		
	}

}
