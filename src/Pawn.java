
public class Pawn extends Piece 
{
	
	private boolean firstMove;

	public Pawn(Board board, String name, String color, int x, int y) 
	{
		super(board, name, color, x, y);
		this.firstMove = true;
		
	}

	@Override
	boolean isLegalMove(Tile newTile) 
	{
		if(onBoard(this.tile, newTile))
		{
			if(this.firstMove)
			{
				if(Math.abs(newTile.x - this.x) <= 2 && newTile.y == this.y)
					return true;
			}
			if(Math.abs(newTile.x - this.x) == 1)
				if(newTile.y == this.y)
					return true;
				if(Math.abs(newTile.y - this.y) == 1 && newTile.isOccupied())
					return true;
		}
		return false;
	}
	
	@Override
	boolean openPath(Tile tile)
	{
		if(tile.isOccupied())
			return false;
		return true;
			
	}

}
