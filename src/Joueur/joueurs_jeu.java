package Joueur;

import java.util.ArrayList;


public class joueurs_jeu {

	private volatile static joueurs_jeu single;
	private ArrayList <Joueur> joueurs_game = new ArrayList<Joueur>();
	private Joueur current_joueur = null;
	
	
	private joueurs_jeu(){
		
	}
	
	
	public static joueurs_jeu getInstance(){
	    if(single == null){
	      synchronized(joueurs_jeu.class){
	        if(single == null)
	          single = new joueurs_jeu();
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
		
		int current = joueurs_game.indexOf(current_joueur);
		
		if (current == joueurs_game.size() - 1){
			current_joueur = joueurs_game.get(0);
		}
		else{
			current_joueur = joueurs_game.get(current+1);
		}
	}
	
	
	/* Met le joueur 1 en tant que current_joueur */
	public void start(){
		
		current_joueur = joueurs_game.get(0);
		
	}
	
	
}
