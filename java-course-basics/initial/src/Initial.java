import java.util.Locale;
import java.util.Scanner;

public class Initial {

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
//		System.out.println("A idade é " + idade);
//		 
//		scan.close();

		// EXERCÍCIOS => RAIO

		Locale.setDefault(Locale.US);
//		double pi = 3.14159; 
//		Scanner scan = new Scanner(System.in); 
//		double raio = scan.nextDouble(); 
//		double area = pi * raio * raio;
//		  
//		System.out.printf("Area = %.4f%n", area);
//		 
//		scan.close();

		// EXERCÍCIOS => DIFERENCIAL

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
//		System.out.println("Diferença " + difer);
//		
//		scan.close();

		// EXERCÍCIOS => TRABALHO

		int num, horas;
		double valHr, salario;
		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();
		horas = scan.nextInt();
		valHr = scan.nextDouble();
		salario = horas * valHr;

		System.out.printf("Número: %d salário: %.2f", num, salario);

		scan.close();

		// EXERCÍCIOS => PRODUTOS

//		int code1, code2, qtd1, qtd2;
//		double preco1, preco2, valTl;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Entre com os valores: código, quantidade e preço:");
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
//		System.out.println("Com os códigos: " + code1 + " e " + code2);
//		System.out.printf("Valor Total: R$%.2f", valTl);
//		
//		scan.close();

		// EXERCÍCIOS => ÁREAS

//		Locale.setDefault(Locale.US);
//		Scanner scan = new Scanner(System.in);
//		double a, b , c;
//		
//		System.out.println("Entre com 3 valores para calcular as áreas das formas:");
//		
//		a = scan.nextDouble();
//		b = scan.nextDouble();
//		c = scan.nextDouble();
//		
//		System.out.println("RESULTADOS:");
//		System.out.printf("triângulo: %.3f \n", a * c / 2.0);
//		System.out.printf("círculo: %.3f \n", 3.14159 * c * c);
//		System.out.printf("trapézio: %.3f \n", (a + b) / 2.0 * c);
//		System.out.printf("quadrado: %.3f \n", b * b);
//		System.out.printf("retângulo: %.3f \n", a * b);
//		
//		scan.close();

	}

}