package Map;
import Case.Case;


public class Map {

	Case[][] tabCase = new Case [4][6];

	public Map(){
		
		 /* Modele : Case(String name, int level , String kind)
		  * Exemple LO43 : LO (nom) , 43 (niveau) , TM (type)
		  */
		
		/* On créé les 24 cases : Nom ajouté à l'odt */
		
		
		/* Première ligne */
		tabCase[0][0].setCase("LO", 22, "TM");
		tabCase[0][1].setCase("CM", 22, "CS");
		tabCase[0][2].setCase("PM", 11, "TM");
		tabCase[0][3].setCase("MG", 00, "CG");
		tabCase[0][4].setCase("TN", 21, "TM");
		tabCase[0][5].setCase("LE", 03, "CG");
		
		/* Deuxième ligne */
		tabCase[1][0].setCase("MT", 12, "CS");
		tabCase[1][1].setCase("PS", 42, "CS");
		tabCase[1][2].setCase("MG", 07, "CG");
		tabCase[1][3].setCase("EL", 42, "TM");
		tabCase[1][4].setCase("PM", 18, "TM");
		tabCase[1][5].setCase("PS", 22, "CS");
		
		/* Troisième ligne */
		tabCase[2][0].setCase("CM", 11, "CS");
		tabCase[2][1].setCase("MT", 45, "CS");
		tabCase[2][2].setCase("LO", 43, "TM");
		tabCase[2][3].setCase("LE", 07, "CG");
		tabCase[2][4].setCase("TN", 51, "TM");
		tabCase[2][5].setCase("GE", 01, "CG");
		
		/* Quatrième ligne */
		tabCase[3][0].setCase("HT", 01, "CG");
		tabCase[3][1].setCase("GE", 06, "CG");
		tabCase[3][2].setCase("PH", 01, "CG");
		tabCase[3][3].setCase("EL", 21, "TM");
		tabCase[3][4].setCase("HT", 07, "CG");
		tabCase[3][5].setCase("PH", 04, "CG");
		
	}
	
	
}
