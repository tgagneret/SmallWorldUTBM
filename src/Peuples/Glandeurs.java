package Peuples;


/* Glandeurs : Convertit un de boulot de l'ennemi par tour
 * Pas de bonus attaque/defense
 */

public class Glandeurs extends Peuple{
	
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
	
	public boolean isPossible(int x , int y){
		/* CODE */
	}
	
	public String get_description(){
		return "";
	}
	
}