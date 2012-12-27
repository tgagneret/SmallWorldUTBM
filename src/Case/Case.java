package Case;
import Joueur.Joueur;

public class Case {
	
	private String nom;
	private int niveau;
	private String type;
	private Joueur player;
	private int boulots;
	private boolean declin;
	private boolean lock; /* Administratifs verouille 2 UVs */
	
	/* Name : LO , Level : 43 , Kind : CS */
	
	public Case(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		
	}
	
	public Case() {
		nom = "Case vide";
		niveau = 0;
		type = "Case vide";
		player = null;
		boulots = -1;
		declin = false;
		lock = false;
	}
	
	public String get_nom(){
		return nom;
	}
	
	public int get_niveau(){
		return niveau;
	}
	
	public String get_tyoe(){
		return type;
	}
	
	public boolean combat(int nbrBoulots, Joueur attaquant){
		/* CODE */
	}
	
	
	/* Setters */
	
	public void setCase(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		
	}

}
