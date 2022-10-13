package dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiation {
	
	public static void execs() {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Instant d07 = null;
		try {
			d07 = sdf.parse("2022-07-20T01:30:26-03:00").toInstant();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 01, 30);
		
		System.out.println("Instantiation\n");
		
		System.out.println("d01 - (Data local) => " + d01.toString());
		System.out.println("d02 - (Data e hora local) => " + d02.toString());
		System.out.println("d03 - (Data e hora global) => " + d03.toString());
		System.out.println("d04 - (Data local setada) => " + d04.toString());
		System.out.println("d05 - (Data e hora local setada) => " + d05.toString());
		System.out.println("d06 - (Data e hora global setada) => " + d06.toString());
		System.out.println("d07 - (Data e hora global setada Timezone) => " + d07.toString());
		System.out.println("d08 - (Data formatada) => " + d08.toString());
		System.out.println("d09 - (Data e hora formatada) => " + d09.toString());
		System.out.println("d10 - (Data formatada por números) => " + d10.toString());
		System.out.println("d11 - (Data e hora formatada por números) => " + d11.toString());
	}
}
