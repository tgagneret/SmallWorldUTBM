package MainWindow;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import Signaux.*;
import Case.Case;
import Map.*;
import java.util.ArrayList;


public class MainWindow extends javax.swing.JFrame{

	
/* Création des composants */
	
	/* Box */
    Box hb = Box.createHorizontalBox();
    Box myPerso = Box.createVerticalBox();
    
    /* Menu bar*/
    
    JMenuBar barre = new JMenuBar();
    
    JMenu jeu = new JMenu("Jeu");
    
    JMenuItem aide = new JMenuItem("Aide",
            KeyEvent.VK_T);

    
    
    
    /* Barre d'état */
    JLabel status = new JLabel();   
    
    	/* Boutons */
    
    /* Cases (groupées par ligne)*/
    
    /* Creer une fonction qui renvoie un string a partir de l'UV choisie (avec html)*/

    JButton bouton0_0 = new JButton();
    JButton bouton0_1 = new JButton();
    JButton bouton0_2 = new JButton();
    JButton bouton0_3 = new JButton();
    JButton bouton0_4 = new JButton();
    JButton bouton0_5 = new JButton();
    
    JButton bouton1_0 = new JButton();
    JButton bouton1_1 = new JButton();
    JButton bouton1_2 = new JButton();
    JButton bouton1_3 = new JButton();
    JButton bouton1_4 = new JButton();
    JButton bouton1_5 = new JButton();
    
    JButton bouton2_0 = new JButton();
    JButton bouton2_1 = new JButton();
    JButton bouton2_2 = new JButton();
    JButton bouton2_3 = new JButton();
    JButton bouton2_4 = new JButton();
    JButton bouton2_5 = new JButton();
    
    JButton bouton3_0 = new JButton();
    JButton bouton3_1 = new JButton();
    JButton bouton3_2 = new JButton();
    JButton bouton3_3 = new JButton();
    JButton bouton3_4 = new JButton();
    JButton bouton3_5 = new JButton();
    
    /* Options */
    
    JButton declin = new JButton("Passer en déclin");
    
    
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

   
   JButton[][] boutons = new JButton [4][6];
   
