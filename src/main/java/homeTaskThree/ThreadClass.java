package homeTaskThree;

public class ThreadClass implements Runnable {

	int number;

	public ThreadClass(int number) {
		this.number = number;
	}

	MethodsClass methodsClass = new MethodsClass();

	@Override
	public void run() {
		methodsClass.reduceNumber(number);
	}
}
