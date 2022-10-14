package application;

import java.text.ParseException;

import dates.Instantiation;
import dates.Calculation;
import dates.Conversion;
import dates.Formatting;
import dates.SDFormat;

public class Main {

	public static void main(String[] args) {
		Instantiation.execs();
		Formatting.execs();
		Conversion.execs();
		Calculation.execs();
		
		try {
			SDFormat.execsSDF();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}