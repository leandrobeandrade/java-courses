package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ENTRADAS

//		int num1 = 5; 
//		int num2 = 4; 
//		double num3 = 10.12345; 
//		String nome = "Fulano";
//		 
//		System.out.println("Hello World!!...."); 
//		System.out.println(num1 + num2);
//		System.out.printf("%.2f\n", num3); 
//		System.out.printf("%.4f\n", num3);
//		 
//		Locale.setDefault(Locale.US); 
//		System.out.printf("RESULTADO %.2f\n", num3);
//		 
//		System.out.printf("%s tem %d anos e ganha R$%.2f \n", nome, num1, num3);
//		System.out.print("=================================");
//		
//		Scanner scan = new Scanner(System.in);
//		 
//		int idade; 
//		idade = scan.nextInt(); 
//		System.out.println("A idade � " + idade);
//		 
//		scan.close();

		// EXERC�CIOS => RAIO

		Locale.setDefault(Locale.US);
//		double pi = 3.14159; 
//		Scanner scan = new Scanner(System.in); 
//		double raio = scan.nextDouble(); 
//		double area = pi * raio * raio;
//		  
//		System.out.printf("Area = %.4f%n", area);
//		 
//		scan.close();

		// EXERC�CIOS => DIFERENCIAL

//		int a, b, c, d, difer; 
//		Scanner scan = new Scanner(System.in);
//		  
//		a = scan.nextInt(); 
//		b = scan.nextInt(); 
//		c = scan.nextInt();
//		d = scan.nextInt();
//		  
//		difer = a * b - c * d;
//		  
//		System.out.println("Diferen�a " + difer);
//		
//		scan.close();

		// EXERC�CIOS => TRABALHO

		int num, horas;
		double valHr, salario;
		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();
		horas = scan.nextInt();
		valHr = scan.nextDouble();
		salario = horas * valHr;

		System.out.printf("N�mero: %d sal�rio: %.2f", num, salario);

		scan.close();

		// EXERC�CIOS => PRODUTOS

//		int code1, code2, qtd1, qtd2;
//		double preco1, preco2, valTl;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Entre com os valores: c�digo, quantidade e pre�o:");
//		
//		code1 = scan.nextInt();
//		qtd1 = scan.nextInt();
//		preco1 = scan.nextDouble();
//		
//		code2 = scan.nextInt();
//		qtd2 = scan.nextInt();
//		preco2 = scan.nextDouble();
//		
//		valTl = qtd1 * preco1 + qtd2 * preco2;
//		
//		System.out.println("Com os c�digos: " + code1 + " e " + code2);
//		System.out.printf("Valor Total: R$%.2f", valTl);
//		
//		scan.close();

		// EXERC�CIOS => �REAS

//		Locale.setDefault(Locale.US);
//		Scanner scan = new Scanner(System.in);
//		double a, b , c;
//		
//		System.out.println("Entre com 3 valores para calcular as �reas das formas:");
//		
//		a = scan.nextDouble();
//		b = scan.nextDouble();
//		c = scan.nextDouble();
//		
//		System.out.println("RESULTADOS:");
//		System.out.printf("tri�ngulo: %.3f \n", a * c / 2.0);
//		System.out.printf("c�rculo: %.3f \n", 3.14159 * c * c);
//		System.out.printf("trap�zio: %.3f \n", (a + b) / 2.0 * c);
//		System.out.printf("quadrado: %.3f \n", b * b);
//		System.out.printf("ret�ngulo: %.3f \n", a * b);
//		
//		scan.close();

	}

}