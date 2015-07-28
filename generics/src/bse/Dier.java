package bse;

public class Dier {

	public void voeder(Voedsel v) {
		System.out.printf("Ik ben een %s en ik heb %s gekregen om te eten.%n",
				super.getClass().getSimpleName(), v.getClass().getSimpleName());
	}

}