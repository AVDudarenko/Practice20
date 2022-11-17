package homeTaskEleven;

public class MyThread extends Thread {

	String name;
	CommonResource commonResource;

	public MyThread(String name, CommonResource commonResource) {
		this.name = name;
		this.commonResource = commonResource;
	}

	@Override
	public void run() {
		increment();
	}

	synchronized private void increment() {

		for (int i = 0; i < 100; i++) {
			System.out.println(name + " " + commonResource.x++);
		}
	}
}
