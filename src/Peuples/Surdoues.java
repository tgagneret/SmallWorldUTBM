package Peuples;

import Joueur.joueurs_jeu;
import Map.Map;

/* Surdoués : Peut capturer parmi les adjacentes et les adjacentes aux adjacentes
 * Pas de bonus attaque/defense
 */

public class Surdoues extends Peuple{
	
	public Surdoues(){
		super();
		this.nom = "Surdoué";
		
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossible(int x, int y) {
		//Vérification que les coordonnées envoyées sont correctes
		if (x<0 || x>3 || y<0 || y>5)
		{
			return false;
		}
		else if(Map.getInstance().is_present(joueurs_jeu.getInstance().get_current_joueur()) == false && (x == 0 || x == 3 || y == 0 || y == 5)){
			return true;
		}
		else{			
				for(int ligne_autour = -2; ligne_autour <= 2 ; ++ligne_autour){
					if(x + ligne_autour >= 0 && x + ligne_autour < 4){
						for(int colonne_autour = -2; colonne_autour <= 2 ; ++colonne_autour){
							if(y + colonne_autour >= 0 && y + colonne_autour < 6){
								if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur() != null){
									if(ligne_autour *  ligne_autour + colonne_autour * colonne_autour <= 4 &&
											Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur().get_name()
											.equals(joueurs_jeu.getInstance().get_current_joueur().get_name())){
										return true;
								}
							}
						}
					}
					
				}
				
			}
		
			
		return false;	
		}
		
		
	}
	
	public String get_description(){
		return "Le surdoué peut capturer parmi les adjacentes et les adjacentes aux adjacentes";
	}

}
