package MainWindow;
import Map.*;

import javax.swing.SwingUtilities;

public class Main {
	
	MainWindow fen;

	public static void main(String[] args) {
		
		//Map carte = new Map();
		//MainWindow fen = new MainWindow(carte);
		NbrJoueurs dia = new NbrJoueurs();
		
		
		//fen.afficher();
		dia.afficher();
		
	}
}