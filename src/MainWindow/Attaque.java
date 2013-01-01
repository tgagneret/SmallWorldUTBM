package MainWindow;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Joueur.joueurs_jeu;
import Map.Map;

public class Attaque {

JButton bouton;
	
	public Attaque(JButton bout){
		this.bouton = bout;
	// If a modifier a cause des bonus attaque
	if(Map.getInstance().get_case(0, 0).get_boulots() < joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots()){
		
		Object[] possible;
		Integer[] values = new Integer[joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots() + 1];

		
		for(int choix = 0 ; choix <= joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots(); ++choix){
			values[choix] = choix;
		}
		
		possible = values;
		//JOptionPane boite = new JOptionPane();
		Object s = JOptionPane.showInputDialog(
		                    bouton,
		                    "Combien de boulots voulez vous mettre pour attaquer ?",
		                    "Attaque",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    possible,
		                    0);
		System.out.println(s);
		
		if(s==null){
			// CANCEL
		}
		else{
			// FAIRE L'ATTAQUE
		}
		
		
	}
	else{
		JOptionPane.showMessageDialog(bouton,
			    "Impossible",
			    "Vous n'avez pas assez de jetons pour attaquer",
			    JOptionPane.ERROR_MESSAGE);
	}
	
	}
	

	
	
	
}
