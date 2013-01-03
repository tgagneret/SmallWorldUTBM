package Peuples;

import Joueur.joueurs_jeu;
import Map.Map;


/* Alcooliques : Ne peut capturer que les cases après celles qui sont adjacentes 
 * Pas de bonus Attaque/Défense
 */

public class Alcooliques extends Peuple{
	
	public Alcooliques(){
	
		super();
		this.nom = "Alcoolique";
		
	}
	
	public int attaque(int nbrBoulots, int niveau , String type){
		
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossible(int x , int y){
		//Vérification que les coordonnées envoyées sont correctes
		if (x<0 || x>5 || y<0 || y>3)
			{
				return false;
			}
		if (Map.getInstance().is_present(joueurs_jeu.getInstance().get_current_joueur())) //Vérifie que le joueur est présent sur la carte
			{
				//Vérifie que le joueur en cours possède des cases adjacentes aux cases adjacentes
				if (x-2>=0 && y-2>=0 && Map.getInstance().get_case(x-2, y-2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-2>=0 && y-1>=0 && Map.getInstance().get_case(x-2, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-2>=0 && Map.getInstance().get_case(x-2, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-2>=0 && y+1<=3 && Map.getInstance().get_case(x-2, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-2>=0 && y+2<=3 && Map.getInstance().get_case(x-2, y+2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-1>=0 && y+2<=3 && Map.getInstance().get_case(x-1, y+2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (y+2<=3 && Map.getInstance().get_case(x, y+2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+1<=5 && y+2<=3 && Map.getInstance().get_case(x+1, y+2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+2<=5 && y+2<=3 && Map.getInstance().get_case(x+2, y+2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+2<=5 && y+1<=3 && Map.getInstance().get_case(x+2, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+2<=5 && Map.getInstance().get_case(x+2, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+2<=5 && y-1>=0 && Map.getInstance().get_case(x+2, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+2<=5 && y-2>=0 && Map.getInstance().get_case(x+2, y-2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x+1<=5 && y-2>=0 && Map.getInstance().get_case(x+1, y-2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (y-2>=0 && Map.getInstance().get_case(x, y-2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
				if (x-1>=0 && y-2>=0 && Map.getInstance().get_case(x-1, y-2).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
					{
						return true;
					}
			}
			else //Sinon, vérifie que le joueur a bien séléctionné une case qui se trouve au bord de la carte
			{
				if (x==0 || y==0 || x==5 || y==3)
					{
						return true;
					}
			}


		
		return false;
	}
	
	public String get_description(){
		return "L'alcoolique ne peut capturer que les cases après celles qui sont adjacentes";
	}
	
}
