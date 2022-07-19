package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Digite o número de funcionários:");
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("Terceirizado? (s/n)");
			char ch = scan.next().charAt(0);
			System.out.print("Nome:");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hora:");
			int hours = scan.nextInt();
			System.out.print("Valor por hora:");
			double valuePerHour = scan.nextDouble();
			
			if(ch == 's') {
				System.out.print("Valor adicional:");
				double additionalCharge = scan.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		scan.close();
	}

}
