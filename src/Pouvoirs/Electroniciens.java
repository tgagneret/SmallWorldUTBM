package Pouvoirs;

public class Electroniciens extends Pouvoir{

	public Electroniciens(){
		super();
		this.nom = "Electronicien";
		
	}
	
	public int attaque(String type){
		if (type.equals("EL")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les EL";
	}
	
}
