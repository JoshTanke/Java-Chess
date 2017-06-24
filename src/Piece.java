
public abstract class Piece 
{
	final String name;
	final String color;
	final Board board;
	int x;
	int y;
	Tile tile;
	

	public Piece(Board board, String name, String color, int x, int y) 
	{
		this.name = name;
		this.color = color;
		this.x = x;
		this.y = y;
		this.board = board;
		this.tile = this.board.getBoard()[x][y];
		this.tile.setPiece(this);
		
		
	}
	
	public void movePiece(Tile tile)
	{
		if(isLegalMove(tile) && tile.piece.color != this.color && this.openPath(tile))
		{
			if(tile.isOccupied())
				this.board.addCapturedPiece(tile.piece);
			this.x = tile.x;
			this.y = tile.y;
			this.tile.reset();
			this.tile = tile;
			this.tile.setPiece(this);
			
		}else
		{
			System.out.println("Illegal Move.");
		}
	}
	
	abstract boolean isLegalMove(Tile newTile);
	
	public boolean onBoard(Tile currentTile, Tile newTile)
	{
        if(currentTile.x == newTile.x && currentTile.y == newTile.y)
        {
        	System.out.println("You cannot move the piece to the same location");
            return false; 
        }
        if(newTile.x < 0 || newTile.x > 7 || newTile.y < 0 || newTile.y > 7)
        {
        	System.out.println("New location not located on the board.");
            return false;
        }
        return true;
    }
	
	public String toString()
	{
		return this.name;
	}
	
	abstract boolean openPath(Tile tile);
	

}
