package Joueur;
import java.util.ArrayList;

import Personnage.Personnage;
import Map.*;
import Pile.*;

public class Joueur {

	private int numero;
	private String nom;
	private int credits;
	private Personnage perso;
	private Personnage perso_declin;
	private boolean declin;
	
	public Joueur(){
		numero = 0;
		nom = "";
		credits = 20;
		declin = false;
		perso = null;
		perso_declin = null;
	}
	
	public Joueur(int number,String name){
		numero = number;
		nom = name;
		credits = 20;
		declin = false;
		perso = null;
		perso_declin = null;
		
	}
	
	public boolean choisir_perso(int numeroPerso){
		if(numeroPerso > credits){
			return false;
		}
		else{
			
			credits -= numeroPerso;
			credits += Pile.getInstance().get_credits(numeroPerso);
			perso = Pile.getInstance().set_Personnage(numeroPerso); // recopie ?
			
			return true;
		}
		
		
	}
	
	public void passer_declin(){
		perso_declin = new Personnage(perso);
	}
	
	public boolean is_declin(){
		if(perso_declin == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isPossible(int x, int y){
		
		// CODE 	
	}
	
	public void add_credits(int nbrCredits){
		credits += nbrCredits;
	}
	
	public void set_personnage(Personnage personnage){
		perso = personnage;//Peut etre recopie necessaire
	}
	
	public String get_name(){
		return nom;
	}
	
	public int get_credits(){
		return credits;
	}
	
	public Personnage get_perso(){
		return perso;		
	}
	
	public Personnage get_perso_declin(){
		return perso_declin;
	}
	
	public ArrayList <String> get_Cases(){
		
		ArrayList <String> gamer_cases = new ArrayList<String>();
		
		for(int lignes = 0; lignes < 4 ; ++lignes){
			for(int colonnes = 0; colonnes < 4 ; ++colonnes){
				
				if(Map.getInstance().get_case(lignes, colonnes).is_present(this) && Map.getInstance().get_case(lignes, colonnes).get_declin() == false){
					gamer_cases.add(Map.getInstance().get_case(lignes, colonnes).get_nom());
				}
			}
			
		}
		
		return gamer_cases;
		
		}
}
