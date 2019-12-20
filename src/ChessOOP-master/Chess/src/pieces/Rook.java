package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Rook class inherited from abstract Piece class
 *
 */
public class Rook extends Piece{
	
	//Constructor
	public Rook(String id,String path,int color)
	{
		setId(id);
		setPath(path);
		setColor(color);
	}
	
	//Move function defined
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Rook can move only horizontally or vertically
		Move verticalhorizontal = new VerticalHorizontal(this, state, x, y);
		possiblemoves = verticalhorizontal.move();
		return possiblemoves;
	}
}
