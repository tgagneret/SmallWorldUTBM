package Peuples;


/* Alcooliques : Ne peut capturer que les cases après celles qui sont adjacentes 
 * Pas de bonus Attaque/Défense
 */

public class Alcooliques extends Peuple{
	
	public Alcooliques(){
	
		super();
		this.nom = "Alcoolique";
		
	}
	
	public int attaque(int nbrBoulots, int niveau , String type){
		
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return 0;
	}
	
	public boolean isPossible(int x , int y){
		
	/* CODE */
		
	}
	
	public String get_description(){
		return "L'alcoolique ne peut capturer que les cases après celles qui sont adjacentes";
";
	}
	
}
