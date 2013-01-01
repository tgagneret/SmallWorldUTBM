package Signaux;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import Map.*;
import Joueur.joueurs_jeu;
import Personnage.Personnage;
import MainWindow.Attaque;

public class button0_0_clicked implements ActionListener { 
	
	JButton bouton;
	
	public button0_0_clicked(JButton bout){
		this.bouton = bout;
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		Attaque attaque = new Attaque(bouton);
		
	} 
}
