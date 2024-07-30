package org.eventi.gestore.java;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	private LocalTime ora;
	private float prezzo;
	
	
	
	
	
	
	public LocalTime getOra() {
		return ora;
	}






	public void setOra(LocalTime ora) {
		this.ora = ora;
	}






	public float getPrezzo() {
		return prezzo;
	}






	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}


  
   LocalTime orario= LocalTime.now();
  


	public Concerto(String titolo,LocalDate data, int postiTotali, int postiPrenotati, LocalTime ora, float prezzo){
		super(titolo, data, postiTotali, postiPrenotati);
		this.ora=orario;
		this.prezzo=prezzo;
	}
	
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH.mm");
	String oraFormattata= orario.format(formatter);
	
	@Override
	public String toString() {
		return this.getData()+", "+ oraFormattata+" - "+ this.getTitolo()+" - "+prezzo+" euro.";
	}
}
