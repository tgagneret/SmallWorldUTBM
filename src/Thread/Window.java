package Thread;

import MainWindow.MainWindow;
import Map.*;
import MainWindow.*;

public class Window extends Thread{

	MainWindow fen;
	
	public Window(Map carte){
		fen = new MainWindow(carte);
	}
	
	public void run(){
		fen.afficher();
	}
	
	
}
