package application;

import java.text.ParseException;

import dates.SDFormat;

public class Main {

	public static void main(String[] args) {
		try {
			SDFormat.ExecsSDF();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}