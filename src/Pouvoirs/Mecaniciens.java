package Pouvoirs;

public class Mecaniciens extends Pouvoir{

	public Mecaniciens(){
		super();
		this.nom = "Mécanicien";
		
	}
	
	public int attaque(String type){
		if (type.equals("TN")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les TN";
	}
	
}
