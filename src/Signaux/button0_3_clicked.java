package Signaux;
import java.awt.event.*;
import javax.swing.*;

import Map.*;
import Joueur.joueurs_jeu;
import MainWindow.*;

public class button0_3_clicked implements ActionListener { 
	
	MainWindow fen;
	
	public button0_3_clicked(MainWindow fenetre){
	fen = fenetre;
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		if(fen.get_mode()){
			if(Map.getInstance().get_case(0, 3).get_joueur() == null ||
					Map.getInstance().get_case(0, 3).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
			JOptionPane.showMessageDialog(fen,
				    "Cette case ne vous appartient pas !",
				    "Impossible",
				    JOptionPane.ERROR_MESSAGE);
			}
			else{
				if(Map.getInstance().get_case(0, 0).get_declin()){
					JOptionPane.showMessageDialog(fen,
						    "Case en mode déclin",
						    "Impossible",
						    JOptionPane.ERROR_MESSAGE);
				}
				else{
					Organize organise = new Organize(fen,0,0);
				}
			}
			
		}
		else{
			if(Map.getInstance().get_case(0, 3).get_joueur() == null || 
					Map.getInstance().get_case(0, 3).get_joueur().get_name()
					.equals(joueurs_jeu.getInstance().get_current_joueur().get_name()) == false){
				Attaque attaque = new Attaque(fen,0,3);
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
