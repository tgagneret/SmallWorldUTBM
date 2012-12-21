package Peuples;
/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */

abstract class Peuple {
	
	protected int boulots;
	protected String nom;
	
	public Peuple(){
		
		boulots = 6;
		nom = ""; 
	}
		
	/* Ou type = CS , EC ou TM */
	
	abstract int attaque(int nbrBoulots, int niveau , String type);
	
	abstract int defense(int nbrBoulots);
	
	abstract boolean isPossible(int x, int y);
	
	int get_boulots(){
		
		return boulots;
	}
			
}
