package Peuples;

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
		
		/* CODE */
	}
	
	public String get_description(){
		return "Le surdoué peut capturer parmi les adjacentes et les adjacentes aux adjacentes";
	}

}

