import java.io.PrintStream;
import java.util.Random;

public class PrinterThread extends Thread {

	private static final int NUM_MESSAGES = 10;
	private Printer printer;
	private PrintStream stream;

	public PrinterThread(Printer p) {
		this.printer = p;
	}

	public void setStream(PrintStream stream) {
		this.stream = stream;
	}

	public PrintStream getStream() {
		return this.stream;
	}

	@Override
	public void run() {
		while (true) {
			int amount = new Random().nextInt(NUM_MESSAGES + 1);
			String[] messages = new String[amount + 1];

			messages[0] = String.format("%s - %d", this.getName(), amount);

			for (int i = 1; i < messages.length; i++) {
				messages[i] = String.format("%s - %d", this.getName(), amount);
				String string = messages[i];
				System.out.print(string + "-");
			}

			printer.printMessages(messages, this);
		}
	}
}
