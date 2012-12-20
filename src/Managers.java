
public class Managers {


	public Managers(){
		super();
		this.nom = "Manager";
		
	}
	
	int attaque(String type){
		if (type.equals("MG")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}
