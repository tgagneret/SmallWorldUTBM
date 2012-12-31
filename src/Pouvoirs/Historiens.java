package Pouvoirs;

public class Historiens extends Pouvoir {

	public Historiens(){
		super();
		this.nom = "Historien";
		
	}
	
	public int attaque(String type){
		if (type.equals("HT")){
			return 1;
		}
		else{
			return 0;
		}
	}
}
