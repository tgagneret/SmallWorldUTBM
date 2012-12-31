package Pouvoirs;

public class Bilingues extends Pouvoir{

	public Bilingues(){
		super();
		this.nom = "Bilingue";
		
	}
	
	public int attaque(String type){
		if (type.equals("LE")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
