package Pouvoirs;

public class Electroniciens extends Pouvoir{

	public Electroniciens(){
		super();
		this.nom = "Electronicien";
		
	}
	
	int attaque(String type){
		if (type.equals("El")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
