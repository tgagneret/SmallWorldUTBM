package Peuples;

import Joueur.joueurs_jeu;
import Map.Map;

/* TC 5 : Capture plus facilement les XX1X et XX2X, mais ne peut pas capturer les autres
 * Pas de bonus attaque/defense
 */


public class TC5 extends Peuple{
	
	public TC5(){
		super();
		this.nom = "TC5";
		
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		if (niveau - 20 < 10){
			return nbrBoulots + 1;
		}
		else if (niveau -40 < 2){
			return nbrBoulots;
		}
		else{
			return nbrBoulots;
		}
		
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	
	public boolean isPossible(int x, int y) {
		if (x<0 || x>3 || y<0 || y>5)
		{
			return false;
		}
		else if(Map.getInstance().get_case(x, y).get_niveau()>30){
			return false;
		}
		else if(Map.getInstance().is_present(joueurs_jeu.getInstance().get_current_joueur()) == false && x == 0 || x == 3 || y == 0 || y == 5){
			return true;
		}
		else{			
				for(int ligne_autour = -1; ligne_autour <= 1 ; ++ligne_autour){
					if(x + ligne_autour >= 0 && x + ligne_autour < 4){
						for(int colonne_autour = -1; colonne_autour <= 1 ; ++colonne_autour){
							if(y + colonne_autour >= 0 && y + colonne_autour < 6){
								if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur() != null){
									if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur().get_name()
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
		return "";
	}

}

