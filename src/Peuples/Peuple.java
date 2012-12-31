package Peuples;
/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */

public abstract class Peuple {
	
	protected int boulots;
	protected String nom;
	
	public Peuple(){
		
		boulots = 6;
		nom = ""; 
	}
		
	/* Ou type = CS , EC ou TM */
	
	public abstract int attaque(int nbrBoulots, int niveau , String type);
	
	public abstract int defense(int nbrBoulots);
	
	public abstract boolean isPossible(int x, int y);
	
	public int get_boulots(){
		
		return boulots;
	}
			
}
