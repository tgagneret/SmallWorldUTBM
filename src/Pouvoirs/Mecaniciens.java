package Pouvoirs;

public class Mecaniciens extends Pouvoir{

	public Mecaniciens(){
		super();
		this.nom = "Mécanicien";
		
	}
	
	int attaque(String type){
		if (type.equals("TN")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
