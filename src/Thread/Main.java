package Thread;
import Map.*;

import javax.swing.SwingUtilities;

public class Main {
	

	public static void main(String[] args) {
		
		Map carte = new Map();
		
		Window fenetre = new Window(carte);

		fenetre.run();

		
	}
}
