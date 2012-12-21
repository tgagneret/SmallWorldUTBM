package Peuples;

/* Alcooliques : Ne peut capturer que les cases après celles qui sont adjacentes 
 * Pas de bonus Attaque/Défense
 */

public class Alcooliques extends Peuple{
	
	public Alcooliques(){
	
		super();
		this.nom = "Alcoolique";
		
	}
	
	int attaque(int nbrBoulots, int niveau , String type){
		
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return 0;
	}
	
	boolean isPossible(int x , int y){
		
		
	/* CODE */
		
	}
	
}
