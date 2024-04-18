import java.util.concurrent.Semaphore;

public class Lock {
//Semafaro com 1 permit é um Mutex
	public static Semaphore sem = new Semaphore(1);
}
