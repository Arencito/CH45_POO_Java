package org.generation;
import org.generation.classes.Person;

public class Main {

	public static void main(String[] args) {
		Person luis = new Person("Luis Loranca", 23, "luisloranca@gmail.com", "XAXX000000","Domicilio conocido");
		
		Person juan = new Person("Juan Pablo", 40, "juanpablo@outlook.com");
		
		System.out.println(juan.toString());
		System.out.println(luis);
		
		
		
				

	}//Person

}//main
