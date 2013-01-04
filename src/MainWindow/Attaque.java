package MainWindow;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Joueur.joueurs_jeu;
import Map.Map;

public class Attaque {

	private MainWindow fen;
	private int ligne;
	private int colonne;
	
	public Attaque(MainWindow fenetre,int lignes,int colonnes){
		int ligne = lignes;
		int colonne = colonnes;
		this.fen = fenetre;
	// If a modifier a cause des bonus attaque et que se soit possible ou non 
	
	if(Map.getInstance().get_case(ligne, colonne).get_lock() == true){
		JOptionPane.showMessageDialog(fen,
			    "Case verouillée",
			    "Impossible",
			    JOptionPane.ERROR_MESSAGE);
	}
	else if(joueurs_jeu.getInstance().get_current_joueur().isPossible(ligne, colonne) == false){
		JOptionPane.showMessageDialog(fen,
			    "Vous n'avez pas accès à cette case",
			    "Impossible",
			    JOptionPane.ERROR_MESSAGE);
		
	}
	else{	

		ArrayList <Integer> values = new ArrayList<Integer>();
		
		for(int choix = 0 ; choix < joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots(); ++choix){
			values.add(choix+1);
		}
		
		Object s = JOptionPane.showInputDialog(
		                    fen,
		                    "Combien de boulots voulez vous mettre pour attaquer ?",
		                    "Attaque",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    values.toArray(),
		                    0);
		
		if(s==null){
			// CANCEL
		}
		else{
			// FAIRE L'ATTAQUE
			if(Map.getInstance().get_case(ligne, colonne).combat
					(Integer.parseInt(s.toString()), 
							joueurs_jeu.getInstance().get_current_joueur()) == false){
				JOptionPane.showMessageDialog(fen,
					    "Impossible",
					    "Vous ne gagnez pas",
					    JOptionPane.ERROR_MESSAGE);
			}
			else{
				
				// Attaque reussie
				// On met a jour la case
				fen.boutons[ligne][colonne].setText(fen.set_button(Map.getInstance().get_case(ligne, colonne)));
				//On met a jours les boulots
				joueurs_jeu.getInstance().get_current_joueur().get_perso().set_boulots(-Integer.parseInt(s.toString()));
				fen.set_Joueur();
				
			}
		}
		
	}
	
	}
	

	
	
	
}
