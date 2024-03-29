package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Digite o n�mero de formas:");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Forma #" + (i + 1));
			System.out.print("Ret�ngulo ou c�rculo? (r/c): ");
			char ch = scan.next().charAt(0);

			System.out.print("Qual a cor da forma? (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());

			if (ch == 'r') {
				System.out.print("Largura: ");
				double width = scan.nextDouble();
				System.out.print("Altura: ");
				double height = scan.nextDouble();

				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Raio: ");
				double radius = scan.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("Areas:");

		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		scan.close();
	}

}
