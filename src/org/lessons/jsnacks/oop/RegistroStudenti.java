package org.lessons.jsnacks.oop;

/*Utilizza un array privato per memorizzare oggetti Studente. V
*Implementa un costruttore senza parametri per inizializzare il registro vuoto V
*e un metodo pubblico per aggiungere studenti al registro.
*Aggiungi un metodo che stampi la lista degli studenti.
*/

public class RegistroStudenti {
	
	private Studente [] studenti; //creazione array privato 
	
	public RegistroStudenti() {
		this.studenti = new Studente[10]; //costruttore con indicazione n° max studenti nell'array
	}
	
	
	
	
}
