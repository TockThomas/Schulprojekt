package tik_tak_toe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	String playerLetter, computerLetter, turn;
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
//			System.out.println(player);
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
//		System.out.println(randomNum);
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

}
