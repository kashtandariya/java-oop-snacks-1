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
	
	public String studenteStringified() {
		return name + " " + surname + ", " + age + " anni";
	}
}
