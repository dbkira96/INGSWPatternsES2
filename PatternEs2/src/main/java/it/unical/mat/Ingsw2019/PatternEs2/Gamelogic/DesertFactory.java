package it.unical.mat.Ingsw2019.PatternEs2.Gamelogic;

public class DesertFactory implements ObjectsFactory {

	public Road makeRoad() {
		return new Road();
	}

	public House makeHouse() {
		
		return new DesertHouse();
	}


	public Mall makeMall() {
		
		return new DesertMall();
	}
}
