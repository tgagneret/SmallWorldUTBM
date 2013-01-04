package Thread;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Joueur.*;
import MainWindow.*;
import java.lang.Thread;

public class Jeu extends Thread{
	
	Window fen = new Window();
	
	public Jeu(){

	}
	
	public void run(){

		fen.run();
		
		for(int nbrTour = 0 ; nbrTour < 10 ; ++nbrTour){
			for(Joueur gamer : joueurs_jeu.getInstance().get_joueurs()){
				
				joueurs_jeu.getInstance().set_current_joueur(gamer);
				fen.get_Window().set_Joueur();
				
				fen.get_Window().lock_buttons(false);
				if(fen.get_Window().get_answer("Passer en mode déclin ?") == false){
					fen.get_Window().lock_buttons(true);
					
					while(fen.get_Window().get_answer("Avez vous fini d'attaquer ?") == false){}
					
					if(joueurs_jeu.getInstance().get_current_joueur().get_perso().get_peuple().get_nom().equals("Administratif")){
						Lock verrouille = new Lock();
						verrouille.afficher();
					}
					
					fen.get_Window().lock_buttons(false);
					
					if(fen.get_Window().get_answer("Voulez vous réorganiser vos boulots ?") == true){
						
						fen.get_Window().lock_buttons(true);
						fen.get_Window().set_mode(true);
						
						while(fen.get_Window().get_answer("Avez vous fini votre tour ?") == false){}
						
						fen.get_Window().set_mode(false);
						
					}
					
					
					
					
				}
				else{
					joueurs_jeu.getInstance().get_current_joueur().passer_declin();
					Window_Pile pile = new Window_Pile();
					pile.afficher();
					while(gamer.get_perso() == null){
						try{
							Thread.sleep(100);
						}
						catch(InterruptedException e){
							System.out.println("InterruptedException caught"); 
						}
					}
					fen.get_Window().set_Joueur();
					fen.get_Window().update_buttons();
					
				}
				
				
				
				
				
				
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
}
