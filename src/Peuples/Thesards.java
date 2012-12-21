package Peuples;

 /* Construit des projets (+1 def) */


public class Thesards extends Peuple{

	public Thesards(){
		super();
		this.nom = "Thésard";
	}

	int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}
	
}
