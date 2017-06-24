
public class Queen extends Piece
{
	
	public Queen(Board board, String name, String color, int x, int y) 
	{
		super(board, name, color, x, y);
	}

	@Override
	boolean isLegalMove(Tile newTile) 
	{
		if(onBoard(this.tile, newTile))
		{
			if(newTile.x - this.x == 0 || newTile.y - this.y == 0)
				return true;
			if(Math.abs(newTile.x - this.x) == Math.abs(newTile.y - this.y))
				return true;
		}
		return false;
	}

}

