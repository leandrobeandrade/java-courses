package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File path = new File("C:\\Users\\leand\\Documents\\Arq\\test.txt");
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

//		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//			for (String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			String line = br.readLine();
//
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		
		String strPath = scan.nextLine();
		File path_ = new File(strPath);
		File[] folders = path_.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path_.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		scan.close();
	}

}
