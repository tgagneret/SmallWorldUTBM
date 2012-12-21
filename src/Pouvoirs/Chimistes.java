package Pouvoirs;

public class Chimistes extends Pouvoir{

	public Chimistes(){
		super();
		this.nom = "Chimiste";
		
	}
	
	int attaque(String type){
		if (type.equals("CM")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
