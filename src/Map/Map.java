package Map;

import Case.*;
import Joueur.*;


public class Map {

	private volatile static Map single;
	private Case[][] tabCase = new Case [4][6];
	
	
	
	private Map(){
		
		 /* Modele : Case(String name, int level , String kind)
		  * Exemple LO43 : LO (nom) , 43 (niveau) , TM (type)
		  */
		
		/* On créé les 24 cases : Nom ajouté à l'odt */
		
		
		tabCase[0][0] = new Case("LO", 22, "TM");
		tabCase[0][1] = new Case("CM", 22, "CS");
		tabCase[0][2] = new Case("PM", 11, "TM");
		tabCase[0][3] = new Case("MG", 00, "CG");
		tabCase[0][4] = new Case("TN", 21, "TM");
		tabCase[0][5] = new Case("LE", 03, "CG");
		
		tabCase[1][0] = new Case("MT", 12, "CS");
		tabCase[1][1] = new Case("PS", 42, "CS");
		tabCase[1][2] = new Case("MG", 07, "CG");
		tabCase[1][3] = new Case("EL", 42, "TM");
		tabCase[1][4] = new Case("PM", 18, "TM");
		tabCase[1][5] = new Case("PS", 22, "CS");
			
		tabCase[2][0] = new Case("CM", 11, "CS");
		tabCase[2][1] = new Case("MT", 45, "CS");
		tabCase[2][2] = new Case("LO", 43, "TM");
		tabCase[2][3] = new Case("LE", 07, "CG");
		tabCase[2][4] = new Case("TN", 51, "TM");
		tabCase[2][5] = new Case("GE", 01, "CG");
		
		tabCase[3][0] = new Case("HT", 01, "CG");
		tabCase[3][1] = new Case("GE", 06, "CG");
		tabCase[3][2] = new Case("PH", 01, "CG");
		tabCase[3][3] = new Case("EL", 21, "TM");
		tabCase[3][4] = new Case("HT", 07, "CG");
		tabCase[3][5] = new Case("PH", 04, "CG");

		}
		
	
	public static Map getInstance(){
	    if(single == null){
	      synchronized(Map.class){
	        if(single == null)
	          single = new Map();
	      }
	    }      
	    return single;
	  }
	
	
		public Case get_case(int ligne, int colonne){
			return tabCase[ligne][colonne];
		}
	
		public String get_nom(int ligne, int colonne){
			return tabCase[ligne][colonne].get_nom();
		}
	
		public int get_niveau(int ligne, int colonne){
			return tabCase[ligne][colonne].get_niveau();
		}
	
		public String get_type(int ligne, int colonne){
			return tabCase[ligne][colonne].get_type();
		}
		
		/* Fonction qui renvoie true si le joueur est sur la Map (et pas en declin) */
		
		public boolean is_present(Joueur gamer){
			
			for(int lignes = 0; lignes < 4 ; ++lignes){
				for(int colonnes = 0; colonnes < 6 ; ++colonnes){
					
					if(tabCase[lignes][colonnes].is_present(gamer) && tabCase[lignes][colonnes].get_declin() == false){
						return true;
					}
				}
				
			}
			
			return false;
		}
		
		public Case return_case(String nom, int niveau){
			
			for(int lignes = 0; lignes < 4 ; ++lignes){
				for(int colonnes = 0; colonnes < 6 ; ++colonnes){
					if(tabCase[lignes][colonnes].get_nom().equals(nom) &&
							tabCase[lignes][colonnes].get_niveau() == niveau){
						return tabCase[lignes][colonnes];
					}
				}
			}
		
			return null;
		}
		
		public void unlock(){
			for(int lignes = 0; lignes < 4 ; ++lignes){
				for(int colonnes = 0; colonnes < 6 ; ++colonnes){
					
					tabCase[lignes][colonnes].set_lock(false);
				}
			}
		}
		
		public void already_declin(Joueur gamer){
	
			for(int lignes = 0; lignes < 4 ; ++lignes){
				for(int colonnes = 0; colonnes < 6 ; ++colonnes){
						
					if(tabCase[lignes][colonnes].get_joueur() != null &&
							gamer.get_name().equals(tabCase[lignes][colonnes].get_joueur().get_name()) 
							&& tabCase[lignes][colonnes].get_declin()){
						tabCase[lignes][colonnes].vider();
					}
				}
			}
			
		}
}
	
	
