package Peuples;

/* IUT : -1 pratique, +1 théorique (attaque) */

public class IUTs extends Peuple{
	
	public IUTs(){
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
