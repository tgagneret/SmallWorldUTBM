package Peuples;

 /* Construit des projets (+1 def) */


public class Thesards extends Peuple{

	public Thesards(){
		super();
		this.nom = "Thésard";
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	public boolean isPossible(int x , int y){
		/* CODE */
	}
	
	public String get_description(){
		return "";
	}
	
}
