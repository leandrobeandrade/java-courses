package application;

import java.util.Locale;
import java.util.Scanner;

import user.User;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

//		int n = scan.nextInt();
//		double[] array = new double[n];
//		
//		for (int i = 0; i < n; i++) {
//			array[i] = scan.nextDouble();
//		}
//		
//		double sum = 0.0;
//		for (int i = 0; i < n; i++) {
//			sum += array[i];
//		}
//		double avg = sum / n;
//		
//		System.out.printf("Average height %.2f", avg);

//		int n = scan.nextInt();
//		Product[] products = new Product[n];
//		
//		for(int i = 0; i < products.length; i++) {
//			scan.nextLine();
//			String name = scan.nextLine();
//			double price = scan.nextDouble();
//			
//			products[i] = new Product(name, price);
//		}
//		
//		double sum = 0;
//		for (int i = 0; i < products.length; i++) {
//			sum += products[i].getPrice();
//		}
//		double avg = sum / products.length;
//		
//		System.out.printf("Average height %.2f", avg);

		User[] rooms = new User[10];

		System.out.println("Quanto(s) quarto(s) deseja alugar?");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Locatário #" + (i + 1) + ":");
			System.out.println("");
			System.out.print("Digite o nome do locatário: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Digite o email do locatário: ");
			String email = scan.nextLine();
			System.out.print("Digite o número do quarto desejado: ");
			int numRoom = scan.nextInt();

			rooms[numRoom] = new User(name, email);
		}

		System.out.println();
		System.out.println("Resumo: ");

		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

		scan.close();
	}

}