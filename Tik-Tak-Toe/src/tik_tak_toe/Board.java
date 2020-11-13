package tik_tak_toe;

public class Board {
	String board[][];
	public static final int LINES = 3;	// festlegung der Zeilenanzahl
	public static final int ROWS = 3;	// festlegung der Spaltenanzahl
	public static final int SYMBOLS = 0;	//festlegung der Anzahl an Symbole, die in die Felder eingetragen werden
	public static final String syms[] = {"A"};	//festlegung der möglichen Symbole
	
	public Board() {
		this.board = new String[LINES][ROWS];	// erstellung des Boadrds
		for (int y = 0; y < LINES; y++) {
			for (int x = 0; x < ROWS; x++) {
				// füllen der Felder
				int field = SYMBOLS;
				board[y][x] = syms[field];
			}
		}
		
	}
	public void print() {		//hier mit lasse ich das Spielfeld ausgeben
		for (int y = 0; y < LINES; y++) {
		System.out.println();
			for (int x= 0; x < ROWS; x++) {
				System.out.print(board[y][x] + " ");
			}
		}
	}

}
