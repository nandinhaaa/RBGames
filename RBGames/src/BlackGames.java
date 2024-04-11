
public class BlackGames extends Thread {
	
	private MegaSena mega;
	
	public BlackGames(MegaSena mega) {
		this.mega = mega;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			while (Lock.lock == 1) {
				System.out.print("");
			}
			Lock.lock = 1;
			
			System.out.println("Black in");
			mega.play(System.out); //imprime preto
			System.out.println("Black out");
			
			Lock.lock = 0; //dps q ele fez oq foi preciso ele libera o lock
		}
	}
}
