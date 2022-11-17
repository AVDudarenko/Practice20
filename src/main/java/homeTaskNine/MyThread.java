package homeTaskNine;

import java.util.Collection;

public class MyThread implements Runnable {

	String name;
	Collection<Integer> collection;

	public MyThread(String name, Collection<Integer> c) {
		this.name = name;
		this.collection = c;
	}

	@Override
	public void run() {
		System.out.println("Collection: " + collection);
		for (int i : collection) {
			System.out.println("Thread name: " + name + " Value of collection: " + (i + 10));
		}
	}
}
