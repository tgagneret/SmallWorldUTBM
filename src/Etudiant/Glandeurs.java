package Etudiant;

import Joueur.Infos_jeu;
import Map.Map;


/* Glandeurs : Convertit un de boulot de l'ennemi par tour
 * Pas de bonus attaque/defense
 */

public class Glandeurs extends Etudiant{
	
	public Glandeurs(){
		super();
		this.nom = "Glandeur";
		
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossible(int x, int y) {
		if (x<0 || x>3 || y<0 || y>5)
		{
			return false;
		}
		else if(x == 0 || x == 3 || y == 0 || y == 5){
			return true;
		}
		else{			
				for(int ligne_autour = -1; ligne_autour <= 1 ; ++ligne_autour){
					if(x + ligne_autour >= 0 && x + ligne_autour < 4){
						for(int colonne_autour = -1; colonne_autour <= 1 ; ++colonne_autour){
							if(y + colonne_autour >= 0 && y + colonne_autour < 6){
								if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur() != null){
									if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur().get_name()
											.equals(Infos_jeu.getInstance().get_current_joueur().get_name())){
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
		return "Peut acceder aux bords du plateau en permanence";
	}
	
}