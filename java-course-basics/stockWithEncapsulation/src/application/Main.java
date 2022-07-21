package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa��o do produto");
		System.out.print("Nome: ");
		String name = scan.nextLine();

		System.out.print("Pre�o: ");
		double price = scan.nextDouble();

		Product product = new Product(name, price);

		System.out.printf("Quantidade Inicial: " + product.getQty());
		System.out.println();
		System.out.println("PRODUTO: " + product);

		System.out.println();
		System.out.println("Entre com um n�mero para adicionar ao estoque: ");
		int qty = scan.nextInt();
		product.addProducts(qty);

		System.out.println("PRODUTO ATUALIZADO: " + product);

		System.out.println();
		System.out.println("Entre com um n�mero para remover do estoque: ");
		qty = scan.nextInt();
		product.removeProducts(qty);

		System.out.println("PRODUTO ATUALIZADO: " + product);

		scan.close();
	}

}