package Pouvoirs;

public class Economistes {

	public Economistes(){
		super();
		this.nom = "Economiste";
		
	}
	
	int attaque(String type){
		if (type.equals("GE")){
			return 1;
		}
		else{
			return 0;
		}
	}
}
