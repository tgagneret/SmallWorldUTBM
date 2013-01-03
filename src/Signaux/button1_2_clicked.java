package Signaux;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import Map.*;
import Joueur.joueurs_jeu;
import Personnage.Personnage;
import MainWindow.*;

public class button1_2_clicked implements ActionListener { 
	
	MainWindow fen;
	
	public button1_2_clicked(MainWindow fenetre){
	fen = fenetre;
		
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		
		Attaque attaque = new Attaque(fen,1,2);
	} 
}
