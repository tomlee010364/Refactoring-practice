package pieces;

import chess.Cell;

public class VerticalHorizontal extends Move {
    public VerticalHorizontal(Piece piece, Cell state[][],int x,int y) {
        super(piece, state, x, y);
    }

    public ArrayList<Cell> move() {
		possiblemoves.clear();
		
        //Checking possible moves in vertical direction
		iterate(-1, 0);
		iterate(1, 0);
		
		//Checking possible moves in horizontal Direction
		iterate(0, -1);
		iterate(0, 1);
		
        return possiblemoves;
    }
}