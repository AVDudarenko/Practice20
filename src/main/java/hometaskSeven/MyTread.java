package hometaskSeven;

import java.util.concurrent.CountDownLatch;

public class MyTread implements Runnable {
	String name;
	CountDownLatch latch;

	MyTread(CountDownLatch c, String n) {
		latch = c;
		name = n;
		new Thread(this);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " count: " + i);
			latch.countDown();
		}
	}
}
