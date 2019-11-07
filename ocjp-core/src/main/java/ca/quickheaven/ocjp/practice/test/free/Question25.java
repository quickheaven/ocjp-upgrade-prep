package ca.quickheaven.ocjp.practice.test.free;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Question25 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate date2 = LocalDate.of(2016, Month.JANUARY, 1);

		LocalDateTime dateTime1 = LocalDateTime.of(2016, Month.JANUARY, 1, 0, 0);
		LocalDateTime dateTime2 = LocalDateTime.of(2017, Month.JANUARY, 1, 0, 0);

		Duration duration1 = Duration.between(date1, date2); // An exception is thrown at runtime
		Duration duration2 = Duration.between(dateTime1, dateTime2);

		// The Duration.between method calculates the duration between two Temporal
		// objects. However, it is required that those objects support the
		// ChronoUnit.SECONDS unit. Otherwise, an exception of type
		// UnsupportedTemporalTypeException is thrown at runtime. In this question,
		// LocalDate objects do not contain time information, resulting in an exception.

	}

}
