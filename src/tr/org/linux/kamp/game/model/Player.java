package tr.org.linux.kamp.game.model;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


//player 10 saniye sabit kalırsa küçülsun


public class Player extends GameObject {
	
	private String playerName;
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	private BufferedImage image;
	
	public Player(int x, int y, int radius, Color color, int speed,String playerName) {
		super(x, y, radius, color);
		this.speed = speed;
		this.playerName=playerName;
		try {
			image = ImageIO.read(getClass().getResource("/player.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	public String getName() {
		return playerName;
	}

	public void setName(String name) {
		this.playerName = name;
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		super.draw(g2d);
		g2d.setColor(Color.PINK);
		//g2d.drawImage(image, getX(), getY(), getRadius(), getRadius(), null);
	    FontMetrics	fontMetrics = g2d.getFontMetrics(g2d.getFont());
	    int width=fontMetrics.stringWidth(playerName);
	    int nameX=getX()+(getRadius()-width)/2;
	    int nameY=getY()-fontMetrics.getHeight();
	    g2d.drawString(playerName,nameX,nameY);
	    
//		g2d.drawString(this.playerName, getX()+getRadius()/2-playerName.length()/2*8, getY()+getRadius()/2);
	}
	
	

}
