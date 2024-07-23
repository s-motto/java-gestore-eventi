package org.eventi.gestore.java;

import java.util.Date;

public class Evento {
	
	private String titolo;
	private String data;
	private int postiTotali;
	private int postiPrenotati;
	
	
	
	//getter e setter
	public String getTitolo() {
		return titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	public int getPostiTotali() {
		return postiTotali;
	}





	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
	
	//costruttore

 Evento(String titolo, String data, int postiTotali, int postiPrenotati){
	this.titolo=titolo;
	this.data=data;
	this.postiTotali=postiTotali;
	this.postiPrenotati=0;
 }

	public int prenota() {
		return postiPrenotati+1;
	}
	
	public int disdici() {
		return postiPrenotati-1;
	}
	
	public String toString() {
		return data+" - "+titolo;
	}
}
