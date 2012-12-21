package Case;

public class Case {
	
	private String nom;
	private int niveau;
	private String type;
	private Joueur player;
	private int boulots;
	private boolean declin;
	
	public Case(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		
	}
	
	public boolean combat(int nbrBoulots, Joueur attaquant){
		/* CODE */
	}
	
	

}
