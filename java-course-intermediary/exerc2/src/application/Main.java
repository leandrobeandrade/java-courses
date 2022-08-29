package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes:");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Contribuinte #" + (i + 1));
			System.out.print("Físico ou Jurídico? (f/j): ");
			char ch = scan.next().charAt(0);

			System.out.print("Nome: ");
			String nome = scan.next();
			System.out.print("Renda anual: ");
			double renda = scan.nextDouble();

			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gasto = scan.nextDouble();

				list.add(new PessoaFisica(nome, renda, gasto));
			} else {
				System.out.print("Número de Funcionários: ");
				int num = scan.nextInt();
				list.add(new PessoaJuridica(nome, renda, num));
			}
		}

		System.out.println();
		System.out.println("Taxas de Impostos:");

		for (Contribuinte contrib : list) {
			System.out.println(contrib.getNome() + ": $" + String.format("%.2f", contrib.calculoImposto()));
		}

		double sum = 0;

		for (Contribuinte contrib : list) {
			sum += contrib.calculoImposto();
		}
		System.out.println("Total de Impostos: $" + String.format("%.2f", sum));

		scan.close();
	}

}
