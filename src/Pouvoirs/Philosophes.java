package Pouvoirs;

public class Philosophes extends Pouvoir{

	public Philosophes(){
		super();
		this.nom = "Philosophe";
		
	}
	
	public int attaque(String type){
		if (type.equals("PH")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
