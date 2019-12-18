package pieces;

import chess.Cell;

public class VerticalHorizontal {
    Piece piece;
    private int x, y;
    private Cell state[][];
    private ArrayList<Cell> possiblemoves = new ArrayList<Cell>();
    public Vertical(Piece piece, Cell state[][],int x,int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public ArrayList<Cell> move() {
        possiblemoves.clear();
        //Checking possible moves in vertical direction
		int tempx=x-1;
		while(tempx>=0)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==piece.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		
		tempx=x+1;
		while(tempx<8)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==piece.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		
		//Checking possible moves in horizontal Direction
		int tempy=y-1;
		while(tempy>=0)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==piece.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy=y+1;
		while(tempy<8)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==piece.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
        }
        return possiblemoves;
    }
}