package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int n = scan.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Produto #" + (i + 1));
			System.out.print("Comum, usado ou importado? (c/u/i): ");
			char ch = scan.next().charAt(0);

			System.out.print("Nome: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Preço: ");
			Double price = scan.nextDouble();

			if (ch == 'c') {
				Product prod = new Product(name, price);
				list.add(prod);
			}
			if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(scan.next());
				UsedProduct uProd = new UsedProduct(name, price, date);
				list.add(uProd);
			}
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				ImportedProduct iProd = new ImportedProduct(name, price, customsFee);
				list.add(iProd);
			}
		}

		System.out.println();
		System.out.println("Etiqueta de preços:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		scan.close();
	}

}
