package homeTaskThree;

public class MethodsClass {

	synchronized public void reduceNumber(int number) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (number - i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Ups");
			}
		}
	}
}
