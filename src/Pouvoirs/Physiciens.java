package Pouvoirs;

public class Physiciens extends Pouvoir{


	public Physiciens(){
		super();
		this.nom = "Physicien";
		
	}
	
	public int attaque(String type){
		if (type.equals("PS")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
