package generics;

import bse.Dier;

public class DierenVal {

	private Val val = new Val();
	
	public void vang(Dier slachtoffer) {
		val.vang(slachtoffer);
	}

	@SuppressWarnings("unchecked")
	public <T extends Dier> T bevrijd() {
		return (T) val.bevrijd();
	}
}
