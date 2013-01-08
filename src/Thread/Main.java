package Thread;
import java.util.ArrayList;

import Etudiants.*;
import Joueur.*;
import Map.*;
import MainWindow.NbrJoueurs;
import MainWindow.Window_Pile;
import Pile.*;

import javax.swing.SwingUtilities;


public class Main {
	
	public static void main(String[] args) {
				
		NbrJoueurs joueurs = new NbrJoueurs();
		Window_Pile pile = new Window_Pile();
		Jeu play = new Jeu();
		
		joueurs.afficher();
		while(Infos_jeu.getInstance().is_set() == false){
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException caught"); 
			}
		}
		
		Infos_jeu.getInstance().start();
		
		for(Joueur gamer : Infos_jeu.getInstance().get_joueurs()){
			pile.afficher();
			
			while(gamer.get_perso() == null){
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					System.out.println("InterruptedException caught"); 
				}
			}
			Infos_jeu.getInstance().next();
			
		}
		
		play.start();
		
		
		
		
	}
}
