/* Les noms de classes (des peuples) prendront un s pour pouvoir appeler ls variable sans s . 
 * Ex : Alcooliques Alcoolique = new Alcooliques()
 */

/* Classe Peuple */
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

/* Classes Filles */

/* Alcooliques : Ne peut capturer que les cases après celles qui sont adjacentes 
 * Pas de bonus Attaque/Défense
 */

public class Alcooliques extends Peuple{
	
	public Alcooliques(){
	
		super();
		this.nom = "Alcoolique";
		
	}
	
	int attaque(int nbrBoulots){
		
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return 0;
	}
	
	boolean isPossible(int x , int y){
		
	/* CODE */
		
	}
	
}

/* Profs 
 * Bonus +1 defense
 */

public class Profs extends Peuple{
	
	public Profs(){
		super();
		this.nom = "Prof";
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	boolean isPossible(int x, int y){
		/* CODE */
	}
}

/* Tricheurs
 * Bonus +1 attaque
 */

public class Tricheurs extends Peuple{
	
	public Tricheurs(){
		super();
		this.nom = "Tricheurs";
	}
	
	int attaque(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x, int y){
		/* CODE */
	}
	
}

/* Surdoués : Peut capturer parmi les adjacentes et les adjacentes aux adjacentes
 * Pas de bonus attaque/defense
 */

public class Surdoues extends Peuple{
	
	public Surdoues(){
		super();
		this.nom = "Surdoués";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}

	boolean isPossible(int x , int y){
		/* CODE */
	}

}

/* Boulets : Pas de capacité, mais 8 de boulot */


public class Boulets extends Peuple{
	
	public Boulets(){
		super();
		this.nom = "Boulet";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}

}

/* Administratifs : Verrouille deux Uvs 
 * Pas de bonus attaque/defense
 */

public class Administratifs extends Peuple{
	
	public Administratifs(){
		super();
		this.nom = "Administratif";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}

}

/* TC 5 : Capture plus facilement les XX1X et XX2X, mais ne peut pas capturer les autres
 * Pas de bonus attaque/defense
 */


public class TC5 extends Peuple{
	
	public TC5(){
		super();
		this.nom = "TC5";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}

}

/* IUT : -1 pratique, +1 théorique (attaque) */

public class IUT extends Peuple{
	
	public IUT(){
		super();
		this.nom = "IUT";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}
	
}

/* Glandeurs : Convertit un de boulot de l'ennemi par tour
 * Pas de bonus attaque/defense
 */

public class Glandeurs extends Peuple{
	
	public Glandeurs(){
		super();
		this.nom = "Glandeurs";
		
	}

	int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}
	
}