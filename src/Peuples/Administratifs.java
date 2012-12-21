package Peuples;

/* Administratifs : Verrouille deux Uvs 
 * Pas de bonus attaque/defense
 */

public class Administratifs extends Peuple{
	
	public Administratifs(){
		super();
		this.nom = "Administratif";
		
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
