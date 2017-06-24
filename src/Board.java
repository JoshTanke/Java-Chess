import java.util.ArrayList;

public class Board 
{
	private Tile[][] board = new Tile[8][8];
	private ArrayList<Piece> capturedPieces = new ArrayList<Piece>(); 

	public Board() 
	{
		//test2
		createBoard();
		newGame();
		
	}
	
	public void createBoard()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board[i][j] = new Tile(i, j);
			}
		}
	}
	
	public void newGame()
	{
		//Black pieces
		Piece BRook1 = new Rook(this, "BRook1", "Black", 0, 0);
		Piece BRook2 = new Rook(this, "BRook2", "Black", 0, 7);
		
		Piece BBishop1 = new Bishop(this, "BBishop1", "Black", 0, 2);
		Piece BBishop2 = new Bishop(this, "BBishop2", "Black", 0, 5);
		
		Piece BKnight1 = new Knight(this, "BKnight1", "Black", 0, 1);
		Piece BKnight2 = new Knight(this, "BKnight2", "Black", 0, 6);
		
		Piece BKing = new King(this, "BKing", "Black", 0, 4);
		Piece BQueen = new Queen(this, "BQueen", "Black", 0, 3);
		
		Piece BPawn1 = new Pawn(this, "Bpawn1", "Black", 1, 0);
		Piece BPawn2 = new Pawn(this, "BPawn2", "Black", 1, 1);
		Piece BPawn3 = new Pawn(this, "Bpawn3", "Black", 1, 2);
		Piece BPawn4 = new Pawn(this, "Bpawn4", "Black", 1, 3);
		Piece BPawn5 = new Pawn(this, "Bpawn5", "Black", 1, 4);
		Piece BPawn6 = new Pawn(this, "Bpawn6", "Black", 1, 5);
		Piece BPawn7 = new Pawn(this, "Bpawn7", "Black", 1, 6);
		Piece BPawn8 = new Pawn(this, "Bpawn8", "Black", 1, 7);
		
		//White pieces
		Piece WRook1 = new Rook(this, "WRook1", "White", 7, 7);
		Piece WRook2 = new Rook(this, "WRook2", "White", 7, 0);
		
		Piece WBishop1 = new Bishop(this, "WBishop1", "White", 7, 2);
		Piece WBishop2 = new Bishop(this, "WBishop2", "White", 7, 5);
		
		Piece WKnight1 = new Knight(this, "WKnight1", "White", 7, 1);
		Piece WKnight2 = new Knight(this, "WKnight2", "White", 7, 6);
		
		Piece WKing = new King(this, "WKing", "White", 7, 4);
		Piece WQueen = new Queen(this, "WQueen", "White", 7, 3);
		
		Piece WPawn1 = new Pawn(this, "Wpawn1", "White", 6, 0);
		Piece WPawn2 = new Pawn(this, "WPawn2", "White", 6, 1);
		Piece WPawn3 = new Pawn(this, "Wpawn3", "White", 6, 2);
		Piece WPawn4 = new Pawn(this, "Wpawn4", "White", 6, 3);
		Piece WPawn5 = new Pawn(this, "Wpawn5", "White", 6, 4);
		Piece WPawn6 = new Pawn(this, "Wpawn6", "White", 6, 5);
		Piece WPawn7 = new Pawn(this, "Wpawn7", "White", 6, 6);
		Piece WPawn8 = new Pawn(this, "Wpawn8", "White", 6, 7);
		
	}
	
	public Tile[][] getBoard()
	{
		return this.board;
	}
	
	public void move(Tile currentTile, Tile newTile)
	{
		if(currentTile.isOccupied())
		{
			currentTile.piece.movePiece(newTile);
		}
	}
	
	public Tile getTile(int x, int y)
	{
		return this.board[x][y];
	}
	
	public void addCapturedPiece(Piece piece)
	{
		capturedPieces.add(piece);
	}
	
	public ArrayList<Piece> getCapturedPieces()
	{
		return capturedPieces;
	}
	
	public void displayBoard()
	{
		for(int i = 0; i < 8; i++)
	    {
			for(int j = 0; j < 8; j++)
			{
				System.out.print(board[i][j].toString());
			}
			System.out.println();
	    }
	}

}
