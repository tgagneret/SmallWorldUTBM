package MainWindow;

import javax.swing.JOptionPane;

import Joueur.*;

public class Window_Fin {

	
	public Window_Fin(){
		
		String result = "";
	
		for(Joueur gamer : Infos_jeu.getInstance().get_joueurs()){
			result += gamer.get_name() + ": " + gamer.calcul_fin() + "\n";
		}
		
		
		JOptionPane.showMessageDialog(null,
			    result,
			    "Fin de la partie : Score",
			    JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}
	
	
	
	
}
