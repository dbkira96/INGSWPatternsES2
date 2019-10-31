package it.unical.mat.Ingsw2019.PatternEs2.Gamelogic;

import java.awt.EventQueue;



import it.unical.mat.Ingsw2019.PatternEs2.GameInterface.GameWindow;

public class GameManager {
	private static int GameType=1;
	
	protected static GameManager singleton =null;
	
	public static GameWindow window;
	private GameObject toInsert=null;
	public ObjectsFactory factory =null;
	
	private GameManager() {
		if (GameType==0)
			factory= new StandardFactory();
		else if (GameType ==1)
			factory = new SnowFactory();
		else 
			factory =new DesertFactory();
	}
	
	public static GameManager getInstance() {
		if(singleton==null) {
			singleton = new GameManager();
		}
		return singleton;
	}

	public GameObject getToInsert() {
		return toInsert;
	}

	public void setToInsert(GameObject toInsert) {
		this.toInsert = toInsert;
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new GameWindow();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
