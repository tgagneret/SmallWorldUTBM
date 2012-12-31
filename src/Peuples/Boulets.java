package Peuples;

/* Boulets : Pas de capacité, mais 8 de boulot */


public class Boulets extends Peuple{
	
	public Boulets(){
		super();
		this.nom = "Boulet";
		this.boulots += 2;
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
		return "";
	}

}