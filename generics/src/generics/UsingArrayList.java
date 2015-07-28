package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> k3 = new ArrayList<String>();
		k3.add("Karen");
		k3.add("Kristel");
		k3.add("Kathleen");
		int aantal = k3.size();
		System.out.printf("Momenteel zijn er %d leden in k3:\n", aantal);
		for (int i = 0; i < aantal; i++) {
			String lid = k3.get(i);
			System.out.println(lid);
		}
	
		k3.forEach(s -> {
			System.out.println(s);
		});
		
		k3.remove(aantal - 1);
		System.out.printf("En nu is het k%d\n", k3.size());
		k3.add("Josje");
		
		k3.clear();  // verwijder alle elementen uit de arraylist
		System.out.printf("Na de grote paasschoonmaak heeft k3 nog %d leden\n", k3.size());
	}

}
