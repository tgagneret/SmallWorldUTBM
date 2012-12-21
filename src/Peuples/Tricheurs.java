package Peuples;



/* Tricheurs : Moins nombreux (4)
 * Bonus +1 attaque
 */

public class Tricheurs extends Peuple{
	
	public Tricheurs(){
		super();
		this.nom = "Tricheurs";
		this.boulots -= 2;
	}
	
	int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots + 1;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x, int y){
		/* CODE */
	}
	
}

