
public class Main {
	public static void main(String[] args) {
		MegaSena mega = new MegaSena(6);
		
		RedGames redGames = new RedGames(mega);
		BlackGames blackGames = new BlackGames(mega);
		
		redGames.start();
		blackGames.start();
	}
}
