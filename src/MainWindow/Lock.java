package MainWindow;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Joueur.joueurs_jeu;

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
	
	public Lock() {
		super();
		this.setTitle("Choix des cases à verouiller");
	    this.setSize(400, 150);
	    this.setLocationRelativeTo(null);
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
		
	}
	
	public void afficher(){
		this.setVisible(true);
	}
	
	public void cacher(){
		this.setVisible(false);
	}
	
	
	
	
}
