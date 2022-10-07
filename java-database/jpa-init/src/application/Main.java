package application;

import domain.Person;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person(1, "Fulano Sousa", "ful@gmail.com");
		Person person2 = new Person(2, "Beltrano Silva", "bel@gmail.com");
		Person person3 = new Person(3, "Ciclano Lopes", "cic@gmail.com");
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
