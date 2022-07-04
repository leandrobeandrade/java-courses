package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int n = scan.nextInt();
//		int[][] mat = new int[n][n];
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				mat[i][j] = scan.nextInt();
//			}
//		}
//
//		System.out.println("Diagonal principal: ");
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println(mat[i][i] + " ");
//		}
//		System.out.println();
//
//		int count = 0;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				if(mat[i][j] < 0) count++;
//			}
//		}
//		
//		System.out.println("Números negativos na matriz: " + count);

		int lin = scan.nextInt();
		int col = scan.nextInt();
		int[][] mtx = new int[lin][col];

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				mtx[i][j] = scan.nextInt();
			}
		}

		int x = scan.nextInt();

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[i].length; j++) {
				System.out.println("Matriz: " + mtx[i][j]);
				if (mtx[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mtx[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + mtx[i - 1][j]);
					}
					if (j < mtx[i].length - 1) {
						System.out.println("Direita: " + mtx[i][j + 1]);
					}
					if (i < mtx.length - 1) {
						System.out.println("Embaixo: " + mtx[i + 1][j]);
					}
				}
			}
		}

		scan.close();
	}

}