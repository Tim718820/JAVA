package tw.org.iii;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool extends JPanel{
	private Ball ball;
	private Timer timer;
	private int viewW,viewH,dx,dy;
	public MyPool(){
		timer = new Timer();
		ball = new Ball();
		dx = dy = 10;
		timer.schedule(ball, 1000 ,60);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		viewW = getWidth(); viewH = getHeight();
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0,0,viewW,viewH);
		
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(ball.x,ball.y,40,40);
	}
	private class Ball extends TimerTask{
		int x,y;
		@Override
		public void run() {
			if (x<0 || x+40 > viewW){
				dx *=-1;
			}
			if (y<0 || y+40 > viewH){
				dy *=-1;
			}
			x += dx;
			y += dy;
			
			repaint();
			
		}
	}

}
