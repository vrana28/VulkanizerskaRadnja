package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest {

	protected Radnja radnja;
	

	@Test
	void testDodajGumu() {
		AutoGuma a = new AutoGuma("Audi",15,140,30);
		a.setMarkaModela("Audi");
		a.setPrecnik(15);
		a.setSirina(140);
		a.setVisina(30);
		
		radnja.dodajGumu(a);
		
		assertEquals(a, radnja.pronadjiGumu("").get(0));
		
	}
	
	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class, 
				()->radnja.dodajGumu(null));
		
	}
	
	@Test
	void testDodajGumuDuplikat() {
		
		AutoGuma a = new AutoGuma("Audi",15,140,30);
		a.setMarkaModela("Audi");
		a.setPrecnik(15);
		a.setSirina(140);
		a.setVisina(30);
		
		AutoGuma a2 = new AutoGuma("Audi",15,140,30);
		a2.setMarkaModela("Audi");
		a2.setPrecnik(15);
		a2.setSirina(140);
		a2.setVisina(30);
		
		radnja.dodajGumu(a);
		
		RuntimeException e = assertThrows(java.lang.RuntimeException.class, 
				()->radnja.dodajGumu(a2));
		assertEquals("Guma vec postoji", e.getMessage());
	}

	@Test
	void testPronadjiGumuNull() {
		assertThrows(java.lang.NullPointerException.class, 
				()->radnja.pronadjiGumu(null));
	}
	
	@Test
	void testPronadjiGumu() {
		
		AutoGuma a = new AutoGuma("Audi",15,140,30);
		a.setMarkaModela("Audi");
		a.setPrecnik(15);
		a.setSirina(140);
		a.setVisina(30);
		
		AutoGuma a2 = new AutoGuma("Audi",15,140,30);
		a2.setMarkaModela("Bmv");
		a2.setPrecnik(16);
		a2.setSirina(141);
		a2.setVisina(31);
		
		AutoGuma a3 = new AutoGuma("Audi",15,140,30);
		a3.setMarkaModela("Audi");
		a3.setPrecnik(17);
		a3.setSirina(142);
		a3.setVisina(32);
		
		radnja.dodajGumu(a);
		radnja.dodajGumu(a2);
		radnja.dodajGumu(a3);
		
		List<AutoGuma> rezultat = radnja.pronadjiGumu("dz");
		assertEquals(0, rezultat.size());
		assertFalse(rezultat.contains(a2));
	}

}
