package Joueur;

public class Joueur {

	private int numero;
	private int credits;
	private Personnage perso;
	private Personnage perso_declin;
	private boolean declin;
	
	public Joueur(int number){
		numero = number;
		credits = 20;
		declin = false;
		perso = null;
		perso_declin = null;
		
	}
	
	public boolean choisir_perso(int numeroPerso){
		/* CODE */
	}
	
	public boolean passer_declin(){
		/* CODE */
	}
	
}
