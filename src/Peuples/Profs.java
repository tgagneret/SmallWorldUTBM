package Peuples;

/* Profs 
 * Bonus +1 defense
 */

public class Profs extends Peuple{
	
	public Profs(){
		super();
		this.nom = "Prof";
	}

	int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}	
	boolean isPossible(int x, int y){
		/* CODE */
	}
}
