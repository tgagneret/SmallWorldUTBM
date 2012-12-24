package MainWindow;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NbrJoueurs extends javax.swing.JDialog{
	
	public NbrJoueurs() {
		super();
		this.setTitle("Nombre de Joueurs");
	    this.setSize(300, 150);
	    this.setLocationRelativeTo(null);
	    //this.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
	    
	    Box structure = Box.createVerticalBox();
	    Box joueur = Box.createHorizontalBox();
	    
	    
/* Bouton */
	    
	    JButton valider = new JButton("Valider");
/* Spinner */
	    
	    SpinnerModel choice =
	            new SpinnerNumberModel(2, //initial value
	                                   2, //min
	                                   4, //max
	                                   1);  // pas
	   JSpinner choix = new JSpinner(choice);
	    
/* Label */
	    Label question = new Label("Veuillez choisir le nombre de joueur");
	    Label bienvenue = new Label("Bienvenue sur le jeu Small World UTBM");

/* Panel */
	    
	    JPanel buttonPane = new JPanel();
	    
/* Ajout */
	    
	    buttonPane.add(valider);

	    joueur.add(question);
	    joueur.add(choix);
	    
	    structure.add(bienvenue);
	    structure.add(joueur);
	    
	    this.add(structure);
	    
	    this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
	    
	    
	    /* Signaux */
	    
	   valider.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            validate(evt);
	        }
	    });
	    
	    
	}
	
	    
    private void validate(java.awt.event.ActionEvent evt) {
    	
    	/* CODE */
    	
    }
        
	public void afficher(){		
		this.setVisible(true);
	}
	
	
	
}