package tr.org.linux.kamp.game.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import tr.org.linux.kamp.game.model.GameObject;

public class GamePanel extends JPanel{
	
	private ArrayList<GameObject> gameObject;
	//dinamik bit bellekte tanımladık
	
	public GamePanel(ArrayList<GameObject> gameObject) {
		this.gameObject=gameObject;
	}
	@Override
	protected synchronized void paintComponent(Graphics g) { 
		//(synchronized) aynı anda farklı iş parçacıklarını senkronize edebilir
		super.paintComponent(g);
		
		Graphics2D g2d=(Graphics2D)g;
		
		for(GameObject gameObject: gameObject) {// c# deki gibi foeach kullanımı
			gameObject.draw(g2d);
		}
	}
}
