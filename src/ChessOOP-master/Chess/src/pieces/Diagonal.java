package pieces;

import chess.Cell;

public class Diagonal extends Move {
    public Diagonal(Piece piece, Cell state[][],int x,int y) {
        super(piece, state, x, y);
    }

    public ArrayList<Cell> move() {
		possiblemoves.clear();
		
		iterate(1, -1);
		iterate(-1, 1);
		iterate(-1, -1);
		iterate(1, 1);

		return possiblemoves;
	}
}