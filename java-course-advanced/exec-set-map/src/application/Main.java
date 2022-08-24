package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		// SET
		/*
		 * Set<Integer> a = new HashSet<>(); Set<Integer> b = new HashSet<>();
		 * Set<Integer> c = new HashSet<>();
		 * 
		 * System.out.print("How many students for course A? "); int n = sc.nextInt();
		 * for (int i=0; i<n; i++) { int number = sc.nextInt(); a.add(number); }
		 * 
		 * System.out.print("How many students for course B? "); n = sc.nextInt(); for
		 * (int i=0; i<n; i++) { int number = sc.nextInt(); b.add(number); }
		 * 
		 * System.out.print("How many students for course C? "); n = sc.nextInt(); for
		 * (int i=0; i<n; i++) { int number = sc.nextInt(); c.add(number); }
		 * 
		 * Set<Integer> total = new HashSet<>(a); total.addAll(b); total.addAll(c);
		 * 
		 * System.out.println("Total students: " + total.size());
		 */

		// MAP
		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				} else {
					votes.put(name, count);
				}

				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}