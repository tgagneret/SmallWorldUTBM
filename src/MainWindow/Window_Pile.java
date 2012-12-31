package MainWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JRadioButton;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import Pile.*;

/* Cette fenetre affiche les personnages disponibles */

public class Window_Pile extends javax.swing.JDialog{

	/* Box */
	 
	Box choix = Box.createHorizontalBox();
	 
	/* Grid */
	GridLayout perso = new GridLayout(11,1);
	GridLayout price = new GridLayout(11,2);
	GridLayout more = new GridLayout(11,1);
	
	   
	/* Pannel */
	JPanel content = new JPanel(perso); 
	JPanel prix = new JPanel(price);
	JPanel plus = new JPanel(more);

	
	
	/* Radio Button */
	
	JRadioButton [] radio = new JRadioButton[10];

	
	/* Button */
	
	 JButton [] button = new JButton[10]; /* Bouton qui servira à avoir plus de détail sur le personnage */

	 JButton valider = new JButton("Valider");
	 
	 /* Label */
	 
	 Label [] cout = new Label [10];
	 Label [] gain = new Label [10];
	 
	 /* Panel */
	 JPanel buttonPane = new JPanel();
	 
	/* Groupe (radio button)*/
	 
	 ButtonGroup group = new ButtonGroup();
	 
	 
	 public Window_Pile(Pile pile){
		super();
		this.setTitle("Pile");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
	    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		/* Créé une fonction qui genere la fenetre en focntion des persos dispos */
		
	    content.add(new Label("Personnage"));
	    prix.add(new Label("Cout"));
		prix.add(new Label("Gain"));
		plus.add(new Label("Plus"));

	    
		for(int personnage = 0 ; personnage < 10 ; ++personnage){
			radio[personnage] = new JRadioButton
					(pile.get_Personnage(personnage).get_peuple().get_nom() + " " + pile.get_Personnage(personnage).get_pouvoir().get_nom());
			group.add(radio[personnage]);
			button[personnage] = new JButton("...");
			
			cout[personnage] = new Label(Integer.toString(pile.get_credit(personnage)));
			gain[personnage] = new Label("0");
			
			content.add(radio[personnage]);
			prix.add(cout[personnage]);
			prix.add(gain[personnage]);
			plus.add(button[personnage]);
		}
		
		
		initComponents();
		this.setVisible(true);
		
	}
	
	private void initComponents(){
		

		
			
		
		 TitledBorder stat_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Pile");
		 choix.setBorder(stat_title);
		 

		 choix.add(content);
		 choix.add(prix);
		 choix.add(plus);
		 
		 this.add(choix);
		 
		 buttonPane.add(valider);
		 this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
		
		
	}
	
	
}
