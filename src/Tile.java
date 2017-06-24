
public class Tile 
{
	int x;
	int y;
	Piece piece;

	public Tile(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.piece = null;
		
	}
	
	public void setPiece(Piece piece)
	{
		this.piece = piece;
	}
	
	public boolean isOccupied()
	{
		if(this.piece == null)
			return false;
		return true;
	}
	
	public void reset()
	{
		this.piece = null;
		
	}
	 
	public String toString()
	{
		if(this.piece == null)
			return null;
		return this.piece.name;
	}
	

}
