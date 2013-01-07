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
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Joueur.joueurs_jeu;
import Map.Map;

public class Lock extends javax.swing.JDialog{

	
	private ArrayList <String> toLock = new ArrayList<String>();
	
	/* Box */
	Box verrouille = Box.createHorizontalBox();
	
	/*Combo Box */
	
	JComboBox Case1;
	JComboBox Case2;
	
	/* Label */
	Label case1 = new Label("Premiere case à verrouiller");
	Label case2 = new Label("Deuxieme case à verrouiller");
	
	/* Grid */
	GridLayout locked = new GridLayout(2,2);
	
	/* Pannel */
	JPanel content = new JPanel(locked); 
	JPanel buttonPane = new JPanel();
	
	/* Button */
    JButton valider = new JButton("Valider");
	
	public Lock() {
		super();
		this.setTitle("Choix des cases à verouiller");
	    this.setSize(400, 150);
	    this.setLocationRelativeTo(null);
	    this.setModal(true);
	    //this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	    initComponents();
	}
	
	private void initComponents(){
		 TitledBorder lock_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Cases à verrouiller");
		 
		toLock = joueurs_jeu.getInstance().get_current_joueur().get_Cases();
		Case1 = new JComboBox(toLock.toArray());
		Case2 = new JComboBox(toLock.toArray());
		
		content.add(case1);
		content.add(Case1);
		content.add(case2);
		content.add(Case2);
		
		verrouille.setBorder(lock_title);
		verrouille.add(content);
		
		this.add(verrouille);
		
		buttonPane.add(valider);
		
		this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
		
		valider.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
    		
				String nom;
				int niveau;
				
				if(Case1.getSelectedItem() != null){
					nom = Case1.getSelectedItem().toString().substring(0, 2); 
					niveau = Integer.parseInt(Case1.getSelectedItem().toString().substring(2));
					
					Map.getInstance().return_case(nom, niveau).set_lock(true);
				}
				
				
				if(Case2.getSelectedItem() != null){
					nom = Case2.getSelectedItem().toString().substring(0, 2); 
					niveau = Integer.parseInt(Case2.getSelectedItem().toString().substring(2));
				
					Map.getInstance().return_case(nom, niveau).set_lock(true);
				}
				
				cacher();
				
    	 }
	    });
		
	}
	
	public void afficher(){
		this.setVisible(true);
	}
	
	public void cacher(){
		this.setVisible(false);
	}
	
	
	
	
}
