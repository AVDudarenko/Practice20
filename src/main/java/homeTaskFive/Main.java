package homeTaskFive;

import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		CommonResource commonResource = new CommonResource();
		new Thread(new Parking(commonResource, semaphore, "car one")).start();
		new Thread(new Parking(commonResource, semaphore, "car two")).start();
		new Thread(new Parking(commonResource, semaphore, "car three")).start();
		new Thread(new Parking(commonResource, semaphore, "car four")).start();
		new Thread(new Parking(commonResource, semaphore, "car five")).start();
		new Thread(new Parking(commonResource, semaphore, "car six")).start();
		new Thread(new Parking(commonResource, semaphore, "car seven")).start();
		new Thread(new Parking(commonResource, semaphore, "car eight")).start();
		new Thread(new Parking(commonResource, semaphore, "car nine")).start();

	}
}
