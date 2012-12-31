package Thread;
import java.util.ArrayList;

import Map.*;
import Peuples.*;
import MainWindow.*;

import javax.swing.SwingUtilities;

public class Main {
	
	
	
	public static void main(String[] args) {
			
		//Map carte;// = new Map();
		
		Window fenetre = new Window();
		fenetre.run();
		
		NbrJoueurs joueurs = new NbrJoueurs();
		ArrayList <String> gamers = new ArrayList<String>();
		
		joueurs.afficher();
		gamers = joueurs.return_player();
		
		System.out.println("---test---");
		
		for(String  value : gamers){
			System.out.println(value);
		}
		
		
		
	}
}
