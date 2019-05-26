package ca.quickheaven.ocjp.formatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormatExample {

	public static void main(String[] args) {
		SimpleDateFormat f1 = new SimpleDateFormat("MM dd yyyy hh:mm:ss");
		SimpleDateFormat f2 = new SimpleDateFormat("MMMM yyyy");
		SimpleDateFormat f3 = new SimpleDateFormat("hh");

		Date date;
		try {
			date = f1.parse("05 25 2019 01:22:33");
			System.out.println(f2.format(date)); // May 2019
			System.out.println(f3.format(date)); // 01
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
