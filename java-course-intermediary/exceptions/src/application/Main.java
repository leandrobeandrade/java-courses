package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test2();
		System.out.println("FIM...");

	}

	public static void test1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iniciou o método 1");

		try {
			String[] vect = scan.nextLine().split(" ");
			int pos = scan.nextInt();

			System.out.println(vect[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();  						// Mostra a pilha (ordem de execução do programa)
		} catch (InputMismatchException e) {
			System.out.println("Tipo de entrada errada!");
		} finally {
			System.out.println("Executa de qualquer forma!");
		}
		
		System.out.println("Finalizou o método 1");

		scan.close();
	}
	
	public static void test2() {
		System.out.println("Iniciou o método 2");
		
		test1();
		
		System.out.println("Finalizou o método 2");
	}

}
