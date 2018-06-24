
public class GameOfLife {
	
	int fieldWidth = 20;
	int fieldHeight = 20;
	
	int[][] field = new int[fieldWidth][fieldHeight];
	
	
	public void def() {
		
		for (int i=0; i<fieldWidth; i++) {
			for (int j=0; j<fieldHeight; j++) {
				field[i][j] = (int)Math.random();
			}
		}
	}

	// mehr als drei: tot wird leben; leben wird tod
}
