package Peuples;

/* Surdoués : Peut capturer parmi les adjacentes et les adjacentes aux adjacentes
 * Pas de bonus attaque/defense
 */

public class Surdoues extends Peuple{
	
	public Surdoues(){
		super();
		this.nom = "Surdoués";
		
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

