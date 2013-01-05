package Signaux;
import java.awt.event.*;
import java.awt.*;
import Pile.*;
import javax.swing.*;


public class More_button_clicked implements ActionListener { 
	
	JDialog fen;
	private int indice;
	
	
	public More_button_clicked(JDialog fenetre, int i){
	fen = fenetre;
	indice = i;
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		String infos = Pile.getInstance().get_Personnage(indice).get_boulots() + " boulots\n" +
				Pile.getInstance().get_Personnage(indice).get_peuple().get_description() + "\n" + 
				Pile.getInstance().get_Personnage(indice).get_pouvoir().get_description();
		
		JOptionPane.showMessageDialog(fen,
			    infos,
			    Pile.getInstance().get_Personnage(indice).get_name(),
			    JOptionPane.INFORMATION_MESSAGE);
		
		
	} 
}
