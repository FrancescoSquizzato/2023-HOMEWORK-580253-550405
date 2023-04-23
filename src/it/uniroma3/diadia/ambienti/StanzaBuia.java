package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {

	private  String attrezzoLucente;
	
	public StanzaBuia(String nome , String attrezzoLucente) {
		super(nome);
		this.attrezzoLucente = attrezzoLucente;
	}

	@Override
	public String getDescrizione() {
		String buio = new String();
		buio = "Dov'è la luce? Non vedo nulla!";
		if(!this.hasAttrezzo(attrezzoLucente))
			return buio;
		return super.getDescrizione();
	}
}
