package Peuples;
import Map.*;

/* Administratifs : Verrouille deux Uvs 
 * Pas de bonus attaque/defense
 */

public class Administratifs extends Peuple{
	
	public Administratifs(){
		super();
		this.nom = "Administratif";
		
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
		return "L'administratif peut verouiller 2 UVs";
	}
	

}
