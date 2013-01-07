package MainWindow;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
	
	private boolean organiser = false;

	/* Création des composants */
	
	/* Box */
    Box hb = Box.createHorizontalBox();
    Box myPerso = Box.createVerticalBox();

    
    /* Menu bar*/
    
    JMenuBar barre = new JMenuBar();
    
    JMenu jeu = new JMenu("Jeu");
    
    JMenuItem aide = new JMenuItem("Aide",
            KeyEvent.VK_A);
    JMenuItem myperso = new JMenuItem("Mon personnage",
            KeyEvent.VK_P);

    
    
    
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
	   myperso.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
	   myperso.getAccessibleContext().setAccessibleDescription("Information sur votre personnage");
	   
	   jeu.add(aide);
	   jeu.add(myperso);
	    
	setJMenuBar(barre);

	/* Barre des statuts */
	    
	    status.setBorder(new EtchedBorder());
	
	    
	    status.setText("Debut de la partie");

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
	  
	  /* Signal myperso */
	  
	
	 myperso.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				
				String infos = joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots() + " boulots\n" +
						joueurs_jeu.getInstance().get_current_joueur().get_perso().get_peuple().get_description() + "\n" + 
						joueurs_jeu.getInstance().get_current_joueur().get_perso().get_pouvoir().get_description();
				
				JOptionPane.showMessageDialog(rootPane,
					    infos,
					    joueurs_jeu.getInstance().get_current_joueur().get_perso().get_name(),
					    JOptionPane.INFORMATION_MESSAGE);
				
				
				
			} 
		});
	  
	  /* Signaux cases*/
	  
	 
	  for (int lignes = 0 ; lignes < 4 ; lignes++){
	    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
	    		
	    		boutons[lignes][colonnes].addActionListener(new Case_clicked(this,lignes,colonnes));				    				
	    	}
		}
	   
	  
	  
		
	}
	
	
	/* Génération texte bouton */
	
	public String set_button(Case place){
		
			String texte;
			String joueur;
			String niveau;
			
		if(place.get_joueur() == null){
			joueur = "aucun";
		}
		else{
			joueur = place.get_joueur().get_name();
		}
		if(place.get_niveau() < 10){
			niveau = "0" + String.valueOf(place.get_niveau());
		}
		else{
			niveau =  String.valueOf(place.get_niveau());
		}
		
		texte = "<html>" + place.get_nom() + niveau  + " (" + place.get_type() + ") " +
		"<br>Boulots : " + place.get_boulots() + "<br>Joueur: "+ joueur + "</html>";
		
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
		
		if(joueurs_jeu.getInstance().get_current_joueur() == null){
			nbr_boulots.setText("");
			perso.setText("");
			nbr_credits.setText("");
			status.setText("");
		}
		else{
			
			nbr_boulots.setText(Integer.toString(joueurs_jeu.getInstance().get_current_joueur().get_perso().get_boulots()));
			perso.setText(joueurs_jeu.getInstance().get_current_joueur().get_perso().get_name());
			nbr_credits.setText(Integer.toString(joueurs_jeu.getInstance().get_current_joueur().get_credits()));
			status.setText("<html><pre>Tour : " + joueurs_jeu.getInstance().get_tour() +
					"\t\tC'est au joueur : " + joueurs_jeu.getInstance().get_current_joueur().get_name() + "</pre></html>");
			
			if(joueurs_jeu.getInstance().get_current_joueur().get_perso_declin() != null){
				perso_declin.setText(joueurs_jeu.getInstance().get_current_joueur().get_perso_declin().get_name());
			}
			else{
				perso_declin.setText("Aucun");
			}
			
			for (int lignes = 0 ; lignes < 4 ; lignes++){
		    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
		    		boutons[lignes][colonnes].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    		if(Map.getInstance().get_case(lignes, colonnes).get_joueur() != null &&
		    				Map.getInstance().get_case(lignes, colonnes).get_joueur().get_name()
		    				.equals(joueurs_jeu.getInstance().get_current_joueur().get_name())){
		    			boutons[lignes][colonnes].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
		    		}
		    	}
			
			}
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
	
	
	public void update_buttons(){
		for (int lignes = 0 ; lignes < 4 ; lignes++){
	    	for(int colonnes = 0 ; colonnes <6 ; colonnes++){
	    		
	    		boutons[lignes][colonnes].setText(set_button(Map.getInstance().get_case(lignes, colonnes)));				    				
	    	}
		}
	}
	
	/* Affichage */
	
	public void afficher(){		
		this.setVisible(true);
	}
	
	public void set_mode(boolean mode){
		organiser = mode;
	}
	
	public boolean get_mode(){
		return organiser;
	}
	

}
