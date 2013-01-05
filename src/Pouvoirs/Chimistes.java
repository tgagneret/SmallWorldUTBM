package Pouvoirs;

public class Chimistes extends Pouvoir{

	public Chimistes(){
		super();
		this.nom = "Chimiste";
		
	}
	
	public int attaque(String type){
		if (type.equals("CM")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String get_description(){
		return "+1 Attaque sur les CM";
	}
	
}
