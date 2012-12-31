package Thread;
import java.util.ArrayList;

import Map.*;
import Peuples.*;
import MainWindow.*;
import Pile.*;

import javax.swing.SwingUtilities;

public class Main {
	
	
	
	public static void main(String[] args) {
			
		
		Pile laPile = new Pile();
		Window_Pile pile = new Window_Pile(laPile);
				
		
		NbrJoueurs joueurs = new NbrJoueurs();
		ArrayList <String> gamers = new ArrayList<String>();
		
		joueurs.afficher();
		gamers = joueurs.return_player();
		
		Window fenetre = new Window();
		fenetre.run();
		
		
		
	}
}
