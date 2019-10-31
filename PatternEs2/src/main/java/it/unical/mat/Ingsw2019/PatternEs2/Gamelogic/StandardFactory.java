package it.unical.mat.Ingsw2019.PatternEs2.Gamelogic;

public class StandardFactory implements ObjectsFactory {

	public House makeHouse() {
		return new House();
	}
	public Road makeRoad() {
		return new Road();
	}
	public Mall makeMall() {
		return new Mall();
	}

}
 