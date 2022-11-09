package homeTaskEight;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Home {
	public static void main(String[] args) {
		CountDownLatch cdl1 = new CountDownLatch(11);
		CountDownLatch cdl2 = new CountDownLatch(11);
		CountDownLatch cdl3 = new CountDownLatch(11);
		CountDownLatch cdl4 = new CountDownLatch(11);
		CountDownLatch cdl5 = new CountDownLatch(11);
		CountDownLatch cdl6 = new CountDownLatch(11);
		CountDownLatch cdl7 = new CountDownLatch(11);
		CountDownLatch cdl8 = new CountDownLatch(11);
		CountDownLatch cdl9 = new CountDownLatch(11);
		CountDownLatch cdl10 = new CountDownLatch(11);

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(new MyTread(cdl1, "A"));
		executorService.execute(new MyTread(cdl2, "B"));

		try {
			cdl1.await();
			cdl2.await();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
