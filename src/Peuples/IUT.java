package Peuples;

import Joueur.joueurs_jeu;
import Map.Map;

/* IUT : -1 pratique, +1 théorique (attaque) */

public class IUT extends Peuple{
	
	public IUT(){
		super();
		this.nom = "IUTien";
		
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		if(type.equals("CS")){
			return nbrBoulots - 1;
		}
		else if(type.equals("TM")){
			return nbrBoulots + 1;
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
		else if(Map.getInstance().is_present(joueurs_jeu.getInstance().get_current_joueur()) == false && (x == 0 || x == 3 || y == 0 || y == 5)){
			System.out.println("ok");
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
		return "-1 CS, +1 TM (attaque)";
	}
	
}
