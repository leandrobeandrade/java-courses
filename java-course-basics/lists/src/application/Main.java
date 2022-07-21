package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Maria");
//		list.add("Alex");
//		list.add("Bob");
//		list.add("Ana");
//		list.add(2, "Maco");
//		
//		System.out.println(list.size());
//		
//		for(String l : list) {
//			System.out.println(l);
//		}
//		list.remove(1);
//		System.out.println(list);
//		
//		list.removeIf(l -> l.charAt(0) == 'M');
//		
//		System.out.println(list);
//		System.out.println(list.indexOf("Ana"));
//		System.out.println("----------------------");
//		
//		List<String> list2 = new ArrayList<String>();
//		
//		list2.add("Maria");
//		list2.add("Alex");
//		list2.add("Bob");
//		list2.add("Ana");
//		list2.add("Maco");
//		
//		System.out.println(list2);
//		
//		List<String> result = list2.stream().filter(l -> l.charAt(0) == 'A').collect(Collectors.toList());
//		
//		System.out.println(result);
//		
//		String name = list2.stream().filter(l -> l.charAt(0) == 'M').findFirst().orElse(null);
//		System.out.println(name);

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Digite o número de funcionários: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ": ");
			System.out.println();

			System.out.print("Digite o id do funcionário: ");
			int id = scan.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id já existente. Inserir outro Id: ");
				id = scan.nextInt();
			}

			System.out.print("Digite o nome do funcionário: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Salário: ");
			double salary = scan.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Digite o id do funcionário que será acrescido o salário: ");
		int id = scan.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // Verifica se existe o id informado

		if (emp == null) {
			System.out.println("O id informado não existe!");
		} else {
			System.out.print("Digite a porcentagem: ");
			double percentage = scan.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("Lista de funcionários:");

		for (Employee obj : list) {
			System.out.println(obj);
		}

		scan.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}