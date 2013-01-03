package Peuples;

import Joueur.joueurs_jeu;
/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */
import Map.Map;

public abstract class Peuple {
	
	protected int boulots;
	protected String nom;
	
	public Peuple(){
		
		boulots = 6;
		nom = ""; 
	}
		
	/* Ou type = CS , EC ou TM */
	
	public String get_nom(){
		return nom;
	}
	
	public abstract int attaque(int nbrBoulots, int niveau , String type);
	
	public abstract int defense(int nbrBoulots);
	
	public abstract boolean isPossible(int x, int y);
	
	/* Donne la description du peuple (capacités) */
	public abstract String get_description();
	
	public int get_boulots(){
		
		return boulots;
	}
			
}
