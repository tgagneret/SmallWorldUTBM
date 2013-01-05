package Pouvoirs;

public class Managers extends Pouvoir{


	public Managers(){
		super();
		this.nom = "Manager";
		
	}
	
	public int attaque(String type){
		if (type.equals("MG")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les MG";
	}
	
}
