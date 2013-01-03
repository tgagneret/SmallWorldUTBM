package MainWindow;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import Pile.Pile;
import Signaux.*;
import Case.Case;
import Map.*;
import Joueur.*;
import java.util.ArrayList;


public class MainWindow extends javax.swing.JFrame{

	
/* Permet de recuperer les reponses au questions */	

	private boolean yes = false;
	private boolean no = false;
	
	
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

	}    
	
	/* Organisations des composants */
	
	private void initComponents(){
		
	/* On créé les boutons dans le tableau */	
		
		for (int lignes = 0 ; lignes < 4 ; lignes++){
	    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
	    		
	    		boutons[lignes][colonnes] = new JButton(set_button(Map.getInstance().get_case(lignes, colonnes)));
	    		content.add(boutons[lignes][colonnes]);
	    		
	    	}
	    }
		
		
	    
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
				yes = true; 
			} 
		}); 
	    
	  /* Signal non */
	  non.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				no = true;
			} 
		});
	  
	  /* Signal aide */
	  
	  aide.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				/* CODE */
			} 
		}); 
	  
	  /* Signaux cases*/
	  
	  boutons[0][0].addActionListener(new button0_0_clicked(boutons[0][0]));
	  boutons[0][1].addActionListener(new button0_1_clicked(boutons[0][1]));
	  boutons[0][2].addActionListener(new button0_2_clicked(boutons[0][2]));
	  boutons[0][3].addActionListener(new button0_3_clicked(boutons[0][3]));
	  boutons[0][4].addActionListener(new button0_4_clicked(boutons[0][4]));
	  boutons[0][5].addActionListener(new button0_5_clicked(boutons[0][5]));
	  
	  boutons[1][0].addActionListener(new button1_0_clicked(boutons[1][0]));
	  boutons[1][1].addActionListener(new button1_1_clicked(boutons[1][1]));
	  boutons[1][2].addActionListener(new button1_2_clicked(boutons[1][2]));
	  boutons[1][3].addActionListener(new button1_3_clicked(boutons[1][3]));
	  boutons[1][4].addActionListener(new button1_4_clicked(boutons[1][4]));
	  boutons[1][5].addActionListener(new button1_5_clicked(boutons[1][5]));
	  
	  boutons[2][0].addActionListener(new button2_0_clicked(boutons[2][0]));
	  boutons[2][1].addActionListener(new button2_1_clicked(boutons[2][1]));
	  boutons[2][2].addActionListener(new button2_2_clicked(boutons[2][2]));
	  boutons[2][3].addActionListener(new button2_3_clicked(boutons[2][3]));
	  boutons[2][4].addActionListener(new button2_4_clicked(boutons[2][4]));
	  boutons[2][5].addActionListener(new button2_5_clicked(boutons[2][5]));
	  
	  boutons[3][0].addActionListener(new button3_0_clicked(boutons[3][0]));
	  boutons[3][1].addActionListener(new button3_1_clicked(boutons[3][1]));
	  boutons[3][2].addActionListener(new button3_2_clicked(boutons[3][2]));
	  boutons[3][3].addActionListener(new button3_3_clicked(boutons[3][3]));
	  boutons[3][4].addActionListener(new button3_4_clicked(boutons[3][4]));
	  boutons[3][5].addActionListener(new button3_5_clicked(boutons[3][5]));
	   
		
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
	
	/* Questions */
	
	
	
	/* Genere les informations concernant le joueur */
	public void set_Joueur(){
		
		nbr_boulots.setText(Integer.toString(joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots()));
		perso.setText(joueurs_jeu.getInstance().get_current_joueur().get_perso().get_name());
		nbr_credits.setText(Integer.toString(joueurs_jeu.getInstance().get_current_joueur().get_credits()));
		status.setText("C'est au joueur : " + joueurs_jeu.getInstance().get_current_joueur().get_name());
		
		if(joueurs_jeu.getInstance().get_current_joueur().get_perso_declin() != null){
			perso_declin.setText(joueurs_jeu.getInstance().get_current_joueur().get_perso_declin().get_name());
		}
		else{
			perso_declin.setText("Aucun");
		}
		
		
	}
	
	
	public boolean get_answer(String quest){
		question.setText(quest);
		while(yes == false && no == false){
			
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException caught"); 
			}
			
		}
		
		if(yes == true){
			yes = false;
			return true;
		}
		else{
			no = false;
			return false;
		}
		
	}
	
	/* Affichage */
	
	public void afficher(){		
		this.setVisible(true);
	}

}
