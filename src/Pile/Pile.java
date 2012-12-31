package Pile;
import java.util.ArrayList;
import Personnage.*;
import Pouvoirs.*;
import Peuples.*;

public class Pile {

	/* Utilisation des ArrayList */
	
	private ArrayList <Personnage> disponible = new ArrayList<Personnage>();
	private ArrayList <Personnage>  en_jeu = new ArrayList<Personnage>();
	private ArrayList <Integer> credits = new ArrayList<Integer>();
	
	public Pile(){
			
		/* Peuples */
		
				
		/*Administratifs administratif = new Administratifs();
		Alcooliques alcoolique = new Alcooliques();
		Boulets boulet = new Boulets();
		Glandeurs glandeur = new Glandeurs();
		IUTs iut = new IUTs();
		Profs prof = new Profs();
		Surdoues surdoue = new Surdoues();
		TC5 tc5 = new TC5();
		Thesards thesard = new Thesards();
		Tricheurs tricheur = new Tricheurs();*/	
		
		/* Pouvoirs */
		
		/*Bilingues bilingue = new Bilingues();
		Chimistes chimiste = new Chimistes();
		Economistes economiste = new Economistes();
		Electroniciens elctronicien = new Electroniciens();
		Historiens historien = new Historiens();
		Informaticiens informaticien = new Informaticiens();
		Managers manager = new Managers();
		Matheux matheux = new Matheux();
		Mecaniciens mecanicien = new Mecaniciens();
		Philosophes philosophe = new Philosophes();
		Physiciens physicien = new Physiciens();*/
		
		
		
		
		/* Personnages */
		

	}
	
	public ArrayList <Personnage> create(){
		
		Peuple[] tab_peuple = new Peuple[10];
		
		tab_peuple[0] = new Administratifs();
		tab_peuple[1] = new Alcooliques();
		tab_peuple[2] = new Boulets();
		tab_peuple[3] = new Glandeurs();
		tab_peuple[4] = new IUTs();
		tab_peuple[5] = new Profs();
		tab_peuple[6] = new Surdoues();
		tab_peuple[7] = new TC5();
		tab_peuple[8] = new Thesards();
		tab_peuple[9] = new Tricheurs();
		
		Pouvoir[] tab_pouvoir = new Pouvoir[11];
		
		tab_pouvoir[0] = new Bilingues();
		tab_pouvoir[1] = new Chimistes();
		tab_pouvoir[2] = new Economistes();
		tab_pouvoir[3] = new Electroniciens();
		tab_pouvoir[4] = new Historiens();
		tab_pouvoir[5] = new Informaticiens();
		tab_pouvoir[6] = new Managers();
		tab_pouvoir[7] = new Matheux();
		tab_pouvoir[8] = new Mecaniciens();
		tab_pouvoir[9] = new Philosophes();
		tab_pouvoir[10] = new Physiciens();
		
		
		/* Melanger pour faire les persos */
		
	}
	
	
	
	public boolean supprimer(int delete){
		/* CODE */
	}
	
	public boolean ajouter(Personnage perso){
		/* CODE */
	}
	
}
