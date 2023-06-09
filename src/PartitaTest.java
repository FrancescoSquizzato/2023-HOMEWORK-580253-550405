package it.uniroma3.diadia;
import static org.junit.Assert.*;
import org.junit.Test;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {
	Partita p=new Partita();
	Stanza s = new Stanza("Stanza");

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca",p.getLabirinto().getStanzaVincente().getNome());
	}

	@Test
	public void testVinta() {
		assertFalse(p.vinta());
	}

	@Test
	public void testIsFinita() {
		assertFalse(p.isFinita());
	}

	@Test
	public void testgetLabirinto() {
		
	}

	@Test
	public void testSetStanzaCorrente() {
		p.getLabirinto().setStanzaCorrente(s);
		assertEquals(s, p.getLabirinto().getStanzaCorrente());
	}

}
