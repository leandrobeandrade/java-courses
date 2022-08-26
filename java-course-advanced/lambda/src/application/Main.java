package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// USANDO A INTERFACE
		/* list.sort(new MyComparator()); */

		// USANDO CLASSE ANÔNIMA
		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); } };
		 * 
		 * list.sort(comp);
		 */

		// USANDO EXPRESSÃO LAMBDA
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		list.sort(comp);
		
		// OU
		/*
		 * list.sort((p1, p2) ->
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		 */

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
