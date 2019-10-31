package it.unical.mat.Ingsw2019.PatternEs2.GameInterface;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unical.mat.Ingsw2019.PatternEs2.Gamelogic.GameManager;
import it.unical.mat.Ingsw2019.PatternEs2.Gamelogic.House;
import it.unical.mat.Ingsw2019.PatternEs2.Gamelogic.Mall;
import it.unical.mat.Ingsw2019.PatternEs2.Gamelogic.Road;



public class Menu extends JPanel {

	/**
	 * 
	 */
	private static int posX=620;
	private static int posY=10;
	private static int width=200;
	private static int height=600;
	
	private static final long serialVersionUID = 1L;
	
	public Menu(){
		super();
		initialize();
		
	}
	public void initialize() {
		setBackground(Color.WHITE);
		setBounds(posX, posY, width, height);
		
		GameManager gm= GameManager.getInstance();
		
		JLabel lbl = gm.factory.makeHouse().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
             public void mousePressed(MouseEvent e) {
                GameManager.getInstance().setToInsert( GameManager.getInstance().factory.makeHouse());
             }
		} );
		add(lbl);
		
		lbl = gm.factory.makeRoad().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
            public void mousePressed(MouseEvent e) {
               GameManager.getInstance().setToInsert( GameManager.getInstance().factory.makeRoad());
            }
		} );
		add(lbl);
		lbl = gm.factory.makeMall().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
            public void mousePressed(MouseEvent e) {
               GameManager.getInstance().setToInsert( GameManager.getInstance().factory.makeMall());
            }
		} );
		add(lbl);
	
	}
		
	
	
	
}
