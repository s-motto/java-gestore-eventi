package org.eventi.gestore.java;



import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inizializzo lo scanner
		Scanner in= new Scanner(System.in);
		
		//titolo evento
		System.out.println("Titolo dell'evento:");
		String titolo= in.nextLine();
		
		//data evento
		System.out.println("Data dell'evento (dd/MM/yyyy):");
		String data= in.nextLine();
		
		//formattazione data
		LocalDate dataFormattata= LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//controllo che la data non sia già passata
		if(dataFormattata.isBefore(LocalDate.now())) {
			
			System.out.println("Mi dispiace, la data scelta è già passata.");
		  
		}else {
		
		
		//chiedo il numero di posti disponibili
		System.out.println("Posti totali:");
		int postiTotali= in.nextInt();
		
		//controllo che i posti disponibili non siano meno di uno
		if(postiTotali<=0) {
			System.out.println("L'evento deve avere almeno un posto disponibile!");
		
		}
		
		//creo l'evento
		Evento nuovoEvento= new Evento(titolo, dataFormattata, postiTotali, 0);
		
		System.out.println("Quanti posti vuoi prenotare?");
		int numeroPrenotazioni= in.nextInt();
		//controllo che il numero non superi quello dei posto disponibili
		if(numeroPrenotazioni>postiTotali) {
			System.out.println("Non puoi prenotare più posti di quelli disponibili");
		}else if(numeroPrenotazioni<1) {
			//controllo che il numero non sia minore di uno
			System.out.println("Devi prenotare almeno un posto");
		}else {
			//aggiungo i posti prenotati 
			for(int i=0; i<numeroPrenotazioni;i++) {
				nuovoEvento.prenota();	
				
				System.out.println("Posti prenotati: "+nuovoEvento.getPostiPrenotati() +"/"+postiTotali);
				System.out.println("Posti ancora disponibili:" + (postiTotali - nuovoEvento.getPostiPrenotati()));
			}
		
		
		//chiedo se si vogliono disdire dei posti
		System.out.println("Vuoi disdire delle prenotazioni? Si:1/No:2");
		int disdette=in.nextInt();
		
		
		switch(disdette){
		
		case 1:
			System.out.println("Quanti posti vuoi disdire?");
			int numeroDiDisdette=in.nextInt();
			
			//controllo che il numero di disdette non sia superiore al numero di prenotazioni e che non sia inferiore a 1
			if(numeroDiDisdette>numeroPrenotazioni) {
				System.out.println("Non puoi disdire più posti di quelli che hai prenotato!");
			}else if (numeroDiDisdette<1){
				System.out.println("Non hai disdetto nessun posto");
			}else {
				for(int i=0; i<numeroDiDisdette;i++) {
					nuovoEvento.disdici();
					
					System.out.println("Posti prenotati: "+nuovoEvento.getPostiPrenotati()+"/"+postiTotali);
					System.out.println("Posti ancora disponibili:" + (postiTotali - nuovoEvento.getPostiPrenotati()));
				}
			}
		case 2:
			break;
		}
		
		}
		
		}
	}
}

		
		
		


