package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Main {

	public static void main(String[] args) {
		
//		Person person1 = new Person(null, "Fulano Sousa", "ful@gmail.com");
//		Person person2 = new Person(null, "Beltrano Silva", "bel@gmail.com");
//		Person person3 = new Person(null, "Ciclano Lopes", "cic@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		em.persist(person1);
//		em.persist(person2);
//		em.persist(person3);
//		em.getTransaction().commit();
		
//		System.out.println("CADASTRADO");
		
		Person p = em.find(Person.class, 2);
//		System.out.println(p);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("REMOVIDO");
		
		em.close();
		emf.close();
	}

}
