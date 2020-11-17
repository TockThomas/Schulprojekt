package tik_tak_toe;

public class Board {
	String board[][];
	public static final int LINES = 3;	// festlegung der Zeilenanzahl
	public static final int ROWS = 3;	// festlegung der Spaltenanzahl
	public static final int SYMBOLS = 0;	//festlegung der Anzahl an Symbole, die in die Felder eingetragen werden
	public static final String syms[] = {"A", "X", "O"};	//festlegung der möglichen Symbole
	boolean win;		// hier ist die variable, ob jemand gewonnen hat oder nicht
	
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
		if (y > 0) {
			System.out.println("---+---+---");
		}
			for (int x= 0; x < ROWS; x++) {
				System.out.print(" " + board[y][x]);
				if (x < 2) {
					System.out.print(" |");
				}
			}
		}
	}
	// das sollte die Abfrage sein, ob jemand gewonnen hat oder nicht, bin mir nicht sicher, ob sie funktioniert, da ich sie noch nicht testen konnte
	public boolean analyse() { //hier wird überprüft, ob drei gleiche Symbole in einer Reihe sind
		win = false;
		for (int y =  0; y < LINES; y++) {
			for (int x = 0; x < ROWS - 2; x++) {
				if (board[y][x] != "A" && board[y][x] == board[y][x + 1] && board[y][x + 1] == board[y][x + 2]) {
					win = true;
				}
			}
		}
		for (int y = 0; y < LINES - 2; y++) {	//hier wird überprüft, ob drei gleiche Symbole in einer Spalte sind
			for (int x = 0; x < ROWS; x++) {
				if (board[y][x] != "A" && board[y][x] == board[y + 1][x] && board[y + 1][x] == board[y +2][x]) {
					win = true;
				}
			}
		}
		for (int y = 0; y < LINES - 2; y++) {	//überprüft die diagonale von links oben nach rechts unten
			for (int x = 0; x < ROWS - 2; x++) {
				if (board[y][x] != "A" && board[y][x] == board[y + 1][x + 1] && board[y + 1][x + 1] == board[y+ 2][x + 2]) {
					win = true;
				}
			}
		}
		for (int y = 0; y + 2 < LINES; y++) {	//überprüft die diagonale von links unten nach rechts oben
			for (int x = 0; x < ROWS; x++) {
				if (board[y+ 2][x] != "A" && board[y +2][x] == board[y + 1][x + 1] && board[y + 1][x + 1] == board[y][x + 2]) {
					win = true;
				}
			}
		}
		return win;
	}
	public Candidate freeField() {		// hiermit wird geschaut, ob ein Feld frei ist oder nicht.
		for (int y = 0; y < LINES; y++) {
			for (int x = 0; x < ROWS; x++) {
				if (board[y][x] != "X" && board[y][x] != "O") {
					Candidate x1 = new Candidate(y, x);		// wenn es ein freies Feld gibt, werden die y und x Kordinaten an Candidate weitergegeben.
					return x1;
				}
			}
		}
		return null;	//falls es kein freies Feld mehr gibt, wird "null" weitergegebne
	}
}
