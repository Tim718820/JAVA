package tw.org.iii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go,stop;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	boolean isRunning;
	
	
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2, 1));
		
		go = new JButton("GO!"); add(go);
		stop = new JButton("Stop"); add(stop);
		for(int i=0; i<lanes.length;i++){
			JLabel lane = new JLabel((i+1)+". ");
			lanes[i] = lane;
			add(lane);	
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
				
			}
		});
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				stopGame();
				
			}
		});
		
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void go(){
		if(!isRunning){
			isRunning = true;
			for(int i=0; i<lanes.length;i++){
				lanes[i].setText((i+1)+". ");
			}
			for(int i=0;i<cars.length;i++){
				cars[i] = new Car(i);
			}
			for(int i=0;i<cars.length;i++){
				cars[i].start();
			}rank = 1;
		}
	}
	private void stopGame(){
		for(Car car:cars){
		car.interrupt();
		}
		isRunning = false;
	}
	private class Car extends Thread{
		private int lane;
		Car(int lane){this.lane=lane;}
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				lanes[lane].setText(lanes[lane].getText()+">");
				try {
					Thread.sleep(10+(int)(Math.random()*200));
				} catch (InterruptedException e) {
					System.out.println(lane + ":OK");
					return;
				}
			}
			lanes[lane].setText(lanes[lane].getText() + "=>Winner");
			stopGame();
		}
	}

	public static void main(String[] args) {
		new Racing();
		

	}

}
