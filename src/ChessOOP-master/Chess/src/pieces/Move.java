package pieces;

import chess.Cell;

public abstract class Move {
    private int x, y;
    private Piece piece;
    private Cell state[][];
    protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();
    public Move(Piece piece, Cell state[][],int x,int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x; 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y; 
    }

    public Cell getState(int x, int y) {
        return state[x][y];
    }

    public abstract ArrayList<Cell> move();

    public void iterate(int x_add, int y_add) {
        int tmpX = getX() + x_add;
        int tmpY = getY() + y_add;

        while(tmpX >= 0 && tmpX < 8 && tmpY >= 0 && tmpY < 8) {
            if(getState(tmpX, tmpY).getpiece()==null)
				possiblemoves.add(getState(tmpX, tmpY));
			else if(getState(tmpX, tmpY).getpiece().getcolor()==piece.getcolor())
				break;
			else
			{
				possiblemoves.add(getState(tmpX, tmpY));
				break;
			}
			tmpX += x_add;
			tmpY += y_add;
        }
    }
}