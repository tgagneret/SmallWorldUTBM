package Peuples;



/* Tricheurs : Moins nombreux (4)
 * Bonus +1 attaque
 */

public class Tricheurs extends Peuple{
	
	public Tricheurs(){
		super();
		this.nom = "Tricheur";
		this.boulots -= 2;
	}
	
	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots + 1;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossible(int x, int y){
		/* CODE */
	}
	
	public String get_description(){
		return "";
	}
	
}

