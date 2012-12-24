package MainWindow;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow extends javax.swing.JFrame{

	public MainWindow() {
		super();
		this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    //this.setVisible(true);
	    
	    /* Boutons */
	    JButton bouton0_0 = new JButton("LO43");
	    JButton bouton0_1 = new JButton("MT45");
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
	    
	    
	    
        /* Label */
	    Label test = new Label("Hi There!");
	    
	   GridLayout grid = new GridLayout(7,4);
	    JPanel content = new JPanel(grid); 
	   /* 1ere ligne */
	    content.add(bouton0_0);
	    content.add(bouton0_1);
	    content.add(bouton0_2);
	    content.add(bouton0_3);
	    content.add(bouton0_4);
	    content.add(bouton0_5);
	    content.add(test);
	    
	    /* 2eme ligne */
	    content.add(bouton1_0);
	    content.add(bouton1_1);
	    content.add(bouton1_2);
	    content.add(bouton1_3);
	    content.add(bouton1_4);
	    content.add(bouton1_5);
	    content.add(test);
	    
	    
	    
	    this.add(content);
	    
	}
	
	
	public void afficher(){		
		this.setVisible(true);
	}

}