	public MainWindow() {
		super();
		this.setTitle("Small World UTBM");
	    this.setSize(1200, 650);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    initComponents();
	    
		
/* Generer le texte des boutons et les ajoutes à la grille*/
	    
	    for (int lignes = 0 ; lignes < 4 ; lignes++){
	    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
	    		
	    		boutons[lignes][colonnes].setText(set_button(Map.getInstance().get_case(lignes, colonnes)));
	    		content.add(boutons[lignes][colonnes]);
	    		
	    	}
	    }
	    
	}    
	    
	
	/* Organisations des composants */
	
	private void initComponents(){
		
	/* On ajoute les boutons au tableau */	
		
		boutons[0][0] = bouton0_0;
	    boutons[0][1] = bouton0_1;
	    boutons[0][2] = bouton0_2;
	    boutons[0][3] = bouton0_3;
	    boutons[0][4] = bouton0_4;
	    boutons[0][5] = bouton0_5;
	    
	    boutons[1][0] = bouton1_0;
	    boutons[1][1] = bouton1_1;
	    boutons[1][2] = bouton1_2;
	    boutons[1][3] = bouton1_3;
	    boutons[1][4] = bouton1_4;
	    boutons[1][5] = bouton1_5;
	    
	    boutons[2][0] = bouton2_0;
	    boutons[2][1] = bouton2_1;
	    boutons[2][2] = bouton2_2;
	    boutons[2][3] = bouton2_3;
	    boutons[2][4] = bouton2_4;
	    boutons[2][5] = bouton2_5;
	    
	    boutons[3][0] = bouton3_0;
	    boutons[3][1] = bouton3_1;
	    boutons[3][2] = bouton3_2;
	    boutons[3][3] = bouton3_3;
	    boutons[3][4] = bouton3_4;
	    boutons[3][5] = bouton3_5;
	 

	    
	/* Grid content */	    
	    
	    TitledBorder map_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Map");
	    content.setBorder(map_title);

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
	 
	 /* Menu bar */
	    
	    jeu.setMnemonic(KeyEvent.VK_J);
	    jeu.getAccessibleContext().setAccessibleDescription(
	            "Option du jeu");
	    barre.add(jeu);
	    

	   aide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
	   aide.getAccessibleContext().setAccessibleDescription("Aide pour le jeu");
	   jeu.add(aide);
	    
	setJMenuBar(barre);

	/* Barre des statuts */
	    
	    status.setBorder(new EtchedBorder());
	    status.setText("C'est au joueur :");

	/* Boutons */
	    declin.setFont((new Font("TimesRoman", Font.BOLD, 14)));
	    
	    
	/* Ajout */
	    
	    myPerso.add(stat);
	    myPerso.add(action);
	    
	    hb.add(content);
	    hb.add(myPerso);
	    
	    this.add(hb);
	    
	    this.getContentPane().add(status,BorderLayout.SOUTH);
	    
	/* Signaux */
	   
	    
	  /* Signal oui */
	    oui.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				// code 
			} 
		}); 
	    
	  /* Signal non */
	  non.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				// code 
			} 
		});
	  
	  /* Signal aide */
	  
	  aide.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				/* CODE */
			} 
		}); 
	  
	  /* Signaux cases*/
	  
	  bouton0_0.addActionListener(new button0_0_clicked(bouton0_0));
	  bouton0_1.addActionListener(new button0_1_clicked(bouton0_1));
	  bouton0_2.addActionListener(new button0_2_clicked(bouton0_2));
	  bouton0_3.addActionListener(new button0_3_clicked(bouton0_3));
	  bouton0_4.addActionListener(new button0_4_clicked(bouton0_4));
	  bouton0_5.addActionListener(new button0_5_clicked(bouton0_5));
	  
	  bouton1_0.addActionListener(new button1_0_clicked(bouton1_0));
	  bouton1_1.addActionListener(new button1_1_clicked(bouton1_1));
	  bouton1_2.addActionListener(new button1_2_clicked(bouton1_2));
	  bouton1_3.addActionListener(new button1_3_clicked(bouton1_3));
	  bouton1_4.addActionListener(new button1_4_clicked(bouton1_4));
	  bouton1_5.addActionListener(new button1_5_clicked(bouton1_5));
	  
	  bouton2_0.addActionListener(new button2_0_clicked(bouton2_0));
	  bouton2_1.addActionListener(new button2_1_clicked(bouton2_1));
	  bouton2_2.addActionListener(new button2_2_clicked(bouton2_2));
	  bouton2_3.addActionListener(new button2_3_clicked(bouton2_3));
	  bouton2_4.addActionListener(new button2_4_clicked(bouton2_4));
	  bouton2_5.addActionListener(new button2_5_clicked(bouton2_5));
	  
	  bouton3_0.addActionListener(new button3_0_clicked(bouton3_0));
	  bouton3_1.addActionListener(new button3_1_clicked(bouton3_1));
	  bouton3_2.addActionListener(new button3_2_clicked(bouton3_2));
	  bouton3_3.addActionListener(new button3_3_clicked(bouton3_3));
	  bouton3_4.addActionListener(new button3_4_clicked(bouton3_4));
	  bouton3_5.addActionListener(new button3_5_clicked(bouton3_5));
	   
		
	}
	
	
	/* Génération texte bouton */
	
	public String set_button(Case place){
		
		/* CODE pour generer le texte sur un bouton */
		
		String texte = "<html>" + place.get_nom() + place.get_niveau() + 
				"<br>Boulots : 0<br>Joueur: aucun" + "</html>";
		
		return texte;
		
	}
	
	/* Verouille les boutons */
	
	public void lock_buttons(boolean lock){
		
		for (int lignes = 0 ; lignes < 4 ; lignes++){
	    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
	    		
	    		boutons[lignes][colonnes].setEnabled(lock);	    				
	    	}
		}    	
		
	}
	
	
	/* Affichage */
	
	public void afficher(){		
		this.setVisible(true);
	}

}
