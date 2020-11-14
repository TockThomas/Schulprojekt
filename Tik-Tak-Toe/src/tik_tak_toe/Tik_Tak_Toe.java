package tik_tak_toe;

public class Tik_Tak_Toe {

	public static void main(String[] args) {
		Board b1 = new Board();		//Hier mit erstelle ich ein neues Objekt (glaub ich)
		Game game = new Game();
		boolean playing = true, gameIsDone;
		String player, computer, turn;
		System.out.println("Willkommen bei Tik-Tak-Toe!");
		
		while (playing) {
			player = "";
			computer = "";
			player = game.playerLetter(); //Der Player entscheidet X oder O und speichert es in var player
			computer = game.computerLetter(); //Trägt X oder O für KI ein
			turn = game.whoBegins();//Methode, wer zufällig anfängt
			gameIsDone = false;
			while (gameIsDone == false) { //Spiel beginnt
				if (turn == player){//if, wenn Person dran ist
					b1.print();
					//weitere Befehle
					turn = game.changeTurn(); //Wechselt, wer dran ist
				} else if (turn == computer) {//if, wenn computer dran ist
					b1.print();	
					//weitere Befehle
					turn = game.changeTurn(); //Wechselt, wer dran ist
				}
//				if (Hier sollte dein Überprüfen Methode sein) {//if, Spiel zu ende, wird "gameIsDone" auf true gelegt.
//					gameIsDone = true;					
//				}
			}
			playing = game.askForPlaying();//Methode, um nachzufragen, ob man nochmal spielen will (ändert den var "playing"
		}
			
	}
	
}
