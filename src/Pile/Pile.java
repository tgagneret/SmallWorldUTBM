package Pile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import Personnage.*;
import Pouvoirs.*;
import Peuples.*;

public class Pile {

	/* Utilisation des ArrayList */
	
	private ArrayList <Personnage> disponible = new ArrayList<Personnage>();
	private ArrayList <Personnage>  en_jeu = new ArrayList<Personnage>();
	private ArrayList <Integer> credits = new ArrayList<Integer>();
	
	public Pile(){
			
		disponible = create();
		
		for(int i = 0 ; i < 11 ; ++i){
			credits.add(i);
		}

	}
	
	public ArrayList <Personnage> create(){
		
		ArrayList <Peuple> tab_peuples = new ArrayList<Peuple>();
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
	
	
	/*public boolean supprimer(int delete){
		// CODE 
	}
	
	public boolean ajouter(Personnage perso){
		// CODE
	}*/
	
}
