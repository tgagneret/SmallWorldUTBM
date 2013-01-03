package Thread;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Joueur.*;
import MainWindow.*;

public class Jeu extends Thread{
	
	Window fen = new Window();
	
	public Jeu(){

	}
	
	public void run(){

		fen.run();
		
		for(int nbrTour = 0 ; nbrTour < 10 ; ++nbrTour){
			for(Joueur gamer : joueurs_jeu.getInstance().get_joueurs()){
				
				
				fen.get_Window().lock_buttons(false);
				if(fen.get_Window().get_answer("Passer en mode déclin ?") == false){
					fen.get_Window().lock_buttons(true);
				}
				if(fen.get_Window().get_answer("Avez vous fini d'attaquer ?")){
						
				}
				Lock test = new Lock();
				test.afficher();
				
				
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
}
