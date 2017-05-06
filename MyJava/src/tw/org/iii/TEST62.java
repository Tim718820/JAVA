package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TEST62 extends JFrame{
	private MyClock myClock;
	private MyPool myPool;
	TEST62(){
		setLayout(new BorderLayout());
		
		myClock = new MyClock();
		add(myClock,BorderLayout.NORTH);
		myPool = new MyPool();
		add(myPool,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new TEST62();

	}

}
