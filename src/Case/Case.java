package Case;
import Joueur.*;

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
		lock = false;
		
	}
	
	public Case() {
		nom = "Case vide";
		niveau = 0;
		type = "Case vide";
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
	}
	
	public String get_nom(){
		return nom;
	}
	
	public int get_niveau(){
		return niveau;
	}
	
	public String get_type(){
		return type;
	}
	
	public Joueur get_joueur(){
		return player;
	}
	
	public boolean get_lock(){
		return lock;
	}
	
	public boolean get_declin(){
		return declin;
	}
	
	public int get_boulots(){
		return boulots;
	}
	
	public boolean combat(int nbrBoulots, Joueur attaquant){
		/* CODE */
		
		if(player == null){
			set_Case(nbrBoulots,attaquant);
			return true;
		}
		else if(declin = true){
			if(attaquant.attaque(nbrBoulots, niveau,type,nom) > boulots){
				player.get_perso().set_boulots(boulots);
				// On met le nouveau joueur sur sa case
				set_Case(nbrBoulots,attaquant);
				return true;
			}
			else{
				return false;
			}
		}
		
		else{
			if(attaquant.attaque(nbrBoulots, niveau,type,nom) > player.defense(boulots) )
			{
				//On rend les jetons à l'ancien joueur
				player.get_perso().set_boulots(boulots);
				// On met le nouveau joueur sur sa case
				set_Case(nbrBoulots,attaquant);
				return true;
			}
			else{
				return false;
			}
		}
		
		

	}
	private void set_Case(int nbrBoulots, Joueur attaquant){
		player = attaquant;
		boulots = nbrBoulots;
		declin = false;
		lock = false;
	}
	
	/* Setters */
	
	public void setCase(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
		
	}
	
	public boolean is_present(Joueur gamer){
		
		if(player == null){
			return false;
		}
		else{
			
			if(player.get_name().equals(gamer.get_name())){
				return true;
			}
			else{
				return false;
			}
		}
		
	}
	
	public void add_boulots(int nbrBoulots){
			
			
			try{
			boulots+=nbrBoulots;
			player.get_perso().set_boulots(-nbrBoulots);
			
			}catch(NullPointerException e){
				
				System.out.println("Aucun joueur");
			}
		
	}
	
	public void vider(){
		
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
		
	}
	
	public void set_declin(){
		declin = true;
		boulots = 1;
	}
	
	public void set_lock(boolean locked){
		lock = locked;
	}
}
