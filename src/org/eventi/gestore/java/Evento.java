package org.eventi.gestore.java;

import java.time.LocalDate;


public class Evento {
	
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	
	
	//getter e setter
	public String getTitolo() {
		return this.titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	public LocalDate getData() {
		return data;
	}




	public void setData(LocalDate data) {
		this.data=data;
		if(data.isBefore(LocalDate.now())){
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

 Evento(String titolo, LocalDate data, int postiTotali, int postiPrenotati){
	this.titolo=titolo;
	this.data=data;
	this.postiTotali=postiTotali;
	this.postiPrenotati=0;
	
	if(postiTotali<1) {
		System.out.println("L'evento deve avere almeno un posto disponibile");
	}
 }

	public void prenota() {
		if(postiPrenotati>postiTotali) {
			System.out.println("I posti che vuoi prenotare sono più dei posti disponibili");
			
		}else if(data.isBefore(LocalDate.now())){
			System.out.println("Non puoi prenotare un evento già passato");
		}else {
			postiPrenotati++;
		}
	}
	
	
	public void disdici() {
		
			postiPrenotati--;
		}
	
	
	public String toString() {
		return data+" - "+titolo;
	}
}
