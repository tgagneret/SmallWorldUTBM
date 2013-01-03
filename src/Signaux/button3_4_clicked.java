package Signaux;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Map.*;
import Joueur.joueurs_jeu;
import Personnage.Personnage;
import MainWindow.*;

public class button3_4_clicked implements ActionListener { 
	
	MainWindow fen;
	
	public button3_4_clicked(MainWindow fenetre){
	fen = fenetre;
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		if(fen.get_mode()){
			if(Map.getInstance().get_case(3, 4).get_joueur() == null ||
					Map.getInstance().get_case(3, 4).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
			JOptionPane.showMessageDialog(fen,
				    "Cette case ne vous appartient pas !",
				    "Impossible",
				    JOptionPane.ERROR_MESSAGE);
			}
			else{
				Organize organise = new Organize(fen,3,4);
			}
			
		}
		else{
			if(Map.getInstance().get_case(3, 4).get_joueur() == null || 
					Map.getInstance().get_case(3, 4).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
				Attaque attaque = new Attaque(fen,3,4);
			}
			else{
			JOptionPane.showMessageDialog(fen,
				    "Cette case vous appartient !",
				    "Impossible",
				    JOptionPane.ERROR_MESSAGE);
			}
		}
		
	} 
}
