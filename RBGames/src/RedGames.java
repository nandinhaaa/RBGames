
public class RedGames extends Thread { //Thread p/ rodar em paralelo 

	private MegaSena mega;

	public RedGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override //aq ira fazer os sorteios 
	public void run() {
		
		while (Lock.lock == 1) {
			System.out.print("");
		}
		Lock.lock = 1;
		
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			System.err.println("Red in"); 
			mega.play(System.err);
			System.err.println("Red out");
			
			Lock.lock = 0; //dps q ele fez oq foi preciso ele libera o lock
		}
	}
}
