package Personnage;
import Peuples.Peuple;
import Pouvoirs.Pouvoir;

public class Personnage {
	
	
	private Peuple peup;
	private Pouvoir pouv;
	private int boulots;
	
	public Personnage(Peuple newPeup, Pouvoir newPouv){

		peup = newPeup;
		pouv = newPouv;
		boulots = peup.get_boulots();
		
	}
	
	/* Exemple LO43 : LO (nom) , 43 (niveau) , TM (type) */
	
	int attaque(int nbrBoulots,int niveau , String type , String nom){
		/* CODE */
	}
	
	int defense (int nbrBoulots){
		/* CODE */
	}
	
	boolean isPossible(int x , int y){
		/* CODE */
	}

}
