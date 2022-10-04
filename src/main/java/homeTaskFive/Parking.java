package homeTaskFive;

import java.util.concurrent.Semaphore;

public class Parking implements Runnable {
	private CommonResource commonResource;
	private Semaphore semaphore;
	private String nameOfThread;

	Parking(CommonResource commonResource, Semaphore semaphore, String nameOfThread) {
		this.commonResource = commonResource;
		this.semaphore = semaphore;
		this.nameOfThread = nameOfThread;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
			if (commonResource.numberOfCars < 5) {
				commonResource.numberOfCars++;
				System.out.println("car in parking: " + nameOfThread);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		semaphore.release();
	}
}
