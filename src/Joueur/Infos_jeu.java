package Joueur;

import java.util.ArrayList;


public class Infos_jeu {

	private volatile static Infos_jeu single;
	private ArrayList <Joueur> joueurs_game = new ArrayList<Joueur>();
	private Joueur current_joueur = null;
	private int tour = 1;
	
	
	private Infos_jeu(){
		
	}
	
	
	public static Infos_jeu getInstance(){
	    if(single == null){
	      synchronized(Infos_jeu.class){
	        if(single == null)
	          single = new Infos_jeu();
	      }
	    }      
	    return single;
	  }
	
	public void set_joueur(String nom,int number){
			joueurs_game.add(new Joueur(number,nom));
		
		
	}
	
	public void clear(){
		joueurs_game.clear();
	}
	
	public void set_current_joueur(Joueur joueur){
		current_joueur = joueur;
	}
	
	public Joueur get_current_joueur(){
		return current_joueur;
	}
	
	public ArrayList <Joueur> get_joueurs(){
		return joueurs_game;
	}
	
	public int get_nbrJoueur(){
		return joueurs_game.size();
	}
	
	public boolean is_set(){
		if(joueurs_game.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}
	
	/* Change le joueur devant jouer au siuvant */
	public void next(){
		int current = 0;
		
		try{
			current = joueurs_game.indexOf(current_joueur);
			
			if (current == joueurs_game.size() - 1){
				current_joueur = joueurs_game.get(0);
			}
			else{
				current_joueur = joueurs_game.get(current+1);
			}
			
		}catch(NullPointerException e){
				
			System.out.println("Aucun joueur en train de jouer");
		}
		
		
		
	}
	
	public int get_tour(){
		return tour;
	}
	
	
	/* Met le joueur 1 en tant que current_joueur */
	public void start(){
		tour = 1;
		current_joueur = joueurs_game.get(0);
		
	}
	
	public void tour_suivant(){
		tour+=1;
	}
	
	
}
