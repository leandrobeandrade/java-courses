package dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculation {

	public static void execs() {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekDate = d01.minusDays(7);
		LocalDate nextWeekDate = d01.plusDays(7);

		LocalDateTime pastWeekLocalDate = d02.minusDays(7);
		LocalDateTime nextWeekLocalDate = d02.plusDays(7);

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("\n###########");
		System.out.println("Calculation\n");

		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d01.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}
