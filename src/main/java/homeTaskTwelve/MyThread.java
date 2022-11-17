package homeTaskTwelve;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

	String name;
	CommonResource commonResource;
	private final Semaphore semaphore;

	public MyThread(String name, CommonResource commonResource, Semaphore semaphore) {
		this.name = name;
		this.commonResource = commonResource;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
			increment();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		semaphore.release();
	}

	synchronized private void increment() {

		if (commonResource.countOfBooks > 1) {
			for (int i = 0; i < 3; i++) {
				System.out.println(name + " " + (commonResource.countOfBooks--));
			}
		} else if (commonResource.countOfBooks == 1) {
			System.out.println(name + " " + (commonResource.countOfBooks--));
		} else {
			System.out.println(name + " Sorry, all books are gone.");
		}

	}
}
