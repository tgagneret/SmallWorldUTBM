package Thread;

import MainWindow.MainWindow;
import Map.*;
import MainWindow.*;

public class Window extends Thread{

	MainWindow fen;
	
	public Window(){
		fen = new MainWindow();
	}
	
	public void run(){
		fen.afficher();
	}
	
	
}
