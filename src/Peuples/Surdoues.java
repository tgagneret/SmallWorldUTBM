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

	public boolean isPossible(int x , int y){
		//Vérification que les coordonnées envoyées sont correctes
		if (x<0 || x>5 || y<0 || y>3)
			{
				return false;
			}
		
		if (is_present(joueurs_jeu.getInstance().get_current_joueur()))
			{
						//Vérification des cases adjacentes
						//Vérification que la ligne au dessus de la case appartient toujours à la carte
						if (y-1>=0)
							{
								if (Map.getInstance().get_case(x, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur()) //Vérifie si la case au dessus de celle à attaquer appartient à l'attaquant
									{
										return true; //Renvoie true si c'est le cas
									}
								if (x-1>=0) //Vérifie que la colonne à gauche de la case à attaquer appartient toujours à la carte
									{
										if (Map.getInstance().get_case(x-1, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() || Map.getInstance().get_case(x-1, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur()) //Vérifie que la case en haut à gauche, ou à gauche de la case attaquée, appartiennent à l'attaquant
											{
												return true; //Renvoie true si c'est le cas
											}
										if (y+1<=3 && (Map.getInstance().get_case(x-1, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur() || Map.getInstance().get_case(x, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur()) ) //Vérifie que la case en bas à gauche, ou en dessous de la case attaquée, appartiennent à l'attaquant
											{
												return true; //Renvoie true si c'est le cas
											}
									}
							}

						//Vérifie que la colonne à gauche de la case à attaquer appartient bien à la carte
						if (x+1<=5)
							{
								if (Map.getInstance().get_case(x+1, y).get_joueur() == joueurs_jeu.getInstance().get_current_joueur()) //Vérifie si la case à droite de celle attaquée appartient à l'attaquant
									{
										return true; //Renvoie true si c'est le cas
									}
								if (y+1<=3) //Revérifie que la ligne en dessous de la case attaquée est dans la map
									{
										if (Map.getInstance().get_case(x+1, y+1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
											{
												return true;
											}
									}
								if (y-1>=0) //Revérifie que la ligne au dessus de la case attaquée est dans la map
									{
										if (Map.getInstance().get_case(x+1, y-1).get_joueur() == joueurs_jeu.getInstance().get_current_joueur())
											{
												return true;
											}
									}
							}
						

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
	}
	
	public String get_description(){
		return "Le surdoué peut capturer parmi les adjacentes et les adjacentes aux adjacentes";
	}

}
