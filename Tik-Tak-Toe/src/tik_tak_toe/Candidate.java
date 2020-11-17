package tik_tak_toe;

public class Candidate {
	private int row;
	private int line;
	
	public Candidate(int x, int y) {		// hier lege ich Dandidate fest, in dem die Kordinaten gespeichert sind
		this.row = x;
		this.line = y;
	}
// durch die "geter" und "seter" können die Werte von Candidate in allen Classen abgerufen werden.
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}
}
