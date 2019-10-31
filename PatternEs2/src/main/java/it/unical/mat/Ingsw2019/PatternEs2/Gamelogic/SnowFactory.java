package it.unical.mat.Ingsw2019.PatternEs2.Gamelogic;

public class SnowFactory implements ObjectsFactory {

	
	public House makeHouse() {
	
		return new SnowHouse();
	}

	
	public Road makeRoad() {
	
		return new SnowRoad();
	}

	
	public Mall makeMall() {
	
		return new SnowMall();
	}

}
