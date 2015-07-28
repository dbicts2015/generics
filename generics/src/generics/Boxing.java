package generics;

public class Boxing {

	public static void main(String[] args) {
		Object object = new String("smurf");
		// "alles is een Object"
		
		int primitiveInt = 5;
		boolean primitiveBool = true;
		
		Integer objectInt = new Integer(2);
		Boolean objectBool = new Boolean(true);
		
		// BOXING: variabele v/e primitief type in een object
		// stoppen (gebeurt automatisch)
		objectInt = 100;  // verkorte notatie van 
		// objectInt = new Integer(100);
		
		objectBool = false; // verkorte notatie van 
		// objectBool = new Boolean(false);
		
		objectInt = primitiveInt;
		
		// UNBOXING: variabele v/e primitief type uit een object
		// halen (gebeurt automatisch)
		primitiveInt = new Integer(25);
		
		
		objectInt = primitiveInt;   // boxing
		
		object = 125;
		
		int getal = (int) object;
		System.out.println(getal);
	}

}
