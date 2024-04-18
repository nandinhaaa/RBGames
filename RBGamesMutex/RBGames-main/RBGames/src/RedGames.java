
public class RedGames extends Thread { // Thread p/ rodar em paralelo

	private MegaSena mega;

	public RedGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override // aq ira fazer os sorteios
	public void run() {

		Lock.rLock.lock(); // verificar se ta true e se sim, vai passar ele pra false. caso, já esteja
							// usando vai entrar em modo espera.

		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			System.err.println("Red in");
			mega.play(System.err);
			System.err.println("Red out");

			Lock.rLock.unlock();// ele libera o lock
		}
	}
}
