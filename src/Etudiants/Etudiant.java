package Etudiants;

/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */

public abstract class Etudiant {
	
	protected int boulots;
	protected String nom;
	
	public Etudiant(){
		
		boulots = 6;
		nom = ""; 
	}
		
	/* Ou type = CS , EC ou TM */
	
	public String get_nom(){
		return nom;
	}
	
	public abstract int attaque(int nbrBoulots, int niveau , String type);
	
	public abstract int defense(int nbrBoulots);
	
	public abstract boolean isPossible(int x, int y);
	
	/* Donne la description du peuple (capacités) */
	public abstract String get_description();
	
	public int get_boulots(){
		
		return boulots;
	}
			
}
