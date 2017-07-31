package tr.org.linux.kamp.game.model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Enemy extends GameObject{

	
	private int speed;
	public Enemy(int x, int y, int radius, Color color, int speed) {
		super(x, y, radius, color);
		this.speed = speed;
	
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	  @Override
		public void setRadius(int radius) {
			// TODO Auto-generated method stub
			super.setRadius(radius);
			if(getRadius()<5) {
				setRadius(5);
			}else if(getRadius()>250) {
				setRadius(250);
			}
			
		}
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		super.draw(g2d);
	}
}
