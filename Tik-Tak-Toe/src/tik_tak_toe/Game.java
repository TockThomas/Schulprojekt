package tik_tak_toe;

import java.util.Scanner;

public class Game {
	String playerLetter, computerLetter;
	
	public Game() {
		this.playerLetter = "";
		this.computerLetter = "";
	}
	
	public String playerLetter() {	//Methode, damit der Player sich zwischen X oder O entscheidet
		String playerLetter = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nMöchten Sie 'X' oder 'O' sein?");
		while (true) {
			playerLetter = scanner.next();
//			System.out.println(player);
			if (playerLetter.equals("X") || playerLetter.equals("x")) {
				playerLetter = "X";
				break;
			} else if (playerLetter.equals("O") || playerLetter.equals("o") || playerLetter.equals("0")) {
				playerLetter = "O";
				break;
			} else {
				System.out.println("Geben Sie eine gültige Antwort.");
			}
		}
		return playerLetter;
	}

}
