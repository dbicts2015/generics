package bse;

public class Main {

	public static void main(String[] args) {
		Koe koe = new Koe();
		
		koe.voeder(new Vlees());
		koe.voeder(new Gras());
	}

}