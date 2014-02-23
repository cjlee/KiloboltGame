package kiloboltgame;

import java.awt.Rectangle;

public class Projectile {

//    final int JUMPSPEED = -15;
    
	private int x, y, speedX;
	private boolean visible;
	Rectangle r;

	public Projectile(int startX, int startY) {
		x = startX;
		y = startY;
		speedX =7;
		visible = true;
		r  = new Rectangle(0, 0, 0, 0);
	}
	
	public void update() {
		x += speedX;
		r.setBounds(x,  y,  10, 5);
		if (x > 800) {
			visible = false;
			r = null;
		} else {
			checkCollision();
		}
	}
	
	private void checkCollision() {
		if (r.intersects(StartingClass.hb.r)) {
			visible = false;
			StartingClass.score++;
		}

		if (r.intersects(StartingClass.hb2.r)) {
			visible = false;
			StartingClass.score++;
		}

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
