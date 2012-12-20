package Pouvoirs;

public abstract class Pouvoir {

	private String nom;
	private String type;
	
	public Pouvoir(){
		
		nom = "";
		type = "";
	}
	
	/* Ne prend que le type (pas besoin du nombre) */
	abstract int attaque(String type);
}

