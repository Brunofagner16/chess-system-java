package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // a pe�a inicial sua posi��o � nula ent�o essa linha vc coloca se quiser, pois o java ja entende que � nula mesmo sem descrever
	}

	protected Board getBoard() {
		return board;
	}

	
}
