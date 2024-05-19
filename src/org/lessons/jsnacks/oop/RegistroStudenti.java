package org.lessons.jsnacks.oop;

/*Utilizza un array privato per memorizzare oggetti Studente. V
*Implementa un costruttore senza parametri per inizializzare il registro vuoto V
*e un metodo pubblico per aggiungere studenti al registro. V
*Aggiungi un metodo che stampi la lista degli studenti. V
*/

public class RegistroStudenti {
	
	private Studente [] studenti; //creazione array privato 
	
	private int contatore; //posizione dentro l'array
	
	public RegistroStudenti() {
		this.studenti = new Studente[5]; //costruttore con indicazione n° max studenti nell'array
		this.contatore = 0; //posizione inizializzata a 0
	}
	
	public void aggiungiStudente(Studente input) {
		if (contatore < studenti.length) {
            studenti[contatore] = input;  // Aggiunge lo studente alla posizione libera
            contatore++;  // Incrementa il contatore
        } else {
            System.out.println("Il registro è pieno.");
        }  
	}
	
	public void stampaRegistro() {
	    for (int i = 0; i < contatore; i++) {
	        System.out.println(studenti[i].toString());
	    }
	}
	
	
	
}
