
public class Rook extends Piece
{
	
	public Rook(Board board, String name, String color, int x, int y) 
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
		}
		return false;
	}

	@Override
	boolean openPath(Tile tile) 
	{
		int dirX = tile.x > this.x ? 1 : -1;
		int dirY = tile.y > this.y ? 1 : -1;
		
		System.out.println(dirX);
		System.out.println(dirY);
		
		return true;
	}

}
