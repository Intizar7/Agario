package tr.org.linux.kamp.game;

import java.awt.Color;

import tr.org.linux.kamp.game.logic.GameLogic;
import tr.org.linux.kamp.game.model.Difficulty;

public class AgarioCloneApp {
	
	public static void main(String[] args) {
		GameLogic gameLogic=new GameLogic("",Color.BLUE,Difficulty.EISY);
		gameLogic.startApplication();
		
	}

}
