package Peuples;

/* TC 5 : Capture plus facilement les XX1X et XX2X, mais ne peut pas capturer les autres
 * Pas de bonus attaque/defense
 */


public class TC5 extends Peuple{
	
	public TC5(){
		super();
		this.nom = "TC5";
		
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

}

