package Pouvoirs;

public class Matheux extends Pouvoir{

	public Matheux(){
		super();
		this.nom = "Matheux";
		
	}
	
	public int attaque(String type){
		if (type.equals("MT")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les MT";
	}
}
