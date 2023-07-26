package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // a peça inicial sua posição é nula então essa linha vc coloca se quiser, pois o java ja entende que é nula mesmo sem descrever
	}

	protected Board getBoard() {
		return board;
	}

	
}
