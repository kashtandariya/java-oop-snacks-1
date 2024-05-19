package org.lessons.jsnacks.oop;

/*Crea una classe RegistroStudenti che rappresenti un registro di studenti.
Utilizza un array privato per memorizzare oggetti Studente.  Implementa un costruttore senza parametri per
inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti.
*/
public class Main {

    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti(); // Creazione di un nuovo registro

        Studente studente1 = new Studente("Giuseppe", "Rossi", 36); // Creazione studenti
        Studente studente2 = new Studente("Franesca", "Cominelli", 65);
        Studente studente3 = new Studente("Davide", "Bianchi", 73);
        Studente studente4 = new Studente("Giulia", "Lenzi", 32);
        Studente studente5 = new Studente("Ash", "Ketchum", 88);

        
        registro.aggiungiStudente(studente1); // Aggiunta dello studente1 al registro
        registro.aggiungiStudente(studente2); 
        registro.aggiungiStudente(studente3);
        registro.aggiungiStudente(studente4); 
        registro.aggiungiStudente(studente5); 

        registro.stampaRegistro(); // Stampa dei registri degli studenti
    }
}