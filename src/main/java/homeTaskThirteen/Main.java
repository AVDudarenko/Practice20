package homeTaskThirteen;

import homeTaskThirteen.ships.types.Type;
import homeTaskThirteen.tasks.PierLoader;
import homeTaskThirteen.tasks.ShipGenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

		Tunnel tunnel = new Tunnel();

		ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

		PierLoader pierLoader1 = new PierLoader(tunnel, Type.DRESS);
		PierLoader pierLoader2 = new PierLoader(tunnel, Type.BANANAS);
		PierLoader pierLoader3 = new PierLoader(tunnel, Type.MEAL);

		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		service.execute(shipGenerator);
		service.execute(pierLoader1);
		service.execute(pierLoader2);
		service.execute(pierLoader3);

		service.shutdown();
	}
}
