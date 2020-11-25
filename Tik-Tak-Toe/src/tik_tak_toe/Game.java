package tik_tak_toe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
//	Candidate check = ;
	String playerLetter, computerLetter, turn, endInput, userInput, xstring;
	int x, y;
	boolean end;
	Scanner scanner = new Scanner(System.in);
	
	public Game() {
		this.playerLetter = "";
		this.computerLetter = "";
		this.turn = "";
	}
	
	public String playerLetter() {	//Methode, damit der Player sich zwischen X oder O entscheidet
		System.out.println("\nMöchten Sie 'X' oder 'O' sein?");
		while (true) {
			playerLetter = scanner.next();
			if (playerLetter.equals("X") || playerLetter.equals("x")) {
				playerLetter = "X";
				break;
			} else if (playerLetter.equals("O") || playerLetter.equals("o") || playerLetter.equals("0")) {
				playerLetter = "O";
				break;
			} else {
				System.out.println("Geben Sie eine gültige Antwort ein.");
			}
		}

		return playerLetter;
	}
	
	public String computerLetter(){
		if (playerLetter == "X") {
			computerLetter = "O";
			return computerLetter;
		} else {
			computerLetter = "X";
			return computerLetter;
		}
	}
	
	public String whoBegins() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		if (randomNum == 1) {
			turn = playerLetter;
		} else {
			turn = computerLetter;
		}
		return turn;
	}
	
	public String changeTurn() {
		if (turn == "X") {
			turn = "O";
		} else {
			turn = "X";
		}
		return turn;
	}
	
	public boolean askForPlaying() {
		System.out.println("\nWillst du nochmal Spielen?\nJ oder N?");
		while (true) {
			endInput = scanner.next();
			if (endInput.equals("J") || endInput.equals("j")) {
				end = true;
				break;
			} else if (endInput.equals("N") || endInput.equals("n")) {
				end = false;
				break;
			} else {
				System.out.println("Geben Sie eine gültige Antwort ein.");
			}
		}
		return end;
	}
	
	public int[] playerturn() {
		System.out.print("\n\nSie sind dran! Wo möchten Sie es platzieren (1-9): ");
		userInput = "0";
		while (true) {
			userInput = scanner.next();
			if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5") || userInput.equals("6") || userInput.equals("7") || userInput.equals("8") || userInput.equals("9")) {
				break;
			} else {
				System.out.println("Geben Sie eine gültige Antwort ein.");
			}
			
		}
		if (userInput.equals("1")) {
			return new int[] {1, 3};
		} else if (userInput.equals("2")) {
			return new int[] {2, 3};
		} else if (userInput.equals("3")) {
			return new int[] {3, 3};
		} else if (userInput.equals("4")) {
			return new int[] {1, 2};
		} else if (userInput.equals("5")) {
			return new int[] {2, 2};
		} else if (userInput.equals("6")) {
			return new int[] {3, 2};
		} else if (userInput.equals("7")) {
			return new int[] {1, 1};
		} else if (userInput.equals("8")) {
			return new int[] {2, 1};
		} else {
			return new int[] {3, 1};
		}
	}

}
