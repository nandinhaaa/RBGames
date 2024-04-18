
public class BlackGames extends Thread {

	private MegaSena mega;

	public BlackGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override
	public void run() {
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
		
			Lock.rLock.lock(); //verificar se ta true e se sim, vai passar ele pra false. caso, já esteja usando vai entrar em modo espera. 
			

			System.out.println("Black in");
			mega.play(System.out); // imprime preto
			System.out.println("Black out");

			Lock.rLock.unlock();
		}
	}
}
