package homeTaskTen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String phrase;
		Scanner scanner = new Scanner(System.in);
		phrase = scanner.nextLine();
		scanner.close();

		MyThread thread1 = new MyThread("A", phrase);
		MyThread thread2 = new MyThread("B", phrase);

		thread1.run();
		thread2.run();
	}
}
