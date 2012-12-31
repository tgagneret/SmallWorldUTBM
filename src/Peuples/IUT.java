package Peuples;

/* IUT : -1 pratique, +1 théorique (attaque) */

public class IUT extends Peuple{
	
	public IUT(){
		super();
		this.nom = "IUTien";
		
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
