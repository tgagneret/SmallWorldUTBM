package Pouvoirs;

public class Economistes extends Pouvoir{

	public Economistes(){
		super();
		this.nom = "Economiste";
		
	}
	
	public int attaque(String type){
		if (type.equals("GE")){
			return 1;
		}
		else{
			return 0;
		}
	}
}
