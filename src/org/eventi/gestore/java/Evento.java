package org.eventi.gestore.java;

import java.util.Calendar;

public class Evento {
	
	private String titolo;
	private Calendar data;
	private int postiTotali;
	private int postiPrenotati;
	
	
	
	//getter e setter
	public String getTitolo() {
		return this.titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	public Calendar getData() {
		return data;
	}




	public void setData(Calendar data) {
		this.data = data;
		if(data.before(Calendar.getInstance())){
			System.out.println("La data selezionata è già passata");
		}
	}




	public int getPostiTotali() {
		return postiTotali;
	}





	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
	
	//costruttore

 Evento(String titolo, Calendar data, int postiTotali, int postiPrenotati){
	this.titolo=titolo;
	this.data=data;
	this.postiTotali=postiTotali;
	this.postiPrenotati=0;
 }

	public void prenota() {
		if(postiPrenotati>postiTotali) {
			System.out.println("I posti che vuoi prenotare sono più dei posti disponibili");
			
		}else if(data.before(Calendar.getInstance())){
			System.out.println("Non puoi prenotare un evento già passato");
		}else {
			postiPrenotati++;
		}
	}
	
	
	public void disdici(int postiDisdetti) {
		if(postiDisdetti>postiPrenotati) {
			System.out.println("Non puoi disdire più posti di quelli che hai prenotato!");
		}else {
			postiPrenotati--;
		}
	}
	
	public String toString() {
		return data+" - "+titolo;
	}
}
