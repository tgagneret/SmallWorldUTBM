package Pouvoirs;

public class Matheux extends Pouvoir{

	public Matheux(){
		super();
		this.nom = "Matheux";
		
	}
	
	int attaque(String type){
		if (type.equals("MT")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
