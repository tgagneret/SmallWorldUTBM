package Peuples;

/* Profs 
 * Bonus +1 defense
 */

public class Profs extends Peuple{
	
	public Profs(){
		super();
		this.nom = "Prof";
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}	
	public boolean isPossible(int x, int y){
		/* CODE */
	}
}
