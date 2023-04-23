package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	Stanza st=new Stanza("st");
	Attrezzo attrezzo= new Attrezzo("osso", 42);

	@Test
	public void testGetStanzaAdiacente() {
		assertNull(this.st.getStanzaAdiacente("nord"));
		Stanza altraStanza = new Stanza("Altra stanza di prova");
		this.st.impostaStanzaAdiacente("nord", altraStanza);
		assertEquals(altraStanza, this.st.getStanzaAdiacente("nord"));
	}

	@Test
	public void testHasAttrezzo() {
		assertNotNull(st.hasAttrezzo(null));
	}

	@Test
	public void testImpostaStanzaAdiacente() {
		Stanza altraStanza = new Stanza("Altra stanza di prova");
		this.st.impostaStanzaAdiacente("nord", altraStanza);
		assertEquals(altraStanza, this.st.getStanzaAdiacente("nord"));
	}

	@Test
	public void removeAttrezzo() {
		assertNotNull(st.getAttrezzi());
	}

	@Test
	public void testGetNome() {
		assertEquals(this.st.getNome(),st.getNome());
	}
	
}
