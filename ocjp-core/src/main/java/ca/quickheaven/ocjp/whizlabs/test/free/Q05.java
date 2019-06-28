package ca.quickheaven.ocjp.whizlabs.test.free;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Q05 {

	public static void main(String[] args) {
		Period period = Period.of(1, 2, 3);
		Duration duration = Duration.of(10000, ChronoUnit.SECONDS);
		System.out.println(period + "" + duration); // P1Y2M3DPT2H46M40S
	}

}
