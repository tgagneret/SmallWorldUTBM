package Signaux;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class button0_0_clicked implements ActionListener { 
	
	JButton bouton;
	
	public button0_0_clicked(JButton bout){
		this.bouton = bout;
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		int coucou = 150;
		
		String chaine = "<html>LO43<br/>" + coucou + "</html>";
		bouton.setText(chaine);		
		
	} 
}
