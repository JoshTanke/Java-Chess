
public class Knight extends Piece
{

	public Knight(Board board, String name, String color, int x, int y) 
	{
		super(board, name, color, x, y);
	}
	
	@Override
	boolean isLegalMove(Tile newTile) 
	{
		if(onBoard(this.tile, newTile))
		{
			if(Math.abs(newTile.x - this.x) == 1 && Math.abs(newTile.y - this.y) == 2)
				return true;
			if(Math.abs(newTile.x - this.x) == 2 && Math.abs(newTile.y - this.y) == 1)
				return true;
		}
		return false;
	}

	@Override
	boolean openPath(Tile tile) 
	{
		return true;
	}
	
	

}
