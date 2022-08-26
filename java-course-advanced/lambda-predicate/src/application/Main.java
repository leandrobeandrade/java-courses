package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		// USANDO CLASSE
		/* list.removeIf(new ProductPredicate()); */
		
		// USANDO LAMBDA
		list.removeIf(p -> p.getPrice() >= min);
		
		// USANDO REFERENCE METHODS - ESTÁTICO
		/* list.removeIf(Product::staticProductPredicate); */
		
		// USANDO REFERENCE METHODS - NÃO ESTÁTICO
		/* list.removeIf(Product::nonStaticProductPredicate); */

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
