package it.unical.mat.Ingsw2019.PatternEs2.Gamelogic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObject {
	
	
	
	public String imgFile() {
		return "stub.png";
	}
	public JLabel makeLabel() {
		JLabel lbl = new JLabel("");
		//lbl.setIcon(new ImageIcon(getClass().getResource("../../../../../../"+imgFile())));
		lbl.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\main\\resources\\"+imgFile()));
		return lbl;
	}
}
