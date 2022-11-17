package homeTaskNine;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(1);
		listOfNumbers.add(5);
		listOfNumbers.add(12);
		listOfNumbers.add(21);
		Collection<Integer> c = Collections.synchronizedCollection(listOfNumbers);

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new MyThread("A", c));
		executorService.execute(new MyThread("B", c));
		executorService.execute(new MyThread("C", c));

	}
}
