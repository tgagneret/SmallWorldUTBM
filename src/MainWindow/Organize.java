package MainWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Map.*;


import Joueur.Infos_jeu;

public class Organize extends JDialog{

	private ArrayList <Integer> toAdd = new ArrayList<Integer>();
	private ArrayList <Integer> toPull = new ArrayList<Integer>();
	
	private int x;
	private int y;
	
	private MainWindow fen;
	
	/* Box */
	
	Box ajouter = Box.createHorizontalBox();
	Box retirer = Box.createHorizontalBox();
	Box structure = Box.createVerticalBox();
	
	/* Grid */
	GridLayout Gajoute = new GridLayout(1,2);
	GridLayout Gretire = new GridLayout(1,2);
	
	/* Panel */
	
	JPanel content = new JPanel(Gajoute); 
	JPanel content2 = new JPanel(Gretire); 
    JPanel buttonPane = new JPanel();
	
	/* Combo Box */
	
	JComboBox add;
	JComboBox pull;
	
	/* Label */
	
	Label retire = new Label("Boulots à retirer");
	Label ajoute = new Label("Boulots à ajouter");
	
	/* Button */
    JButton valider = new JButton("Valider");

	
	
	 public Organize(MainWindow fenetre,int ligne,int colonne){
		 
		 
			super();
			this.setTitle("Organisation des boulots");
		    this.setSize(350, 175);
		    this.setLocationRelativeTo(null);
		    this.setModal(true);
		    
		    x = ligne;
		    y = colonne;
		    fen = fenetre;

		    valider.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					// On regarde s'il reste au moins un boulot apres la transaction
				if(Map.getInstance().get_case(x, y).get_boulots() - Integer.parseInt(pull.getSelectedItem().toString()) >= 1){
					Map.getInstance().get_case(x, y).add_boulots(-Integer.parseInt(pull.getSelectedItem().toString()));
				}
				else{
					JOptionPane.showMessageDialog(fen,
						    "Il doit rester au moins un boulot par case",
						    "Impossible",
						    JOptionPane.ERROR_MESSAGE);
				}
				
	    		Map.getInstance().get_case(x, y).add_boulots((Integer.parseInt(add.getSelectedItem().toString())));
	    		 
	    		 fen.boutons[x][y].setText(fen.set_button(Map.getInstance().get_case(x, y)));
	    		 fen.set_Joueur();
	    		 cacher();
	    	 }
		    });
		    
		    
		    for(int pulling = 0 ; pulling < Map.getInstance().get_case(ligne, colonne).get_boulots()+1;++pulling){
		    	
		    	toPull.add(pulling);
		    }
		    
		    for(int adding = 0 ; adding < Infos_jeu.getInstance().get_current_joueur().get_perso().get_boulots() +1;++adding){
		    	
		    	toAdd.add(adding);
		    }
		    
		    
		    
			add = new JComboBox(toAdd.toArray());
			pull = new JComboBox(toPull.toArray());
			
			content.add(ajoute);
			content.add(add);
			
			content2.add(retire);
			content2.add(pull);
			
			ajouter.add(content);
			retirer.add(content2);
			
			TitledBorder Tajouter = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Ajouter");
			TitledBorder Tretirer = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Retirer");
		    
			ajouter.setBorder(Tajouter);
			retirer.setBorder(Tretirer);
			
			structure.add(ajouter);
			structure.add(retirer);
			
			this.add(structure);
			
			buttonPane.add(valider);
			
			this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
			
			this.setVisible(true);
			
		     
			
	 }
	 
	 public void afficher(){
		 
		 this.setVisible(true);
		 
	 }
	 
	 public void cacher(){
		 this.setVisible(false);
	 }
	
	
}


