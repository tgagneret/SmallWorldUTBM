package Pouvoirs;

public abstract class Pouvoir {

	protected String nom;
	protected String type;
	
	public Pouvoir(){
		
		nom = "";
		type = "";
	}
	
	public String get_nom(){
		return nom;
	}
	
	/* Ne prend que le type (pas besoin du nombre) */
	public abstract int attaque(String type);
}

