package Signaux;
import java.awt.event.*;
import javax.swing.*;
import Map.*;
import Joueur.Infos_jeu;
import MainWindow.*;

public class Case_clicked implements ActionListener { 
	
	private MainWindow fen;
	private int ligne;
	private int colonne;
	
	public Case_clicked(MainWindow fenetre,int x,int y){
	fen = fenetre;
		
	ligne = x;
	colonne = y;
	
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		if(fen.get_mode()){
			if(Map.getInstance().get_case(ligne, colonne).get_joueur() == null ||
					Map.getInstance().get_case(ligne, colonne).get_joueur().get_name()
					.equals(Infos_jeu.getInstance().get_current_joueur().get_name()) == false){
			JOptionPane.showMessageDialog(fen,
				    "Cette case ne vous appartient pas !!",
				    "Impossible",
				    JOptionPane.ERROR_MESSAGE);
			}
			else{
				if(Map.getInstance().get_case(ligne, colonne).get_declin()){
					JOptionPane.showMessageDialog(fen,
						    "Case en mode déclin",
						    "Impossible",
						    JOptionPane.ERROR_MESSAGE);
				}
				else{
					Organize organise = new Organize(fen,ligne,colonne);
				}
			}
			
		}
		else{
			if(Map.getInstance().get_case(ligne, colonne).get_joueur() == null || 
					Map.getInstance().get_case(ligne, colonne).get_joueur().get_name()
					.equals(Infos_jeu.getInstance().get_current_joueur().get_name()) == false){
				Attaque attaque = new Attaque(fen,ligne,colonne);
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
