package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Labirinto labirinto;
	private boolean finita;
	private Giocatore giocatore;


	public Partita(){
		labirinto=new Labirinto();
		giocatore=new Giocatore();
		labirinto.creaStanze();
		this.finita=false;
	}

	/**
	 * Ritorna il labirinto
	 * @return
	 */
	/*METODO*/
	public Labirinto getLabirinto() {
		return labirinto;
	}

	/**
	 * Imposta il labirinto passato come parametro
	 * @param labirinto
	 */
	/*METODO*/
	public void setLabirinto(Labirinto labirinto) {
		this.labirinto=labirinto;
	}

	/**
	 * Ritorna il giocatore della partita
	 * @return
	 */
	/*METODO*/
	public Giocatore getGiocatore() {
		return giocatore;
	}

	/**
	 * Imposta il giocatore della partita
	 * @param giocatore
	 */
	/*METODO*/
	public void setGiocatore(Giocatore giocatore) {
		this.giocatore=giocatore;
	}
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	/*METODO TESTATO*/
	public boolean vinta() {
		return labirinto.getStanzaCorrente()== labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	/*METODO TESTATO*/
	public boolean isFinita() {
		return finita || vinta() || (this.getGiocatore().getCfu()==0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	/*METODO*/
	public void setFinita() {
		this.finita = true;
	}


}
