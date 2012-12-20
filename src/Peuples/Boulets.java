package Peuples;

/* Boulets : Pas de capacité, mais 8 de boulot */


public class Boulets extends Peuple{
	
	public Boulets(){
		super();
		this.nom = "Boulet";
		this.boulots = 8;
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