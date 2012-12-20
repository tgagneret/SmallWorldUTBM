package Pouvoirs;

public class Historiens {

	public Historiens(){
		super();
		this.nom = "Historien";
		
	}
	
	int attaque(String type){
		if (type.equals("HT")){
			return 1;
		}
		else{
			return 0;
		}
	}
}
