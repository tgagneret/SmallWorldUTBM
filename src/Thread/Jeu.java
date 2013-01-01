package Thread;

import Joueur.*;
import MainWindow.MainWindow;

public class Jeu extends Thread{
	
	Window fen = new Window();
	
	public Jeu(){

	}
	
	public void run(){

		fen.run();
		
		for(int nbrTour = 0 ; nbrTour < 10 ; ++nbrTour){
			for(Joueur gamer : joueurs_jeu.getInstance().get_joueurs()){
				
				
				fen.get_Window().lock_buttons(false);
				if(fen.get_Window().get_answer("Passer en mode déclin ?")){
					
				}
				else{
					fen.get_Window().lock_buttons(true);
				}
				
				
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
}
