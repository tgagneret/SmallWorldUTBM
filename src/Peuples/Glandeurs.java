package Peuples;


/* Glandeurs : Convertit un de boulot de l'ennemi par tour
 * Pas de bonus attaque/defense
 */

public class Glandeurs extends Peuple{
	
	public Glandeurs(){
		super();
		this.nom = "Glandeurs";
		
	}

	int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}
	
}