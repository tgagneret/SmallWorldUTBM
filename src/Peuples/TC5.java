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
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossibleUV(int x, int y) {
		int level = Map.getInstance().get_case(x, y).get_niveau();
		if (level%10==0 || level%10==1 || level%10==2)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	
	public boolean isPossible(int x , int y){
		//Vérification que les coordonnées envoyées sont correctes
		if (x<0 || x>5 || y<0 || y>3)
			{
				return false;
			}
		
		if (is_present(joueurs_jeu.getInstance().get_current_joueur()))
			{
				//Vérification que la ligne au dessus de la case appartient toujours à la carte
				if (y-1>=0)
					{
						if (Map.getInstance().get_case(x, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x, y-1)) //Vérifie si la case au dessus de celle à attaquer appartient à l'attaquant
							{
								return true; //Renvoie true si c'est le cas
							}
						if (x-1>=0) //Vérifie que la colonne à gauche de la case à attaquer appartient toujours à la carte
							{
								if ((Map.getInstance().get_case(x-1, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x-1, y-1)) || (Map.getInstance().get_case(x-1, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x-1, y))) //Vérifie que la case en haut à gauche, ou à gauche de la case attaquée, appartiennent à l'attaquant
									{
										return true; //Renvoie true si c'est le cas
									}
								if (y+1<=3 && ((Map.getInstance().get_case(x-1, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x-1, y+1)) || (Map.getInstance().get_case(x, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x, y+1)))) //Vérifie que la case en bas à gauche, ou en dessous de la case attaquée, appartiennent à l'attaquant
									{
										return true; //Renvoie true si c'est le cas
									}
							}
					}
					//Vérifie que la colonne à gauche de la case à attaquer appartient bien à la carte
				if (x+1<=5)
					{
						if (Map.getInstance().get_case(x+1, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x+1, y)) //Vérifie si la case à droite de celle attaquée appartient à l'attaquant
							{
								return true; //Renvoie true si c'est le cas
							}
						if (y+1<=3) //Revérifie que la ligne en dessous de la case attaquée est dans la map
							{
								if (Map.getInstance().get_case(x+1, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x+1, y+1))
									{
										return true;
									}
							}
						if (y-1>=0) //Revérifie que la ligne au dessus de la case attaquée est dans la map
							{
								if (Map.getInstance().get_case(x+1, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() && isPossibleUV(x+1, y-1))
									{
										return true;
									}
							}
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
		return "";
	}

}

