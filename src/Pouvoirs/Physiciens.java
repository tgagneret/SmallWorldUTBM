package Pouvoirs;

public class Physiciens extends Pouvoir{


	public Physiciens(){
		super();
		this.nom = "Physicien";
		
	}
	
	int attaque(String type){
		if (type.equals("PS")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}