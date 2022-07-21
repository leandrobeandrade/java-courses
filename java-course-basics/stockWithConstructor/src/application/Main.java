package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informação do produto");
		System.out.print("Nome: ");
		String name = scan.nextLine();

		System.out.print("Preço: ");
		double price = scan.nextDouble();

		System.out.print("Quantidade em estoque: ");
		int qty = scan.nextInt();

		Product product = new Product(name, price, qty);

		System.out.println("PRODUTO: " + product);

		System.out.println();
		System.out.println("Entre com um número para adicionar ao estoque: ");
		qty = scan.nextInt();
		product.addProducts(qty);

		System.out.println("PRODUTO ATUALIZADO: " + product);

		System.out.println();
		System.out.println("Entre com um número para remover do estoque: ");
		qty = scan.nextInt();
		product.removeProducts(qty);

		System.out.println("PRODUTO ATUALIZADO: " + product);

		scan.close();
	}

}