package MainWindow;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MainWindow extends javax.swing.JFrame{

	public MainWindow() {
		super();
		this.setTitle("Small World UTBM");
	    this.setSize(900, 450);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    //this.setVisible(true);
	    
	    /* Box */
	    Box hb = Box.createHorizontalBox();
	    Box myPerso = Box.createVerticalBox();
	    
	    /* Barre d'état */
	    JLabel status = new JLabel();
	    status.setBorder(new EtchedBorder());
	    status.setText("C'est au joueur :");
	    
	    
/* Boutons */
	    
	    /* Cases (groupées par ligne)*/

	    JButton bouton0_0 = new JButton("LO43");
	    JButton bouton0_1 = new JButton("MT45") ;
	    JButton bouton0_2 = new JButton("GE06");
	    JButton bouton0_3 = new JButton("LE03");
	    JButton bouton0_4 = new JButton("PS22");
	    JButton bouton0_5 = new JButton("MG00");
	    
	    JButton bouton1_0 = new JButton("LO43");
	    JButton bouton1_1 = new JButton("MT45");
	    JButton bouton1_2 = new JButton("GE06");
	    JButton bouton1_3 = new JButton("LE03");
	    JButton bouton1_4 = new JButton("PS22");
	    JButton bouton1_5 = new JButton("MG00");
	    
	    JButton bouton2_0 = new JButton("LO43");
	    JButton bouton2_1 = new JButton("MT45");
	    JButton bouton2_2 = new JButton("GE06");
	    JButton bouton2_3 = new JButton("LE03");
	    JButton bouton2_4 = new JButton("PS22");
	    JButton bouton2_5 = new JButton("MG00");
	    
	    JButton bouton3_0 = new JButton("LO43");
	    JButton bouton3_1 = new JButton("MT45");
	    JButton bouton3_2 = new JButton("GE06");
	    JButton bouton3_3 = new JButton("LE03");
	    JButton bouton3_4 = new JButton("PS22");
	    JButton bouton3_5 = new JButton("MG00");
	    
	    /* Options */
	    
	    JButton declin = new JButton("Passer en déclin");
	    declin.setFont((new Font("TimesRoman", Font.BOLD, 14)));
	    
	    /* Boutons oui et non */
	    
	    JButton oui = new JButton("Oui");
	    JButton non = new JButton("Non");
	    
	    
/* Label */
	    
	    /* Fixe */
	    
	    Label boulots = new Label("Boulots : ");  
	    Label personnage = new Label("Personnages : ");
	    Label personnage_declin = new Label("Personnages en déclin : ");
	    Label credits = new Label("Crédits : ");
	    
	    /* A modifier */
	    
	    Label nbr_boulots = new Label("0");
	    Label perso = new Label("Aucun"); 
	    Label perso_declin = new Label("Aucun");
	    Label nbr_credits = new Label("Aucun");
	    
	    Label question = new Label("Question");
	    
	    /* Grid */
	   GridLayout grid = new GridLayout(4,6);
	   GridLayout stats = new GridLayout(4,2);
	   GridLayout actions = new GridLayout(0,1);
	   GridLayout choice = new GridLayout (0,2);
	   
	   /* Pannel */
	    JPanel content = new JPanel(grid); 
	    JPanel stat = new JPanel(stats);
	    JPanel action = new JPanel(actions);
	    JPanel choix = new JPanel(choice);
	    
/* Grid content */	    
	    
	    TitledBorder map_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Map");
	    content.setBorder(map_title);
	    
	   /* 1ere ligne */
	    content.add(bouton0_0);
	    content.add(bouton0_1);
	    content.add(bouton0_2);
	    content.add(bouton0_3);
	    content.add(bouton0_4);
	    content.add(bouton0_5);
	    
	    
	    /* 2eme ligne */
	    content.add(bouton1_0);
	    content.add(bouton1_1);
	    content.add(bouton1_2);
	    content.add(bouton1_3);
	    content.add(bouton1_4);
	    content.add(bouton1_5);
	    
	    /* 3eme ligne */
	    content.add(bouton2_0);
	    content.add(bouton2_1);
	    content.add(bouton2_2);
	    content.add(bouton2_3);
	    content.add(bouton2_4);
	    content.add(bouton2_5);
	    
	    /* 4eme ligne */
	    content.add(bouton3_0);
	    content.add(bouton3_1);
	    content.add(bouton3_2);
	    content.add(bouton3_3);
	    content.add(bouton3_4);
	    content.add(bouton3_5);

/* Grid choix */
	    choix.add(oui);
	    choix.add(non);
	    
/* Grid stat */
	    
	    TitledBorder stat_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Mon Personnage");
	    stat.setBorder(stat_title);
	    
	    stat.add(boulots);
	    stat.add(nbr_boulots);
	    stat.add(personnage);
	    stat.add(perso);
	    stat.add(personnage_declin);
	    stat.add(perso_declin);
	    stat.add(credits);
	    stat.add(nbr_credits);
	    
	    
/* Grid action */
	    
	    TitledBorder action_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Mes actions");
	    action.setBorder(action_title);
	    
	    action.add(question);
	    action.add(choix);
	 

	    
/* Ajout */
	    
	    myPerso.add(stat);
	    myPerso.add(action);
	    
	    hb.add(content);
	    hb.add(myPerso);
	    
	    this.add(hb);
	    
	    
	    this.getContentPane().add(status,BorderLayout.SOUTH);
	   
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	public void afficher(){		
		this.setVisible(true);
	}

}
