import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Printer {

	private Semaphore printerSem = new Semaphore(2);
	private List<String> threadsIn = new ArrayList<>();
	private PrintStream lastStreamUsed = System.err;

	public void printMessages(String[] messages, PrinterThread thread) {

		try {
			printerSem.acquire();
			threadsIn.add(thread.getName());
			System.out.println("Dentro: " + threadsIn.toString());

			if (lastStreamUsed == System.err) {
				lastStreamUsed = System.out;
			} else {
				lastStreamUsed = System.err;
			}
			thread.setStream(lastStreamUsed);

			for (String message : messages) {
				thread.getStream().println(message);
			}

			threadsIn.remove(thread.getName());
			printerSem.release();

		} catch (Exception ie) {

		}

	}

}
