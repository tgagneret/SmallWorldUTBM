package Peuples;
/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */

abstract class Peuple {
	
	private int boulots;
	private String nom;
	
	public Peuple(){
		
		boulots = 6;
		nom = ""; 
	}
		
	abstract int attaque(int nbrBoulots);
	
	abstract int defense(int nbrBoulots);
	
	abstract boolean isPossible(int x, int y);
			
}
