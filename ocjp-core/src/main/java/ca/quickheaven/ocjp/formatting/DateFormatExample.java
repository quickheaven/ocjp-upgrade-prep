package ca.quickheaven.ocjp.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateFormatExample {

	public static void main(String[] args) {
		DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat m = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat l = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);

		Date d = new GregorianCalendar(2019, Calendar.MAY, 25).getTime();

		System.out.println(s.format(d)); // 5/25/19
		System.out.println(m.format(d)); // May 25, 2019
		System.out.println(l.format(d)); // May 25, 2019
		System.out.println(f.format(d)); // May 25, 2019

		DateFormat dtf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL);
		System.out.println(dtf.format(d)); // May 25, 2019 12:00:00 AM EDT

		DateFormat de = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, Locale.GERMANY);
		System.out.println(de.format(d)); // 25.05.2019 00:00 Uhr EDT

		DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String dateStr = "05/25/2019";
		Date date;
		try {
			date = shortFormat.parse(dateStr);
			System.out.println(shortFormat.format(date)); // 5/25/19

			DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
			System.out.println(fullFormat.format(date)); // samedi 25 mai 2019
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
