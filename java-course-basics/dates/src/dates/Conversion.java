package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversion {

	public static void execs() {
		// for (String s : ZoneId.getAvailableZoneIds())
		// System.out.println(s);

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("\n##########");
		System.out.println("Conversion\n");

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d01.getDayOfMonth());
		System.out.println("d04 mês = " + d01.getMonthValue());
		System.out.println("d04 ano = " + d01.getYear());
		System.out.println("d05 hora = " + d02.getHour());
		System.out.println("d05 minutos = " + d02.getMinute());
	}
}
