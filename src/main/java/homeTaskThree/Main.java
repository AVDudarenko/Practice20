package homeTaskThree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new ThreadClass(number));
			thread.setName("Thread " + i);
			thread.start();
		}
	}
}
