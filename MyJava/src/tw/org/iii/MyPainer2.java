package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainer2 extends JPanel implements MouseListener{
	private int x0,y0,x1,y1;
	public MyPainer2(){
		setBackground(Color.blue);
		addMouseListener(this);
		x0=y0=x1=y1=-1;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.orange);
		g2d.drawLine(x0, y0, x1, y1);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click:");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x0 = e.getX(); y0=e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX(); y1=e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
		
	}
	
}




