package generics;

import java.util.Deque;
import java.util.LinkedList;

public class Val2<T> {

	private final Deque<T> collection = new LinkedList<T>();

	public void vang(T t) {
		collection.addLast(t);
	}

	public int aantalGevangenen() {
		return collection.size();
	}

	public T bevrijd() {
		return collection.removeLast();
	}

	public void open() {
		collection.clear();
	}

}
