package Personnage;
import Etudiants.Etudiant;
import Pouvoirs.Pouvoir;

public class Personnage {
	
	
	private Etudiant peup;
	private Pouvoir pouv;
	private int boulots;
	
	public Personnage(){
		
		peup = null;
		pouv = null;
		boulots = 0;
	}
	
	public Personnage(Personnage perso){
		
		peup = perso.get_peuple();
		pouv = perso.get_pouvoir();
		boulots = perso.get_boulots();
		
	}
	
	
	public Personnage(Etudiant newPeup, Pouvoir newPouv){

		peup = newPeup;
		pouv = newPouv;
		boulots = peup.get_boulots();
		
	}
	
	
	public Etudiant get_peuple(){
		return peup;
	}
	
	public Pouvoir get_pouvoir(){
		return pouv;
	}
	
	public int get_boulots(){
		return boulots;
	}
	/* Exemple LO43 : LO (nom) , 43 (niveau) , TM (type) */
	
	/* Retourne le nombre de boulots pour une attaque (rajoute bonus) */
	public int attaque(int nbrBoulots,int niveau , String type , String nom){
		
		return (pouv.attaque(nom) + peup.attaque(nbrBoulots,niveau,type));
	}
	
	/* Retourne le nombre de boulots pour une defense (rajoute bonus) */
	public int defense (int nbrBoulots){
		return peup.defense(nbrBoulots);
	}
	
	/* Regarde si c'est possible d'attaque une case (oui : renvoie 1,  0 sinon) */
	public boolean isPossible(int x , int y){
		return peup.isPossible(x, y);
	}
	
	public String get_name(){
		return peup.get_nom() + " " + pouv.get_nom();
	}
	
	/* Ajoute des boulots au personnage */
	public void set_boulots(int nbrBoulots){
		
		boulots += nbrBoulots;
		
	}
		
	
	
	

}
