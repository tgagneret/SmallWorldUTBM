package Thread;

import Joueur.*;
import MainWindow.MainWindow;
import MainWindow.NbrJoueurs;
import Map.*;
import MainWindow.*;

public class Window extends Thread{

	NbrJoueurs joueurs = new NbrJoueurs();
	Window_Pile pile = new Window_Pile();
	//MainWindow fen = new MainWindow();
	
	Jeu jouer = new Jeu();
	
	
	public Window(){
		
	}
	
	public void run(){
		joueurs.afficher();
		while(joueurs_jeu.getInstance().is_set() == false){
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException caught"); 
			}
		}
		
		joueurs_jeu.getInstance().start();
		
		for(Joueur gamer : joueurs_jeu.getInstance().get_joueurs()){
			pile.afficher();
			while(gamer == joueurs_jeu.getInstance().get_current_joueur()){
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					System.out.println("InterruptedException caught"); 
				}
			}
			
		}
		
		
		MainWindow.getInstance().afficher();
		MainWindow.getInstance().set_Joueur();
		
		
		
		
		
	}
	
	
}
