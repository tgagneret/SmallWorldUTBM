package MainWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;

import Joueur.joueurs_jeu;
import Pile.*;

/* Cette fenetre affiche les personnages disponibles */

public class Window_Pile extends javax.swing.JDialog{
	

	/* Title */
	
	 TitledBorder stat_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Pile");
	
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
	 
	 
	 public Window_Pile(){
		super();
		this.setTitle("Pile");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setModal(true);
		
		
		/* Créé une fonction qui genere la fenetre en focntion des persos dispos */

	    content.add(new Label("Personnage"));
	    prix.add(new Label("Cout"));
		prix.add(new Label("Gain"));
		plus.add(new Label("Plus"));

	    
		for(int personnage = 0 ; personnage < Pile.getInstance().get_size() ; ++personnage){
			radio[personnage] = new JRadioButton
					(Pile.getInstance().get_Personnage(personnage).get_peuple().get_nom() + " " + Pile.getInstance().get_Personnage(personnage).get_pouvoir().get_nom());
			group.add(radio[personnage]);
			button[personnage] = new JButton("...");
			
			cout[personnage] = new Label(Integer.toString(personnage));
			gain[personnage] = new Label(Integer.toString(Pile.getInstance().get_credit(personnage)));
			
			content.add(radio[personnage]);
			prix.add(cout[personnage]);
			prix.add(gain[personnage]);
			plus.add(button[personnage]);
	
		}
		
		
	    
		initComponents();
		
		/* Signal Valider */
		
		valider.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				
				int i = 0;
				
				while(radio[i].isSelected() == false){
					++i;
				}
				if (joueurs_jeu.getInstance().get_current_joueur().choisir_perso(i)) {
					cacher();
					maj();
				}
				else{
					valider.setText("valider : Attention");
				}
				
			} 
		});
		
		
	}
	
	private void initComponents(){
		
		radio[0].setSelected(true);
		
		 choix.setBorder(stat_title);
		 

		 choix.add(content);
		 choix.add(prix);
		 choix.add(plus);
		 
		 this.add(choix);
		 
		 buttonPane.add(valider);
		 this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
		
		
	}
	
	/* ++ Fonction qui retire de la liste le personnage choisi */
	
	public void maj(){
			
		content.removeAll();
		prix.removeAll();
		plus.removeAll();

		perso.setRows(perso.getRows() - 1);
		price.setRows(price.getRows() - 1);
		more.setRows(more.getRows() - 1);
		
		content.add(new Label("Personnage"));
		prix.add(new Label("Cout"));
		prix.add(new Label("Gain"));
		plus.add(new Label("Plus"));
		
		for(int personnage = 0 ; personnage < Pile.getInstance().get_size() ; ++personnage){
			radio[personnage].setText(Pile.getInstance().get_Personnage(personnage).get_peuple().get_nom() + " " + Pile.getInstance().get_Personnage(personnage).get_pouvoir().get_nom());
			button[personnage].setText("...");
			
			cout[personnage].setText(Integer.toString(personnage));
			gain[personnage].setText(Integer.toString(Pile.getInstance().get_credit(personnage)));
			
			content.add(radio[personnage]);
			prix.add(cout[personnage]);
			prix.add(gain[personnage]);
			plus.add(button[personnage]);
			
			
		}
		
		radio[0].setSelected(true);

		
	}
	
	
	public void afficher(){
		stat_title.setTitle(joueurs_jeu.getInstance().get_current_joueur().get_name());
		this.validate();
		this.repaint();
		this.setVisible(true);
	}
	
	public void cacher(){
		this.setVisible(false);
	}
	

	
	
	
}
