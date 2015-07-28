package generics;

public class Val<T> {

	private T gevangene;
	
	public void vang(T slachtoffer) {
		if (slachtoffer == null) {
			throw new NullPointerException();
		}
		if (gevangene != null) {
			throw new ValVolException();
		}
		this.gevangene = slachtoffer;
	}

	public T bevrijd() {
		if (gevangene == null) {
			throw new ValLeegException();
		}
		T gevangene = this.gevangene;
		this.gevangene = null;
		return gevangene;
	}

}