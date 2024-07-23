package org.eventi.gestore.java;

public class Concerto extends Evento {

	private String ora;
	private float prezzo;
	
	
	
	
	
	
	public String getOra() {
		return ora;
	}






	public void setOra(String ora) {
		this.ora = ora;
	}






	public float getPrezzo() {
		return prezzo;
	}






	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}






	public Concerto(String titolo,String data, int postiTotali, int postiPrenotati, String ora, float prezzo){
		super(titolo, data, postiTotali, postiPrenotati);
		this.ora=ora;
		this.prezzo=prezzo;
	}
}
