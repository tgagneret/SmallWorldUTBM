package Signaux;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class button1_0_clicked implements ActionListener { 
	
	JButton bouton;
	
	public button1_0_clicked(JButton bout){
		this.bouton = bout;
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		/* CODE */	
		bouton.setLabel("test test test");
		
	} 
}
