package Pouvoirs;

public class Bilingues extends Pouvoir{

	public Bilingues(){
		super();
		this.nom = "Bilingue";
		
	}
	
	int attaque(String type){
		if (type.equals("LE")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
