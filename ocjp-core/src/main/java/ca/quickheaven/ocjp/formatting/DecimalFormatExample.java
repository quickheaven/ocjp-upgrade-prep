package ca.quickheaven.ocjp.formatting;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// # means to omit the position if no digit exists for it.
		// 0 means to put a 0 in the position if no digit exists for it.
		double d = 1234567.437;

		DecimalFormat one = new DecimalFormat("###,###,###.###");
		System.out.println(one.format(d)); // 1,234,567.437

		DecimalFormat two = new DecimalFormat("000,000,000.00000");
		System.out.println(two.format(d)); // 001,234,567.43700

		DecimalFormat three = new DecimalFormat("$#,###,###.##");
		System.out.println(three.format(d)); // $1,234,567.44
	}
}
