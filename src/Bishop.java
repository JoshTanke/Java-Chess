
public class Bishop extends Piece
{

	public Bishop(Board board, String name, String color, int x, int y) 
	{
		super(board, name, color, x, y);
	}
	
	boolean isLegalMove(Tile newTile) 
	{
		if(onBoard(this.tile, newTile))
		{
			if(Math.abs(newTile.x - this.x) == Math.abs(newTile.y - this.y))
				return true;
		}
		return false;
	}
	

}
