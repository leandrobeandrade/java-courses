package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Informação do produto");
		System.out.print("Nome: ");
		product.name = scan.nextLine();
		
		System.out.print("Preço: ");
		product.price = scan.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		product.qty = scan.nextInt();
		
		System.out.println("PRODUTO: " + product);
		
		System.out.println();
		System.out.println("Entre com um número para adicionar ao estoque: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println("PRODUTO ATUALIZADO: " + product);
		
		System.out.println();
		System.out.println("Entre com um número para remover do estoque: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("PRODUTO ATUALIZADO: " + product);
		
		scan.close();
	}

}