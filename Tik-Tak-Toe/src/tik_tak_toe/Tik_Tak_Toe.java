package tik_tak_toe;

public class Tik_Tak_Toe {

	public static void main(String[] args) {
		Board b1 = new Board();		//Hier mit erstelle ich ein neues Objekt (glaub ich)
		Game game = new Game();
		boolean playing = true, gameIsDone;
		String player, computer;
		
		while (playing) {
			player = "";
			computer = "";
			System.out.println("Willkommen bei Tik-Tak-Toe!");
			player = game.playerLetter(); //Der Player entscheidet X oder O
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
	
}
