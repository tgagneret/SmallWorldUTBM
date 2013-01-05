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
			credits += Pile.getInstance().get_credit(numeroPerso);
			perso = new Personnage (Pile.getInstance().set_Personnage(numeroPerso));
			
			return true;
		}
		
		
	}
	
	public void passer_declin(){
		if(perso_declin == null){
			
			perso_declin = new Personnage(perso);
			perso = null;
			
			push_declin();
			
		}
		else{
			
			Pile.getInstance().ajouter(perso_declin);
			perso_declin = new Personnage(perso);
			perso = null;
			
			push_declin();
			
		}
		
		
		
	}
	
	public boolean is_declin(){
		if(perso_declin == null){
			return false;
		}
		else{
			return true;
		}
	}
	
	public int attaque(int nbrBoulots,int niveau , String type , String nom){
		return perso.attaque(nbrBoulots, niveau, type, nom);
	}
	
	public int defense (int nbrBoulots){
		return perso.defense(nbrBoulots);
	}
	
	public boolean isPossible(int x, int y){
		return perso.isPossible(x, y);	
	}
	
	public void add_credits(int nbrCredits){
		credits += nbrCredits;
	}
	
	public void set_personnage(Personnage personnage){
		perso = new Personnage(personnage);
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
			for(int colonnes = 0; colonnes < 6 ; ++colonnes){
				
				if(Map.getInstance().get_case(lignes, colonnes).is_present(this) && Map.getInstance().get_case(lignes, colonnes).get_declin() == false){
					gamer_cases.add(Map.getInstance().get_case(lignes, colonnes).get_nom() + String.valueOf(Map.getInstance().get_case(lignes, colonnes).get_niveau()));
				}
			}
			
		}
		
		return gamer_cases;
		
	}
	
	public void push_declin(){
		
		for(int lignes = 0; lignes < 4 ; ++lignes){
			for(int colonnes = 0; colonnes < 6 ; ++colonnes){
				
				if(Map.getInstance().get_case(lignes, colonnes).is_present(this)){
					Map.getInstance().get_case(lignes, colonnes).set_declin();
				}
				
			}
		}
		
		
	}
	
	public void retirer_declin(){
		
		for(int lignes = 0; lignes < 4 ; ++lignes){
			for(int colonnes = 0; colonnes < 6 ; ++colonnes){
				
				if(Map.getInstance().get_case(lignes, colonnes).is_present(this) && Map.getInstance().get_case(lignes, colonnes).get_declin()){
					Map.getInstance().get_case(lignes, colonnes).vider();
				}
				
			}
		}
		
	}
	
	public int calcul_fin(){
		
		int total = credits;
		
		for(int lignes = 0; lignes < 4 ; ++lignes){
			for(int colonnes = 0; colonnes < 6 ; ++colonnes){
				if(Map.getInstance().get_case(lignes, colonnes).is_present(this)){
					
					total+=1;
					
				}
			}
		}
		
		return total;
		
	}
	
}
