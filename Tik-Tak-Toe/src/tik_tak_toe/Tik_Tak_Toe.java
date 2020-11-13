package tik_tak_toe;

import java.util.Scanner;

public class Tik_Tak_Toe {

	public static void main(String[] args) {
		Board b1 = new Board();		//Hier mit erstelle ich ein neues Objekt (glaub ich)
		boolean playing = true, gameIsDone;
		String player, computer;
		
		while (playing) {
			player = "";
			computer = "";
			System.out.println("Willkommen bei Tik-Tak-Toe!");
			player = playerLetter(); //Der Player entscheidet X oder O
			//Methode, damit der Computer sich für das Gegenteil entscheidet
			//Methode, wer zufällig anfängt
			gameIsDone = false;
			while (gameIsDone = false) {
				//if, wenn Person dran ist
					//Befehle folgen noch...
				//if, wenn computer dran ist
					//Befehle folgen noch...
				//if, Spiel zu ende, wird "gameIsDone" auf true gelegt.
			}
			//Methode, um nachzufragen, ob man nochmal spielen will (ändert den var "playing"
		}
		b1.print();			//hier mit gebe ich das board b1 aus		
	}
	
	public static String playerLetter() {	//Methode, damit der Player sich zwischen X oder O entscheidet
		String player = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nMöchten Sie 'X' oder 'O' sein?");
		while (true) {
			player = scanner.next();
//			System.out.println(player);
			if (player.equals("X") || player.equals("x")) {
				player = "X";
				break;
			} else if (player.equals("O") || player.equals("o") || player.equals("0")) {
				player = "O";
				break;
			} else {
				System.out.println("Geben Sie eine gültige Antwort.");
			}
		}
		return player;
	}
}
