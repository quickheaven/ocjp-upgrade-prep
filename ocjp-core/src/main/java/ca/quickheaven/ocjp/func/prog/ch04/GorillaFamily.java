package ca.quickheaven.ocjp.func.prog.ch04;

public class GorillaFamily {

	String walk = "walk";

	void everyonePlay(boolean baby) {
		String approach = "amble";
		// approach = "run";

		play(() -> walk); // use instance variable
		play(() -> baby ? "hitch a ride" : "run"); // uses a method signature
		play(() -> approach); // uses an effectively final local variable
		// if we uncomment line 6, there will be a reassingment and the variable will no
		// longer be effectively final. This would cause a compiler error on line 13.
	}

	void play(Gorilla g) {
		System.out.println(g.move());
	}

}
