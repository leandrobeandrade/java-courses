package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\leand\\Documents\\Arq\\test.txt");
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
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
