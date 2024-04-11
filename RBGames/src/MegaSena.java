import java.io.PrintStream; 
import java.util.Random;

public class MegaSena {
	private int valuesPerGame;
	private static final int MAX_VALUE = 60; //valor max na mega
	public static final int NUMBER_OF_GAMES = 100; //num de jogos
	
	public MegaSena(int valuesPerGame) {
		this.valuesPerGame = valuesPerGame;
	}
	
	public void play(PrintStream printer) { //faz um for de acordo com o num de valores que queremos pro jogo e sorteia esses valores. (6,7,8.. num q vc decidir por jogo. 
		for (int i = 0; i < valuesPerGame; i++) { //printStream ele imprime os num sorteados, utiliza-se ele 
			
			int value = new Random().nextInt(MAX_VALUE) + 1;
			
			printer.print(String.format(" %02d", value));
		}
		printer.println();
	}
}
