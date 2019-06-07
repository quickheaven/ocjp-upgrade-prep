package ca.quickheaven.ocjp.gencol;

import ca.quickheaven.ocjp.gencol.vo.Crate;
import ca.quickheaven.ocjp.gencol.vo.Elephant;
import ca.quickheaven.ocjp.gencol.vo.Robot;
import ca.quickheaven.ocjp.gencol.vo.SizeLimitedCrate;
import ca.quickheaven.ocjp.gencol.vo.Zebra;

public class GenericClasses {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCreate(elephant);

		Elephant inNewHome = crateForElephant.emptyCrate();

		Crate<Zebra> crateForZebra = new Crate<>();

		Robot joeBot = new Robot();
		Crate<Robot> robotCrate = new Crate<>();
		robotCrate.packCreate(joeBot);

		Robot atDestination = robotCrate.emptyCrate();

		// --
		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);

	}

}
