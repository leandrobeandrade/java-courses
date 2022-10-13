package application;

import java.text.ParseException;

import dates.Instantiation;
import dates.Others;
import dates.SDFormat;

public class Main {

	public static void main(String[] args) {
		Instantiation.execs();
		System.out.println("\n#################");
		
		Others.execs();
		System.out.println("\n#################");
		
		try {
			System.out.println("\nSimpleDateFormat");
			SDFormat.execsSDF();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}