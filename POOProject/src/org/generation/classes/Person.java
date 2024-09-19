package org.generation.classes;
public class Person {
	String name;
	int age;
	String email;
	String rfc;
	String address;
	
	
	public Person (String name, int age, String email, String rfc, String address) {
	
	
	this.name=name.toUpperCase();
	this.age=(age >=18)?age:18;
	this.email=email.toLowerCase();
	this.rfc=rfc;
	this.address=address;
  }//Constructor
	
	public Person (String name, int age, String email){
		
		this(name, age, email, "XAXX000000", "Su Casa");
	}//Cosntructor 2
	
    public Person (String name){
		
		this(name, 18, "sincorreo@domino.com" );
    }
    
    public String toString() {
    	return "name=" + this.name + ", age=" + this.age + ", email=" + this.email+ ", rfc=" + this.rfc + ", adress=" + this.address;
    	
    }//toString
	
}//class Person
