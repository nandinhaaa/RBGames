
public class BlackGames extends Thread {

	private MegaSena mega;

	public BlackGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override
	public void run() {
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {

			try {
				Lock.sem.acquire(); 
			} catch (InterruptedException e) {
				// pode dar um erro de interrupção por isso o try 
				e.printStackTrace();
			}

			System.out.println("Black in");
			mega.play(System.out); // imprime preto
			System.out.println("Black out");

			Lock.sem.release();
		}
	}
}
