package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account account;

		System.out.print("Digite o número da conta: ");
		int number = scan.nextInt();
		System.out.print("Digite o nome do titular: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Primeiro depósito (y/n)? ");
		char response = scan.next().charAt(0);
		if (response == 'y') {
			System.out.print("Digite o valor do depósito inicial: ");
			double initialDeposit = scan.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Resumo");
		System.out.println(account);

		System.out.println();
		System.out.print("Digite um valor de depósito: ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue);
		System.out.println("Resumo");
		System.out.println(account);

		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Resumo");
		System.out.println(account);

		scan.close();
	}
}