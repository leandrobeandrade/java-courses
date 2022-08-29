package principal;

import java.util.Locale;
import java.util.Scanner;

import execs.Employee;
import execs.Rectangle;
import execs.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Exec 1
//		Rectangle rect = new Rectangle();
//		
//		System.out.println("Entre com os valores de altura e largura:");
//		rect.width = scan.nextDouble();
//		rect.height = scan.nextDouble();
//		
//		System.out.printf("AREA = %.2f%n", rect.area());
//		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
//		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		// Exec 2
//		Employee emp = new Employee();
//		
//		System.out.print("Nome: ");
//		emp.name = scan.nextLine();
//		System.out.print("Salário Bruto: ");
//		emp.grossSalary = scan.nextDouble();
//		System.out.print("Taxa: ");
//		emp.tax = scan.nextDouble();
//		System.out.println();
//		System.out.println("Funcionário: " + emp);
//		System.out.println();
//		System.out.print("Taxa de aumento do salário bruto? ");
//		double percentage = scan.nextDouble();
//		emp.increaseSalary(percentage);
//		System.out.println();
//		System.out.println("Atualizado: " + emp);

		Student std = new Student();

		System.out.print("Nome: ");
		std.name = scan.nextLine();
		System.out.print("Primeira nota: ");
		std.note1 = scan.nextDouble();
		System.out.print("Segunda nota: ");
		std.note2 = scan.nextDouble();
		System.out.print("Terceira nota: ");
		std.note3 = scan.nextDouble();

		System.out.printf("NOTA	FINAL: %.2f%n", std.finalNote());
		if (std.finalNote() < 60.0) {
			System.out.println("REPROVADO!");
			System.out.printf("Faltando: %.2f Pontos. \n", std.missingNote());
		} else {
			System.out.println("APROVADO.");
		}

		scan.close();

	}

}