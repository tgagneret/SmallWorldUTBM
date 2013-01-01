package Thread;

import Joueur.*;
import MainWindow.MainWindow;
import MainWindow.NbrJoueurs;
import Map.*;
import MainWindow.*;

public class Window extends Thread{

	MainWindow fen = new MainWindow();
	
	
	public Window(){

	}
	
	public void run(){
		
		fen.set_Joueur();
		fen.afficher();
		
	}
	
	public MainWindow get_Window(){
		
		return fen;
		
	}
	
	
}
