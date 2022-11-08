package homeTaskSix;

import java.util.concurrent.CountDownLatch;

public class MainCDL {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);

		MyTread myTread = new MyTread(countDownLatch);

		try {
			countDownLatch.await();
			System.out.println(myTread.a);
			System.out.println(myTread.b);
			System.out.println(myTread.c);
			System.out.println(myTread.d);
			System.out.println(myTread.e);
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}
}
