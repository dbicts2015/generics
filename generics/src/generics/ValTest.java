package generics;


public class ValTest {

	public static void main(String[] args) {
		TestInterface<Integer> iface = s -> {
			System.out.println(5 + s);
		};
		
		iface.test(123456);
	}
	
}
