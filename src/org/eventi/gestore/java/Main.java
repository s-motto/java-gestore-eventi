package org.eventi.gestore.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		
		//eventi
		Evento greenDay= new Evento("American Idiot", "19/05/2024",200,2);
		
		//data corrente
		Date dataOdierna= new Date();
		//System.out.println(dataOdierna);
		//scanner
		Scanner in= new Scanner(System.in);
		
		//trasformo l'input dell'utente in un formato Data
		DateFormat formatoData= new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Inserisci la data (dd/MM/yyyy)");
		String dataScelta=in.nextLine();
		
		Date dataFormattata= formatoData.parse(dataScelta);
		
		//comparazione date
		dataOdierna.compareTo(dataFormattata);
		
		if(dataOdierna.after(dataFormattata)) {
			System.out.println("Mi dispiace, questo evento è già passato.");
		}
		
		System.out.println("Titolo dell'evento:");
		String titoloEvento= in.nextLine();
		
		System.out.println(dataFormattata+" - "+titoloEvento);
		System.out.println("Quanti posti vuoi prenotare?");
		int prenotazione= in.nextInt();
		
		System.out.println("Posti prenotati: "+ prenotazione+"/100");
		
		System.out.println("Vuoi disdire delle prenotazioni?");
		String siOno= in.nextLine();
		
		if(siOno=="si") {
			System.out.println("Quante prenotazioni vuoi disdire?");
			int disdette=in.nextInt();
			if(disdette>prenotazione) {
				System.out.println("Non puoi disdire più posti di quelli che hai prenotato!");
			}else {
				int prenotazioneDefinitiva=prenotazione-disdette;
				System.out.println("Posti prenotati: "+prenotazioneDefinitiva+"/100");
			}
		}
	}
		
	}

		//System.out.println(greenDay.toString());
		
		


