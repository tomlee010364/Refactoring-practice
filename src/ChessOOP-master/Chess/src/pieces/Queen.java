package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Queen Class inherited from the abstract Piece class
 *
 */
public class Queen extends Piece{
	
	//Constructors
	public Queen(String id,String path,int color)
	{
		setId(id);
		setPath(path);
		setColor(color);
	}
	
	//Move Function Defined
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Queen has most number of possible moves
		//Queen can move any number of steps in all 8 direction
		//The possible moves of queen is a combination of Rook and Bishop
		
		Move verticalhorizontal = new VerticalHorizontal(this, state, x, y);
		possiblemoves = verticalhorizontal.move();
		Move diagonal = new Diagonal(this, state, x, y);
		possiblemoves.addAll(diagonal.move());

		return possiblemoves;
	}
}