package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("ENTRE COM AS MEDIDAS DO TRI�NGULO X:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();

		System.out.println("ENTRE COM AS MEDIDAS DO TRI�NGULO Y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.calcArea();		
		double areaY = y.calcArea();
		
		System.out.printf("�rea tri�ngulo X: %.2f\n", areaX);
		System.out.printf("�rea tri�ngulo Y: %.2f\n", areaY);
		
		if(areaX > areaY)
			System.out.println("Maior �rea do tri�ngulo X");
		else
			System.out.println("Maior �rea do tri�ngulo Y");
		
		scan.close();
	}

}