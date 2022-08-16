package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		File path = new File("C:\\Users\\leand\\Documents\\Projetos Java\\docs\\files-lesson.test.txt");
//		Scanner scan = null;
//		
//		try {
//			scan = new Scanner(file);
//			
//			while(scan.hasNextLine()) {
//				System.out.println(scan.nextLine());
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			if(scan != null) {
//				scan.close();
//			}
//		}

//		FileReader fr = null;
//		BufferedReader br = null;
//
//		try {
//			fr = new FileReader(file);
//			br = new BufferedReader(fr);
//
//			String line = br.readLine();
//
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			try {
//				if (br != null) {
//					br.close();
//				}
//				if (fr != null) {
//					fr.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// Cria se não existir e escreve e lê arquivo
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Lê e cria arquivo e subpasta
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a folder path: ");
//		
//		String strPath = scan.nextLine();
//		File path_ = new File(strPath);
//		File[] folders = path_.listFiles(File::isDirectory);
//		System.out.println("FOLDERS:");
//		
//		for (File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		File[] files = path_.listFiles(File::isFile);
//		System.out.println("FILES:");
//		
//		for (File file : files) {
//			System.out.println(file);
//		}
//		
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Directory created successfully: " + success);
//		
//		System.out.println("getName: " + path.getName());
//		System.out.println("getParent: " + path.getParent());
//		System.out.println("getPath: " + path.getPath());
		
		// Cria arquivo e pasta calculando dados utilizando uma classe
//		Locale.setDefault(Locale.US);
//		Scanner scan = new Scanner(System.in);
//
//		List<Product> list = new ArrayList<>();
//
//		System.out.println("Enter file path: ");
//		String sourceFileStr = scan.nextLine();
//
//		File sourceFile = new File(sourceFileStr);
//		String sourceFolderStr = sourceFile.getParent();
//		
//		boolean success = new File(sourceFolderStr + "\\out").mkdir();
//		
//		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
//
//		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
//
//			String itemCsv = br.readLine();
//			while (itemCsv != null) {
//
//				String[] fields = itemCsv.split(",");
//				String name = fields[0];
//				double price = Double.parseDouble(fields[1]);
//				int quantity = Integer.parseInt(fields[2]);
//
//				list.add(new Product(name, price, quantity));
//
//				itemCsv = br.readLine();
//			}
//
//			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
//
//				for (Product item : list) {
//					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
//					bw.newLine();
//				}
//
//				System.out.println(targetFileStr + " CREATED!");
//				
//			} catch (IOException e) {
//				System.out.println("Error writing file: " + e.getMessage());
//			}
//
//		} catch (IOException e) {
//			System.out.println("Error reading file: " + e.getMessage());
//		}
//
//		scan.close();

	}

}
