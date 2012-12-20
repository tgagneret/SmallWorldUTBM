package Peuples;



/* Tricheurs
 * Bonus +1 attaque
 */

public class Tricheurs extends Peuple{
	
	public Tricheurs(){
		super();
		this.nom = "Tricheurs";
	}
	
	int attaque(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x, int y){
		/* CODE */
	}
	
}

