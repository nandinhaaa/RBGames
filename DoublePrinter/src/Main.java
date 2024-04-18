
public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();

		PrinterThread pt1 = new PrinterThread(printer);
		PrinterThread pt2 = new PrinterThread(printer);
		PrinterThread pt3 = new PrinterThread(printer);
		PrinterThread pt4 = new PrinterThread(printer);

		pt1.start();
		pt2.start();
		pt3.start();
		pt4.start();
	}
}
