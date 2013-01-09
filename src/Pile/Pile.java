package Pile;
import java.util.ArrayList;
import java.util.Collections;

import Etudiant.*;
import Personnage.*;
import Pouvoirs.*;

public class Pile {

	/* Utilisation des ArrayList */
	
	private volatile static Pile single;
	
	private ArrayList <Personnage> disponible = new ArrayList<Personnage>();
	private ArrayList <Personnage>  en_jeu = new ArrayList<Personnage>();
	private ArrayList <Integer> credits = new ArrayList<Integer>();
	
	private Pile(){
			
		disponible = create();
		
		for(int i = 0 ; i < disponible.size(); ++i){
			credits.add(0);
		}

	}
	
	public static Pile getInstance(){
	    if(single == null){
	      synchronized(Pile.class){
	        if(single == null)
	          single = new Pile();
	      }
	    }      
	    return single;
	  }
	
	
	public ArrayList <Personnage> create(){
		
		ArrayList <Etudiant> tab_peuples = new ArrayList<Etudiant>();
		ArrayList <Pouvoir> tab_pouvoirs = new ArrayList<Pouvoir>();
		
		tab_peuples.add(new Administratifs());
		tab_peuples.add(new Alcooliques());
		tab_peuples.add(new Boulets());
		tab_peuples.add(new Glandeurs());
		tab_peuples.add(new IUT());
		tab_peuples.add(new Profs());
		tab_peuples.add(new Surdoues());
		tab_peuples.add(new TC5());
		tab_peuples.add(new Thesards());
		tab_peuples.add(new Tricheurs());
		
		
		tab_pouvoirs.add(new Bilingues());
		tab_pouvoirs.add(new Chimistes());
		tab_pouvoirs.add(new Economistes());
		tab_pouvoirs.add(new Electroniciens());
		tab_pouvoirs.add(new Historiens());
		tab_pouvoirs.add(new Informaticiens());
		tab_pouvoirs.add(new Managers());
		tab_pouvoirs.add(new Matheux());
		tab_pouvoirs.add(new Mecaniciens());
		tab_pouvoirs.add(new Philosophes());
		tab_pouvoirs.add(new Physiciens());
		
		/* On mélange les listes */
		
		Collections.shuffle(tab_peuples);
		Collections.shuffle(tab_pouvoirs);
		
		/* On créé des persos aléatoires */
		
		ArrayList <Personnage> perso = new ArrayList<Personnage>();
		
		for(int i = 0 ; i < 10 ; ++i){
			perso.add(new Personnage(tab_peuples.get(i),tab_pouvoirs.get(i)));
		}
		
		return perso;
		
	}
	
	
	public Personnage get_Personnage(int indice){
		return disponible.get(indice);
	}
	
	public int get_credit(int indice){
		return credits.get(indice);
	}
	
	/* Passe un personnage de disponible à en jeu (attention suppresion des credits associé */
	
	public void supprimer(int delete){
		Personnage perso = new Personnage(disponible.get(delete));
		
		disponible.remove(delete);
		credits.remove(delete);
		en_jeu.add(perso);
		
		for(int credit = 0 ; credit < delete; ++credit){
			credits.set(credit, credits.get(credit) + 1);
		}
		
		credits.add(0);
		
	}
	
	// Permet de passer un personnage en_jeu a disponible
	
	public boolean ajouter(Personnage perso){
		Personnage person = new Personnage(perso);
		
		for(int value = 0 ; value < en_jeu.size() ; ++value){
			if(en_jeu.get(value).get_name().equals(perso.get_name())){
				en_jeu.remove(value);
				disponible.add(person);
				return true;
			}
		}
		return false;
	}
	
	
	/* Renvoie le personnage à l'indice indice et le passe dans les personnages en jeu */
	public Personnage set_Personnage(int indice){
		
		Personnage perso = new Personnage(disponible.get(indice));
		supprimer(indice);
		
		return perso;
		
	}
	
	public int get_size(){
		
		return disponible.size();
		
	}
	
}
