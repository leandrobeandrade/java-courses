package boardgame;

public class Piece {
	protected Position pos;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		pos = null;  // Opcional
	}

	protected Board getBoard() {
		return board;
	}
	
}
