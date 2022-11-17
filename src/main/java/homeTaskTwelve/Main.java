package homeTaskTwelve;

import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		CommonResource commonResource = new CommonResource();
		Semaphore semaphore = new Semaphore(commonResource.countOfSeats);

		for (int i = 1; i < 61; i++) {
			MyThread thread = new MyThread("Person" + i, commonResource, semaphore);
			thread.run();
		}

	}
}
