package org.lessons.jsnacks.oop;

/*ripresa dall'esercizio fatto in classe con costruzione oggetto studente
 * con relativi attributi private
 * in seguito costruzione costruttore con gli attributi
 * metodo per ritornare concatenazione di string e int
 */
public class Studente {
	private String name;
	private String surname;
	private int age;
	
	public Studente(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() { //getter per LEGGERE i nostri valori
        return name;
    }
	
	public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override //override per sovrascrivere i getter di prima 
    public String toString() { //metodo toString restituiamo una stringa leggibile 
        return "Studente: " + name + " " + surname + " " + age + " anni";
    }
}