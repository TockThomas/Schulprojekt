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
			computer = game.computerLetter(); //Tr�gt X oder O f�r KI ein
			turn = game.whoBegins();//Methode, wer zuf�llig anf�ngt
			gameIsDone = false;
			while (gameIsDone == false) {
				if (turn == player){//if, wenn Person dran ist
					//Befehle folgen noch...
					turn = game.changeTurn();
				} else if (turn == computer) {//if, wenn computer dran ist
					//Befehle folgen noch...
					turn = game.changeTurn();
				}
//				if (Hier sollte dein �berpr�fen Methode sein) {//if, Spiel zu ende, wird "gameIsDone" auf true gelegt.
//					gameIsDone = true;					
//				}
				System.out.println(turn);
			}
			//Methode, um nachzufragen, ob man nochmal spielen will (�ndert den var "playing"
		}
		b1.print();			//hier mit gebe ich das board b1 aus		
	}
	
}
