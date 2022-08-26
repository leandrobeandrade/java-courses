package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// USANDO INTERFACE
		/* list.forEach(new PriceUpdate()); */
		
		// USANDO REFERENCE METHODS - ESTÁTICO
		/* list.forEach(Product::staticPriceUpdate); */
		
		// USANDO REFERENCE METHODS - NÃO ESTÁTICO
		/* list.forEach(Product::nonStaticPriceUpdate); */
		
		// USANDO LAMBDA
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		
		list.forEach(cons);
		
		list.forEach(System.out::println);
	}

}
