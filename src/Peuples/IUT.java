package Peuples;

/* IUT : -1 pratique, +1 théorique (attaque) */

public class IUTs extends Peuple{
	
	public IUTs(){
		super();
		this.nom = "IUT";
		
	}

	public int attaque(int nbrBoulots){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots;
	}
	
	public boolean isPossible(int x , int y){
		/* CODE */
	}
	
}
