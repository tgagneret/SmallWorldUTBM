package Signaux;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Map.*;
import Joueur.joueurs_jeu;
import Personnage.Personnage;
import MainWindow.*;

public class button2_1_clicked implements ActionListener { 
	
	MainWindow fen;
	
	public button2_1_clicked(MainWindow fenetre){
	fen = fenetre;
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		if(fen.get_mode()){
			if(Map.getInstance().get_case(2, 1).get_joueur() == null ||
					Map.getInstance().get_case(2, 1).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
			JOptionPane.showMessageDialog(fen,
				    "Cette case ne vous appartient pas !",
				    "Impossible",
				    JOptionPane.ERROR_MESSAGE);
			}
			else{
				Organize organise = new Organize(fen,2,1);
			}
			
		}
		else{
			if(Map.getInstance().get_case(2, 1).get_joueur() == null || 
					Map.getInstance().get_case(2, 1).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
				Attaque attaque = new Attaque(fen,2,1);
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
