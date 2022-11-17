package homeTaskTen;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

	String name;
	String text;
	private final Lock queueLock = new ReentrantLock();

	public MyThread(String name, String text) {
		this.name = name;
		this.text = text;
	}


	@Override
	public void run() {

		switch (name) {
			case ("A") -> {
				queueLock.lock();
				runThreadOne();
				queueLock.unlock();
			}
			case ("B") -> {
				queueLock.lock();
				runThreadTwo();
				queueLock.unlock();
			}
		}
	}

	private void runThreadOne() {
		System.out.println(text.replace('a', 'o'));
	}

	private void runThreadTwo() {
		System.out.println(text.replace('a', 'n'));
	}
}
