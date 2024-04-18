
public class RedGames extends Thread { // Thread p/ rodar em paralelo

	private MegaSena mega;

	public RedGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override // aq ira fazer os sorteios
	public void run() {

		try {
			Lock.sem.acquire();
		} catch (InterruptedException e) {
			// pode dar um erro de interrupção por isso o try
			e.printStackTrace();
		}

		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			System.err.println("Red in");
			mega.play(System.err);
			System.err.println("Red out");

			Lock.sem.release();// ele libera o semafaro
		}
	}
}
