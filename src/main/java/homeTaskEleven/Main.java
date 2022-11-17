package homeTaskEleven;

public class Main {
	public static void main(String[] args) {

		CommonResource commonResource = new CommonResource();

		for (int i = 1; i < 11; i++) {
			MyThread thread = new MyThread("Thread" + i, commonResource);
			thread.start();
		}
	}
}
