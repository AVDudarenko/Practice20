package homeTaskSix;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyTread implements Runnable {

	Scanner scanner = new Scanner(System.in);
	int a, b, c, d, e;

	CountDownLatch latch;

	MyTread(CountDownLatch countDown) {
		latch = countDown;
		new Thread(this).start();
	}

	@Override
	public void run() {
		a = scanner.nextInt();
		countDown();
		b = scanner.nextInt();
		countDown();
		c = scanner.nextInt();
		countDown();
		d = scanner.nextInt();
		countDown();
		e = scanner.nextInt();
		countDown();
	}

	private void countDown() {
		latch.countDown();
	}
}
