package hometaskSeven;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		CountDownLatch countDownLatchOne = new CountDownLatch(10);
		CountDownLatch countDownLatchTwo = new CountDownLatch(10);
		CountDownLatch countDownLatchThree = new CountDownLatch(10);
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		executorService.execute(new MyTread(countDownLatchOne, "A"));
		executorService.execute(new MyTread(countDownLatchTwo, "B"));
		executorService.execute(new MyTread(countDownLatchThree, "C"));

		try {
			countDownLatchOne.await();
			countDownLatchTwo.await();
			countDownLatchThree.await();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
