package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {

	AutoGuma a;
	@BeforeEach
	void setUp() throws Exception {
		a = new AutoGuma("Guma",15,155,50);
	}

	@AfterEach
	void tearDown() throws Exception {
		a= null;
	}

	@Test
	void testAutoGuma() {
		assertNotNull(a);
	}

	@Test
	void testAutoGumaStringIntIntInt() {
		a = new AutoGuma("Guma",15,155,50);
		
		assertNotNull(a);
		assertEquals("Guma", a.getMarkaModela());
		assertEquals(15, a.getPrecnik());
		assertEquals(155, a.getSirina());
		assertEquals(50, a.getVisina());
		
	}

	
	@Test
	void testSetMarkaModela() {
		a.setMarkaModela("Guma");
		assertEquals("Guma", a.getMarkaModela());
	}
	
	@Test
	void testSetMarkaModelaNull() {
		a.setMarkaModela(null);
		assertThrows(java.lang.NullPointerException.class,
				()->a.setMarkaModela(null));
	}
	
	@Test
	void testSetMarkaModelaKratakString() {
		a.setMarkaModela("T");
		assertThrows(java.lang.RuntimeException.class,
				()->a.setMarkaModela("T"));
	}

	@Test
	void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}
	
	
	@ParameterizedTest
	@CsvSource({
		"21,true",
		"11,false",
		"55,false"
	})
	void testSetPrecnikOpseg(int precnik, boolean eq) {
		a.setPrecnik(precnik);
		assertEquals(precnik, a.getPrecnik());
	}

	@Test
	void testSetSirina() {
		a.setSirina(155);
		assertEquals(155, a.getSirina());
	}
	
	@ParameterizedTest
	@CsvSource({
		"222,true",
		"21,false",
		"555,false"
	})
	void testSetSirinaOpseg(int sirina, boolean eq) {
		a.setSirina(sirina);
		assertEquals(sirina, a.getSirina());
	}

	@Test
	void testSetVisina() {
		a.setVisina(55);
		assertEquals(55, a.getVisina());
	}


	@ParameterizedTest
	@CsvSource({
		"32,true",
		"55,false",
		"65,false"
	})
	void testSetVisinaOpseg(int visina, boolean eq) {
		a.setVisina(visina);
		assertEquals(visina, a.getVisina());
	}
	
	@Test
	void testToString() {
		a.setMarkaModela("Guma");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		
		String s  = a.toString();
		
		assertTrue(s.contains("Guma"));
		assertTrue(s.contains("15"));
		assertTrue(s.contains("155"));
		assertTrue(s.contains("55"));
	}

	@ParameterizedTest
	@CsvSource({
		"Guma1,15,155,55,Guma1,15,155,55,true",
		"Guma2,15,155,55,Guma3,12,333,45,false"
	})
	void testEqualsObject(String guma1, int preznik1, int sirina1, int visina1, String guma2, int precnik2, int sirina2, int visina2, boolean eq) {
		a.setMarkaModela(guma1);
		a.setPrecnik(preznik1);
		a.setSirina(sirina1);
		a.setVisina(visina1);
		
		AutoGuma b = new AutoGuma(guma2,precnik2,sirina2,visina2);
		b.setMarkaModela(guma2);
		b.setPrecnik(precnik2);
		b.setSirina(sirina2);
		b.setVisina(visina2);
		
		assertEquals(eq, a.equals(b));
	}

}
