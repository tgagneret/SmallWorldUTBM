package Pouvoirs;

/* Informaticiens : LO */

public class Informaticiens extends Pouvoir{
	
	public Informaticiens(){
		super();
		this.nom = "Informaticien";
		
	}
	
	public int attaque(String type){
		if (type.equals("LO")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les LO";
	}
	
	
}
